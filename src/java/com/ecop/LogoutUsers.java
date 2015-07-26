/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ecop;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author Harshit Srivastava
 */
public class LogoutUsers extends ActionSupport implements ServletRequestAware,SessionAware{
    
    private String loginid;
    private String password;
    SessionMap sm;
    HttpServletRequest request;

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
         //To change body of generated methods, choose Tools | Templates.
        System.out.println("DATA  "+sm.get("user"));
        sm.remove("user");
        
        sm.invalidate();
    return SUCCESS;
    }

    public void setSession(Map<String, Object> map) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        sm=(SessionMap)map;
    }
    
    
}
