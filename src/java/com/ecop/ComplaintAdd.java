package com.ecop;

import com.opensymphony.xwork2.ActionSupport;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.hibernate.Criteria;
import org.hibernate.Session;

public class ComplaintAdd extends ActionSupport implements ServletRequestAware {

    HttpServletRequest request;
    private ArrayList<String> f;
    private ArrayList<String> f1;
    private ArrayList<String> f2;
    List<PoliceStation> es;
    List<Criminal> es2;
    List<Login> es1;

    public List<PoliceStation> getEs() {
        return es;
    }

    public void setEs(List<PoliceStation> es) {
        this.es = es;
    }

    public List<Criminal> getEs2() {
        return es2;
    }

    public void setEs2(List<Criminal> es2) {
        this.es2 = es2;
    }

    public List<Login> getEs1() {
        return es1;
    }

    public void setEs1(List<Login> es1) {
        this.es1 = es1;
    }

    public void setServletRequest(HttpServletRequest hsr) {
        request = hsr;
    }

    public ArrayList<String> getF() {
        return f;
    }

    public void setF(ArrayList<String> f) {
        this.f = f;
    }

    public ArrayList<String> getF1() {
        return f1;
    }

    public void setF1(ArrayList<String> f1) {
        this.f1 = f1;
    }

    public ArrayList<String> getF2() {
        return f2;
    }

    public void setF2(ArrayList<String> f2) {
        this.f2 = f2;
    }

   
    public ComplaintAdd() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        f = new ArrayList<String>();
        //Criteria c = s.createCriteria(PoliceStation.class);
         es = s.createCriteria(PoliceStation.class).list();
        for (PoliceStation e : es) {
            f.add(e.getPstationId());
        }

        //Criteria c1 = ;
        f1= new ArrayList<String>();
         es1 = s.createCriteria(Login.class).list();
        for (Login l : es1) {
            if(l.getType().equals("user"))
            f1.add(l.getLoginid());
        }

       // Criteria c2 = s.createCriteria(Criminal.class);
        es2 = s.createCriteria(Criminal.class).list();
        f2 = new ArrayList<String>();
        for (Criminal cr : es2) {
            f2.add(cr.getCriminalId());
        }
    }

    public String addcomplain() {
                    

                Session s = HibernateUtil.getSessionFactory().openSession();
                Criminal criminal = (Criminal) s.get(Criminal.class, request.getParameter("criminalid"));
                PoliceStation policestation = (PoliceStation) s.get(PoliceStation.class, request.getParameter("pstation_id"));

                Login login = (Login) s.get(Login.class, request.getParameter("loginid"));
                
                Complaint l = new Complaint();
                l.setPoliceStation(policestation);
                l.setLogin(login);
                l.setCriminal(criminal);
                l.setDescription(request.getParameter("description"));
                l.setStatus("Lodged");
                s.save(l);
                s.beginTransaction().commit();
                s.close();
                return SUCCESS;
      

    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}
