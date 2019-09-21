package com.controller;
import java.util.List;
 
import javax.servlet.http.HttpServletRequest;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.User;
import com.service.UserService;
 
@Controller
public class UserCotroller {
	@Autowired
    private UserService userService;
 
    @RequestMapping(value="/hello.do")
    public String findAgeById(HttpServletRequest request)
    {
        int age=userService.findAgeById(1);
        System.out.println(age);//如果实验成功，在控制台会打印年龄21
        return "index";
    }
    
    @RequestMapping(value="/hello1.do")
    public String findNameById(HttpServletRequest request)
    {
    	int id = Integer.valueOf(request.getParameter("id"));
        String username = userService.findNameById(id);
        System.out.println(username);
        return "index";
    }
    
    @RequestMapping(value="/add.do")
    public String addUser(HttpServletRequest request)
    {
    	User user=new User();
    	user.setUsername(request.getParameter("name"));
    	user.setAge(Integer.valueOf(request.getParameter("age")));
    	user.setPassword(request.getParameter("password"));
    	user.setSex(request.getParameter("sex"));
        userService.addUser(user);
        return "redirect:/hello.jsp";
    }
    
    
    @RequestMapping(value="/list.do")
    public String  findUser(HttpServletRequest request)
    {
    	List<User> users=userService.findUser();
    	System.out.println(users.get(0).getUsername());
		request.getSession().setAttribute("users",users);
        return "redirect:/index.jsp";
    }
    
    @RequestMapping(value="/delete.do")
    public String  deleteUser(HttpServletRequest request)
    {
    	int id=Integer.valueOf(request.getParameter("id"));
    	userService.deleteUser(id);
        return "redirect:/list.do";
    }
    
    
    
    
}