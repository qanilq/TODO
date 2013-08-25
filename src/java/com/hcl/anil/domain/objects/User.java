/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hcl.anil.domain.objects;

/**
 *
 * @author M ANIL KUMAR
 */
public class User {
    
    private String userName;
    private String password;
    private String email;
    private String confirmEmail;
    private String loggedIn;

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the confirmEamil
     */
    public String getConfirmEmail() {
        return confirmEmail;
    }

    /**
     * @param confirmEamil the confirmEamil to set
     */
    public void setConfirmEmail(String confirmEmail) {
        this.confirmEmail = confirmEmail;
    }

    /**
     * @return the loggedIn
     */
    public String getLoggedIn() {
        return loggedIn;
    }

    /**
     * @param loggedIn the loggedIn to set
     */
    public void setLoggedIn(String loggedIn) {
        this.loggedIn = loggedIn;
    }
    
    
    
}
