/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ecop;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;

/**
 *
 * @author Harshit Srivastava
 */
public class UserSignUp extends ActionSupport implements ServletRequestAware{
    private String name;
    private String email;
    private String loginid;
    private String password;
    HttpServletRequest request;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLoginid() {
        return loginid;
    }

    public void setLoginid(String loginid) {
        this.loginid = loginid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setServletRequest(HttpServletRequest hsr) {
       request=hsr;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String execute() throws Exception {
        Session s=HibernateUtil.getSessionFactory().openSession();
        Login l=new Login();
        l.setName(name);
        l.setEmail(email);
        l.setLoginid(loginid);
        l.setPassword(password);
        l.setType("user");
        s.save(l);
        s.beginTransaction().commit();
        s.close();
        return SUCCESS;
    }

   
    
}
