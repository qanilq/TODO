/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hcl.anil.dao;

import java.io.Serializable;
import org.springframework.orm.hibernate3.HibernateTemplate;

/**
 *
 * @author M ANIL KUMAR
 */
public class BaseDAO {
    
    private HibernateTemplate hibernateTemplate;
    public void save(Object entity){
        getHibernateTemplate().save(entity);
    }
    public <T> T get(Class<T> entity,Serializable id){
        return getHibernateTemplate().get(entity, id);
    }

    /**
     * @return the hibernateTemplate
     */
    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    /**
     * @param hibernateTemplate the hibernateTemplate to set
     */
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
    
}
