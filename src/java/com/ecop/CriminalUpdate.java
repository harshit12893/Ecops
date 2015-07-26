/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ecop;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.io.File;
import java.io.FileInputStream;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.hibernate.Session;

/**
 *
 * @author Harshit Srivastava
 */
public class CriminalUpdate extends ActionSupport implements ServletRequestAware{
    private String criminal_id;
    private String name;
    private String gender;
    private String height;
    private String weight;
    private String crimelevel;
    private String status;
    private File photo;
    private String photoFileName;
    private String photoContentType;
    private String pstation_id;
    HttpServletRequest request;

    public String getCriminal_id() {
        return criminal_id;
    }

    public void setCriminal_id(String criminal_id) {
        this.criminal_id = criminal_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getCrimelevel() {
        return crimelevel;
    }

    public void setCrimelevel(String crimelevel) {
        this.crimelevel = crimelevel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public File getPhoto() {
        return photo;
    }

    public void setPhoto(File photo) {
        this.photo = photo;
    }

    public String getPhotoFileName() {
        return photoFileName;
    }

    public void setPhotoFileName(String photoFileName) {
        this.photoFileName = photoFileName;
    }

    public String getPhotoContentType() {
        return photoContentType;
    }

    public void setPhotoContentType(String photoContentType) {
        this.photoContentType = photoContentType;
    }

    public String getPstation_id() {
        return pstation_id;
    }

    public void setPstation_id(String pstation_id) {
        this.pstation_id = pstation_id;
    }
    
    public void setServletRequest(HttpServletRequest hsr) {
        request=hsr;
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String execute() throws Exception {
        String path=request.getSession().getServletContext().getRealPath("/images");
          Session s=HibernateUtil.getSessionFactory().openSession();
     File f=new File(path,photoFileName);
     PoliceStation ps=(PoliceStation)s.get(PoliceStation.class,pstation_id);
     FileUtils.copyFile(photo,f);
        FileInputStream fis=new FileInputStream(f);
        byte[] bs=new byte[(int)f.length()];
        fis.read(bs);
        fis.close();
       // Session s=NewHibernateUtil.getSessionFactory().openSession();
        Criminal c=(Criminal)s.get(Criminal.class, criminal_id);
        c.setCriminalId(criminal_id);
        c.setName(name);
        c.setGender(gender);
        c.setHeight(height);
        c.setWeight(weight);
        c.setPoliceStation(ps);
        c.setCrimelevel(crimelevel);
        c.setStatus(status);
        c.setPhoto(bs);
        s.update(c);
        s.save(c);
        s.beginTransaction().commit();
        s.close();
        return SUCCESS;
    }
    
    
}
