/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ecop;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.hibernate.Session;

/**
 *
 * @author Harshit Srivastava
 */
public class CriminalDelete extends ActionSupport implements ServletRequestAware{
    private List <Criminal> cs;
    private String ch;
  HttpServletRequest request;

    public String getCh() {
        return ch;
    }

    public void setCh(String ch) {
        this.ch = ch;
    }

    public List<Criminal> getCs() {
        return cs;
    }

    public void setCs(List<Criminal> cs) {
        this.cs = cs;
    }

    public void setServletRequest(HttpServletRequest hsr) {
       request=hsr;
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
    
    
    public String getcriminaldata()
    {
        Session s=HibernateUtil.getSessionFactory().openSession();
        cs=s.createCriteria(Criminal.class).list();
        return SUCCESS;
    }
    public String deleteCriminal()
    {
        Session s=HibernateUtil.getSessionFactory().openSession();
        Criminal c=(Criminal)s.get(Criminal.class, ch);
        s.delete(c);
        s.beginTransaction().commit();
        s.close();
        return SUCCESS;
    }
     public String getphoto() throws IOException 
    {
        HttpServletResponse response=ServletActionContext.getResponse();
        response.setContentType("image/jpeg");
        Session s=NewHibernateUtil.getSessionFactory().openSession();
        String id=request.getParameter("criminalId");
         Criminal c=(Criminal)s.get(Criminal.class, id);
         response.getOutputStream().write(c.getPhoto());
        return SUCCESS;
    }
    
}
