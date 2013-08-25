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
public class RegistrationValidator implements Validator{

    public boolean supports(Class<?> type) {
        return User.class.isAssignableFrom(type);
    }

    public void validate(Object target, Errors errors) {
        User user = (User)target;
          ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "Required.User.name",
               "Field name is required.");
       ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "Required.Password", 
               "Field Password is required");
           ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "Required.email", 
               "Field email is required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "confirmEmail", "Required.confirmEmail", 
               "Field confirmEmail is required");
        if(user.getConfirmEmail()!=null && user.getEmail()!=null){
            if(!(user.getConfirmEmail().equals(user.getEmail()))){
                errors.rejectValue("email", "emails are not matching",  "emails are not matching");
            }
        }
    }
    
}
