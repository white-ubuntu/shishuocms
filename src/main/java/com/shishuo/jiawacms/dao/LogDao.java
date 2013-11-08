/*
 * 
 *	Copyright © 2013 Changsha Shishuo Network Technology Co., Ltd. All rights reserved.
 *	长沙市师说网络科技有限公司 版权所有
 *
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *	 
 *		http://www.shishuo.com/jiawacms/licenses
 *		http://www.apache.org/licenses/LICENSE-2.0
 *
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 */
package com.shishuo.jiawacms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.shishuo.jiawacms.entity.Log;

/**
 * 日志服务
<<<<<<< HEAD
 * 
 * @author Harbored
 * 
=======
 * @author Harbored
 *
>>>>>>> refs/remotes/origin/master
 */

@Repository
public interface LogDao {

	/**
	 * 全部日志
	 * 
	 * @return List<Log>
	 */
	public List<Log> getLogList(@Param("offset") long offset,
			@Param("rows") long rows);

	/**
	 * 全部日志的数量
	 * 
	 * @return Integer
	 */
	public int getLogListCount();

	/**
	 * 增加日志
<<<<<<< HEAD
	 * 
=======
>>>>>>> refs/remotes/origin/master
	 * @param Log
	 * @return Integer
	 */
	public int addLog(Log log);

}
