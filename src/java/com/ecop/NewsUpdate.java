/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ecop;

import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;

/**
 *
 * @author Harshit Srivastava
 */
public class NewsUpdate extends ActionSupport// implements ServletRequestAware,SessionAware
{
        private Integer sno;
        private String description;
        private Integer ch;
        List<Emergency>  ee;
          HttpServletRequest request;
        SessionMap sm;

    
    public Integer getCh() {
        return ch;
    }

    public void setCh(Integer ch) {
        this.ch = ch;
    }

    public Integer getSno() {
        return sno;
    }

    public void setSno(Integer sno) {
        this.sno = sno;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
        
    public void setServletRequest(HttpServletRequest hsr) {
    request=hsr;    
    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setSession(Map<String, Object> map) {
        sm=(SessionMap)map;
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String execute() throws Exception {
          
           return SUCCESS;
         //To change body of generated methods, choose Tools | Templates.
    }
    public String newsupdate()
    {
        Session s=HibernateUtil.getSessionFactory().openSession();
        NewsDeleteUpdate nd=new NewsDeleteUpdate();
        
         if(description!=null)
         {
         Emergency e=(Emergency)s.get(Emergency.class, sno);
         e.setSno(sno);
         e.setDescription(description);
         s.update(e);
         s.save(e);
         s.beginTransaction().commit();
         s.close();
         return SUCCESS;
         }
         else
             return ERROR;
    }
    
    
}
