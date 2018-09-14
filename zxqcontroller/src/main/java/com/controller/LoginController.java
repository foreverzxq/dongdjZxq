package com.controller;

import com.pojo.JsSysUser;
import com.pojo.LyUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.GetLoginService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    private GetLoginService getLoginService;

    @RequestMapping("/")
    public String showIndex(){
        return "/WEB-INF/jsp/index";
    }

    @RequestMapping("/login")
    private ModelAndView getLogin(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String logname = request.getParameter("logname");
        String logpass = request.getParameter("logpass");
        Map<String,Object> model = new HashMap<String,Object>();
        LyUser lyUser =getLoginService.getLoginUser(logname,logpass);
        if(null == lyUser){
           model.put("massage","0");
            System.out.println("登录失败");
            return new ModelAndView("/WEB-INF/jsp/index", model);
        }else {
            model.put("massage", "1");
            System.out.println("登录成功");
            return new ModelAndView("/WEB-INF/jsp/login_in", model);
        }


    }



}
