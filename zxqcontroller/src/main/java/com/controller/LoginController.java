package com.controller;

import com.pojo.JsSysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.GetLoginService;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @Autowired
    private GetLoginService getLoginService;

    @RequestMapping("/")
    public String showIndex(){
        return "/WEB-INF/jsp/index";
    }

    @RequestMapping("/login")
    private String getLogin(Model model, HttpServletRequest request,@RequestParam(value = "logname") String logname,@RequestParam(value ="logpass" ) String logpass){
        //System.out.println(request.getParameter("logname"));
        //System.out.println(request.getParameter("logpass"));
        System.out.println(logname+logpass);
       JsSysUser jsSysUser =getLoginService.getLoginUser("admin","admin");
       model.addAttribute("jsSysUser",jsSysUser);
        return "/WEB-INF/jsp/login_in";

    }

}
