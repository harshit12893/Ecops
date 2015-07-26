/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ecop;

import com.opensymphony.xwork2.ActionSupport;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.hibernate.Session;

/**
 *
 * @author Harshit Srivastava
 */
public class ComplaintsStatusUpdate extends ActionSupport implements ServletRequestAware{
    private Integer id;
    private String status;
    HttpServletRequest request;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setServletRequest(HttpServletRequest hsr) {
        request=hsr;
    }
    public String update()
    {
         Session s=HibernateUtil.getSessionFactory().openSession();
         Complaint c=(Complaint)s.get(Complaint.class, id);
         c.setStatus(status);
         s.update(c);
         s.save(c);
         s.beginTransaction().commit();
         s.close();
         return SUCCESS;
    }
   

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
    
}
