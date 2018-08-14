package com.baidu.ueditor.upload;

import cn.happymall.modules.oss.cloud.OSSFactory;
import com.baidu.ueditor.PathFormat;
import com.baidu.ueditor.define.AppInfo;
import com.baidu.ueditor.define.BaseState;
import com.baidu.ueditor.define.FileType;
import com.baidu.ueditor.define.State;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;

public final class Base64Uploader {

	public static State save(String content, Map<String, Object> conf) {
		
		byte[] data = decode(content);

		long maxSize = ((Long) conf.get("maxSize")).longValue();

		if (!validSize(data, maxSize)) {
			return new BaseState(false, AppInfo.MAX_SIZE);
		}

		String suffix = FileType.getSuffix("JPG");

		String savePath = PathFormat.parse((String) conf.get("savePath"),
				(String) conf.get("filename"));
		
		savePath = savePath + suffix;
		String physicalPath = (String) conf.get("rootPath") + savePath;


		/**
		 * ------ start modify by dr.wang at 2017-10-31 23:00 ------
		 */
		// 上传文件 到本地
//		State storageState = StorageManager.saveBinaryFile(data, physicalPath);

		//上传文件 到云存储
		int fileSize = data.length;
		if (fileSize> maxSize) {
			return new BaseState(false, AppInfo.MAX_SIZE);
		}
		String url;
		try {
			url = OSSFactory.build().uploadSuffix(data, suffix);
		}catch (Exception e){
			return new BaseState(false, AppInfo.IO_ERROR);
		}

		if(StringUtils.isNotEmpty(url)){
			State storageState = new BaseState(true);
			storageState.putInfo( "size", fileSize);
			storageState.putInfo( "title", "" );

			if (storageState.isSuccess()) {
				storageState.putInfo("url", url);
				storageState.putInfo("type", suffix);
				storageState.putInfo("original", "" + suffix);
			}
			return storageState;
		}
		/**
		 * ------ end modify by dr.wang at 2017-10-31 23:00 ------
		 */
		return new BaseState(false, AppInfo.IO_ERROR);
	}

	private static byte[] decode(String content) {
		return Base64.decodeBase64(content);
	}

	private static boolean validSize(byte[] data, long length) {
		return data.length <= length;
	}
	
}