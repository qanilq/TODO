/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hcl.anil.service;

import com.hcl.anil.dao.RegistrationDAO;
import com.hcl.anil.domain.objects.User;

/**
 *
 * @author M ANIL KUMAR
 */
public class RegistrationService {

    private RegistrationDAO registrationDAO;
    
    public void registerUser(User user) {
        registrationDAO.save(user);
    }

    /**
     * @return the registrationDAO
     */
    public RegistrationDAO getRegistrationDAO() {
        return registrationDAO;
    }

    /**
     * @param registrationDAO the registrationDAO to set
     */
    public void setRegistrationDAO(RegistrationDAO registrationDAO) {
        this.registrationDAO = registrationDAO;
    }
    
    
    
}
