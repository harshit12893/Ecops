/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ecop;

import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;

/**
 *
 * @author Harshit Srivastava
 */
public class LoginUserAction extends ActionSupport implements ServletRequestAware,SessionAware{
    private String loginid;
    private String password;
    HttpServletRequest request;
    private String description;
    Login ls;
    List<Complaint> es;
    List<Complaint> em;
     SessionMap sm;

    public List<Complaint> getEs() {
        return es;
    }

    public void setEs(List<Complaint> es) {
        this.es = es;
    }

    public List<Complaint> getEm() {
        return em;
    }

    public void setEm(List<Complaint> em) {
        this.em = em;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
    

  

    @Override
    public String execute() throws Exception {
      Session s=HibernateUtil.getSessionFactory().openSession();
        Login l=(Login)s.get(Login.class, loginid);
         if(l!=null)
        {
            if(l.getPassword().equals(password))
            {
                //HttpSession  ses=request.getSession(true);
                sm.put("user", loginid);
                if(l.getType().equals("admin"))
                return SUCCESS;
               else
                  return "userlogin";
            }
            else
            { 
                request.setAttribute("msg", "Invalid User");
                return ERROR;
            
            }
        }
        else
        { request.setAttribute("msg", "Invalid User");
            return ERROR;
        
        }
    //return SUCCESS;
    }

    public void setServletRequest(HttpServletRequest hsr) {
        request=hsr;
    }

    public void setSession(Map<String, Object> map) {
        sm=(SessionMap)map;
    }
//     @Override
//    public void validate() {
//         if(loginid.equals(""))
//            addFieldError("loginid","Enter user name");
//        if(password.equals(""))
//            addFieldError("password","Enter password"); //To change body of generated methods, choose Tools | Templates.
//    }
//    public String logout() 
//    {
//       
//        sm.remove("user");
//        sm.invalidate();
//        return SUCCESS;
//        
//    }
     public String addnews()
    {
         Session s=HibernateUtil.getSessionFactory().openSession();
         Emergency e=new Emergency();
         e.setDescription(description);
         s.save(e);
         s.beginTransaction().commit();
         s.close();
         return SUCCESS;
    }
    
    public String newsadded()
    {
        return SUCCESS;
    }
    public String viewcomplaint()
    {
        Session s=HibernateUtil.getSessionFactory().openSession();
        em=new ArrayList<Complaint>();
        es=s.createCriteria(Complaint.class).list();
        String ll=sm.get("user").toString();
        for(Complaint c:es)
        {
            if(c.getLogin().getLoginid().equals(ll))
                em.add(c);
        }
        return SUCCESS;
    }

   
    
}
