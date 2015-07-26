/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ecop;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
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
public class PoliceStationUpdate extends ActionSupport implements ServletRequestAware {
        HttpServletRequest request;
        private String pstation_id;
        private String pstation_name;
        private String address;
        private Integer phone;
        private String pstation_head;
         private String password;

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
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public String execute() throws Exception {
         Session s=HibernateUtil.getSessionFactory().openSession();
        PoliceStation p=(PoliceStation)s.get(PoliceStation.class, pstation_id);
        p.setPstationId(pstation_id);
        p.setPstationName(pstation_name);
        p.setAddress(address);
        p.setPhone(phone);
        p.setPstationHead(pstation_head);
        p.setPassword(password);
        s.update(p);
        s.save(p);
        s.beginTransaction().commit();
        s.close();
        return SUCCESS;
        //To change body of generated methods, choose Tools | Templates.
    }
    
}
