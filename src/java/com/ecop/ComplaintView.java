

package com.ecop;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Criteria;
import org.hibernate.Session;


public class ComplaintView  extends ActionSupport implements ServletRequestAware,SessionAware{

    HttpServletRequest request;
    SessionMap sm;
    Login ls;
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

    @Override
    public String execute() throws Exception {
//        Session s=HibernateUtil.getSessionFactory().openSession();
//        
//        es=s.createCriteria(Complaint.class).list();
//        String ll=sm.get("user").toString();
//        for(Complaint c:es)
//        {
//            if(c.getLogin().getLoginid().equals(ll))
//                em.add(c);
//        }
        return SUCCESS; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    public void setServletRequest(HttpServletRequest hsr) {
      request=hsr;   
    }

    public void setSession(Map<String, Object> map) {
        sm=(SessionMap)map;
    }
    
}
