/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ecop;

import static com.opensymphony.xwork2.Action.SUCCESS;
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
public class NewsDeleteUpdate extends ActionSupport implements ServletRequestAware{
        List <Emergency> es;
        private Integer sno;
        private String description;
       Integer ch;
        private Integer sno1;
        private String description1;
          HttpServletRequest request;
          Emergency ee;
     Integer ch1=ch;
       // String pm;

    public Integer getCh() {
        return ch;
    }

    public Integer getSno1() {
        return sno1;
    }

    public void setSno1(Integer sno1) {
        this.sno1 = sno1;
    }

    public String getDescription1() {
        return description1;
    }

    public void setDescription1(String description1) {
        this.description1 = description1;
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
        
    public List<Emergency> getEs() {
        return es;
    }

    public void setEs(List<Emergency> es) {
        this.es = es;
    }
      
    public void setServletRequest(HttpServletRequest hsr) {
       request=hsr;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

    @Override
    public String execute() throws Exception {
         //To change body of generated methods, choose Tools | Templates.
       request.setAttribute("ch", ch);
        return SUCCESS;
    }
     public String getallnewsdata()
    {
        Session s=HibernateUtil.getSessionFactory().openSession();
        es=s.createCriteria(Emergency.class).list();
        ch1=ch;
        request.setAttribute("ch", ch);
        
        return SUCCESS;
    }
    
    public String deleteNews()
    {
       ch1=ch;
        Session s=HibernateUtil.getSessionFactory().openSession();
        Emergency e=(Emergency)s.get(Emergency.class,(ch));
        ee=e;
        s.delete(e);
        s.beginTransaction().commit();
        s.close();
        return SUCCESS;
    }
    
}
