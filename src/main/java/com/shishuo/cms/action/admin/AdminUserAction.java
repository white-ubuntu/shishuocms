package com.shishuo.cms.action.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 用户action
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/admin/user")
public class AdminUserAction extends AdminBaseAction{

	@RequestMapping(value = "/add",method = RequestMethod.GET)
	public String addUser(ModelMap modelMap){
		
		return "admin/user/addUser";
	}
	
	@RequestMapping(value = "/addNew",method = RequestMethod.POST)
	public String addNewUser(@RequestParam(value = "userName") String userName){
		userService.addUser(userName);
		return "redirect:/admin/user/allList";
	}
	
	@RequestMapping(value = "/allList",method = RequestMethod.GET)
	public String allList(@RequestParam(value = "pageNum",defaultValue="1") int pageNum,
			ModelMap modelMap){
		modelMap.put("pageVo", userService.getUserPage(pageNum));
		return "admin/user/allUser";
	}
	
	@RequestMapping(value = "/one",method = RequestMethod.GET)
	public String oneAdmin(@RequestParam(value = "userId") long userId,
			ModelMap modelMap){
		modelMap.put("admin", userService.getUserById(userId));
		return "admin/user/updateUser";
	}
	
	@RequestMapping(value = "/update",method = RequestMethod.POST)
	public String updateAdmin(@RequestParam(value = "userName") String userName,
			@RequestParam(value = "userId") long userId,
			@RequestParam(value = "type") int type){
		userService.updateUser(userId, type, userName);
		return "redirect:/admin/user/allList";
	}
	
	@RequestMapping(value = "/delete",method = RequestMethod.GET)
	public String deleteUser(@RequestParam(value = "userId") long userId){
		userService.deleteUserById(userId);
		return "redirect:/admin/user/allList";
	}

}
