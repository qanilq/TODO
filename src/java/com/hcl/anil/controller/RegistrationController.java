/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hcl.anil.controller;

import com.hcl.anil.domain.objects.User;
import com.hcl.anil.service.RegistrationService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

/**
 *
 * @author M ANIL KUMAR
 */
public class RegistrationController extends SimpleFormController{

    private RegistrationService registrationService;

    public RegistrationController() {
        setCommandClass(User.class);
        setCommandName("user");
    }
    
    
    
    @Override
    protected ModelAndView onSubmit(HttpServletRequest request,
        HttpServletResponse response, Object command, BindException errors) 
        throws Exception {
        
        User user = (User)command;
        registrationService.registerUser(user);
        return new ModelAndView("registrationSuccess","user",user);
    }

    /**
     * @return the registrationService
     */
    public RegistrationService getRegistrationService() {
        return registrationService;
    }

    /**
     * @param registrationService the registrationService to set
     */
    public void setRegistrationService(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }
    
    
}
