/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hcl.anil.controller;

import com.hcl.anil.domain.objects.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author M ANIL KUMAR
 */
public class LogoutController implements Controller{

    public ModelAndView handleRequest(HttpServletRequest request,
            HttpServletResponse response)
            throws Exception {
        
        ModelAndView mav = new ModelAndView("login", "user", new User());
        HttpSession session = request.getSession();
        session.invalidate();
        return mav;
    }

   

    
}

