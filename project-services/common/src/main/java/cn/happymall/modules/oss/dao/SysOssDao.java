/**
 * Copyright 2018 悦商城 http://www.happymall.cn
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package cn.happymall.modules.oss.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import cn.happymall.modules.oss.entity.SysOssEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 文件上传
 * 
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2017-03-25 12:13:26
 */
@Mapper
public interface SysOssDao extends BaseMapper<SysOssEntity> {
	
}
