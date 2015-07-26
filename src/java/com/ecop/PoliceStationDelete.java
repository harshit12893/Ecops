/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ecop;

import com.opensymphony.xwork2.ActionSupport;
import org.hibernate.Session;

/**
 *
 * @author Harshit Srivastava
 */
public class PoliceStationDelete extends ActionSupport{
    private String pstationId;
        private String pstationName;
        private String address;
        private Integer phone;
        private String pstationHead;
        private String password;
        private String ch;
        
    public String getCh() {
        return ch;
    }

    public void setCh(String ch) {
        this.ch = ch;
    }

    public String getPstationId() {
        return pstationId;
    }

    public void setPstationId(String pstationId) {
        this.pstationId = pstationId;
    }

    public String getPstationName() {
        return pstationName;
    }

    public void setPstationName(String pstationName) {
        this.pstationName = pstationName;
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

    public String getPstationHead() {
        return pstationHead;
    }

    public void setPstationHead(String pstationHead) {
        this.pstationHead = pstationHead;
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
        PoliceStation ps=(PoliceStation)s.get(PoliceStation.class, ch);
         s.delete(ps);
        s.beginTransaction().commit();
        s.close();
        return SUCCESS;
    }
        
    
}
