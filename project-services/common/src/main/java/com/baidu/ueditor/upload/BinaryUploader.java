package com.baidu.ueditor.upload;

import cn.happymall.modules.oss.cloud.OSSFactory;
import com.baidu.ueditor.PathFormat;
import com.baidu.ueditor.define.AppInfo;
import com.baidu.ueditor.define.BaseState;
import com.baidu.ueditor.define.FileType;
import com.baidu.ueditor.define.State;
import org.apache.commons.fileupload.FileItemIterator;
import org.apache.commons.fileupload.FileItemStream;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class BinaryUploader {

	/**
	 *  modify by dr.wang at 2017-10-31 23:00 整合到Spring MVC，解决上传“文件未找到”问题，并整合上传文件到云存储
	 */
	public static final State save(HttpServletRequest request, Map<String, Object> conf) {

		try {
			MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
			MultipartFile multipartFile = multipartRequest.getFile(conf.get("fieldName").toString());

			String savePath = (String) conf.get("savePath");
			String originFileName = multipartFile.getOriginalFilename();
			String suffix = FileType.getSuffixByFilename(originFileName);

			originFileName = originFileName.substring(0, originFileName.length() - suffix.length());
			savePath = savePath + suffix;

			long maxSize = ((Long) conf.get("maxSize")).longValue();

			if (!validType(suffix, (String[]) conf.get("allowFiles"))) {
				return new BaseState(false, AppInfo.NOT_ALLOW_FILE_TYPE);
			}


			long fileSize = multipartFile.getSize();
			if (fileSize> maxSize) {
				return new BaseState(false, AppInfo.MAX_SIZE);
			}
			//上传文件 到云存储
			String url = OSSFactory.build().uploadSuffix(multipartFile.getBytes(), suffix);

			if(StringUtils.isNotEmpty(url)){
				State storageState = new BaseState(true);
				storageState.putInfo( "size", fileSize);
				storageState.putInfo( "title", originFileName );

				if (storageState.isSuccess()) {
					storageState.putInfo("url", url);
					storageState.putInfo("type", suffix);
					storageState.putInfo("original", originFileName + suffix);
				}
				return storageState;
			}
		} catch (IOException e) {
			return new BaseState(false, AppInfo.IO_ERROR);
		}
		return new BaseState(false, AppInfo.IO_ERROR);
	}

	private static boolean validType(String type, String[] allowTypes) {
		List<String> list = Arrays.asList(allowTypes);

		return list.contains(type);
	}
}
