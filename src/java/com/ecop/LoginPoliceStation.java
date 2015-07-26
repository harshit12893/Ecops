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
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;

/**
 *
 * @author Harshit Srivastava
 */
public class LoginPoliceStation extends ActionSupport implements ServletRequestAware,SessionAware {
        private String pstation_id;
        private String pstation_name;
        private String address;
        private Integer phone;
        private String pstation_head;
         private String password;
        List <PoliceStation> ps;
        HttpServletRequest request;
        SessionMap sm;
        List<Complaint> es;
        List<Complaint> em;

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

    public List<PoliceStation> getPs() {
        return ps;
    }



    public void setPs(List<PoliceStation> ps) {
        this.ps = ps;
    }

    public String getPstation_id() {
        return pstation_id;
    }

    public void setPstation_id(String pstation_id) {
        this.pstation_id = pstation_id;
    }

    public String getPstation_name() {
        return pstation_name;
    }

    public void setPstation_name(String pstation_name) {
        this.pstation_name = pstation_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getPstation_head() {
        return pstation_head;
    }

    public void setPstation_head(String pstation_head) {
        this.pstation_head = pstation_head;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
       
        
    public void setServletRequest(HttpServletRequest hsr) {
      request=hsr;
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setSession(Map<String, Object> map) {
        sm=(SessionMap)map;
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String execute() throws Exception {
         //To change body of generated methods, choose Tools | Templates.
         Session s=HibernateUtil.getSessionFactory().openSession();
        PoliceStation p=(PoliceStation)s.get(PoliceStation.class, pstation_id);
         if(p!=null)
        {
            if(p.getPassword().equals(password))
            {
                sm.put("user", pstation_id);
                return SUCCESS;
            }
            else
            { 
                request.setAttribute("msg", "Invalid Police Station");
                return ERROR;
            
            }
        }
        else
        { request.setAttribute("msg", "Invalid Police Station");
            return ERROR;
        
        }
    }
//     @Override
////    public void validate() {
////         if(pstation_id.equals(""))
////            addFieldError("pstation_id","Enter Police Station ID");
////        if(password.equals(""))
////            addFieldError("password","Enter password"); //To change body of generated methods, choose Tools | Templates.
////    }
//    
    public String registerRedirect()
    {
       return SUCCESS;
    }
    
    public String register()
    {
        Session s=HibernateUtil.getSessionFactory().openSession();
        PoliceStation p=new PoliceStation();
        p.setPstationId(pstation_id);
        p.setPstationName(pstation_name);
        p.setAddress(address);
        p.setPhone(phone);
        p.setPstationHead(pstation_head);
        p.setPassword(password);
        s.save(p);
        s.beginTransaction().commit();
        s.close();
        return SUCCESS;
    }
    
    public String goback()
    {
        return  SUCCESS;
    }
    
    public String getallpsdata()
    {
        Session s=HibernateUtil.getSessionFactory().openSession();
        ps=s.createCriteria(PoliceStation.class).list();
        return SUCCESS;
    }
    public String viewcomplaint()
    {
        Session s=HibernateUtil.getSessionFactory().openSession();
        em=new ArrayList<Complaint>();
        es=s.createCriteria(Complaint.class).list();
        String ll=sm.get("user").toString();
        System.out.println(ll);
        for(Complaint c:es)
        {
            if(c.getPoliceStation().getPstationId().equals(ll))
                em.add(c);
        }
        return SUCCESS;
    }
   
}
