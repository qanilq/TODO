/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hcl.anil.validators;

import com.hcl.anil.domain.objects.User;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 *
 * @author M ANIL KUMAR
 */
public class UserValidator implements Validator{

    public boolean supports(Class<?> clazz) {
        return User.class.isAssignableFrom(clazz);
               
    }

    public void validate(Object target, Errors errors) {
        User user = (User)target;
       ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "Required.User.name",
               "Field name is required.");
       ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "Required.Password", 
               "Field Password is required");
    
       
    }
    
}
