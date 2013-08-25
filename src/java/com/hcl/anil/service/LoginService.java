/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hcl.anil.service;

import com.hcl.anil.dao.LoginValidationDAO;
import com.hcl.anil.domain.objects.User;

/**
 *
 * @author M ANIL KUMAR
 */
public class LoginService {
    
    private LoginValidationDAO loginValidationDAO;
    
    public boolean validateUser(User user){
        
        User validUser = loginValidationDAO.get(User.class, user.getUserName());
        if(validUser!=null){
            return true;
        }
        return false;
    }

    /**
     * @return the loginValidationDAO
     */
    public LoginValidationDAO getLoginValidationDAO() {
        return loginValidationDAO;
    }

    /**
     * @param loginValidationDAO the loginValidationDAO to set
     */
    public void setLoginValidationDAO(LoginValidationDAO loginValidationDAO) {
        this.loginValidationDAO = loginValidationDAO;
    }
    
}
