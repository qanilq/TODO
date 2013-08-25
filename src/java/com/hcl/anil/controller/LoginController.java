/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hcl.anil.controller;

import com.hcl.anil.domain.objects.User;
import com.hcl.anil.service.LoginService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

/**
 *
 * @author M ANIL KUMAR
 */
public class LoginController extends SimpleFormController{

    private LoginService loginService;

    public LoginController() {
        setCommandClass(User.class);
        setCommandName("user");
    }

    
    @Override
    protected ModelAndView onSubmit(HttpServletRequest request,
        HttpServletResponse response, Object command, BindException errors) 
        throws Exception {
        HttpSession session = request.getSession();
        User user = (User)command;
        boolean isValidUser = loginService.validateUser(user);
        if(isValidUser){
            user.setLoggedIn("true");
            session.setAttribute("user", user);
            return new ModelAndView("main","user",user);
        }
        return new ModelAndView("login","user",user);
    }
    /**
     * @return the loginService
     */
    public LoginService getLoginService() {
        return loginService;
    }

    /**
     * @param loginService the loginService to set
     */
    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }

  
}

