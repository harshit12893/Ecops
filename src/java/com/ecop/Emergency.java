package com.ecop;
// Generated 17 Jul, 2015 8:37:23 PM by Hibernate Tools 3.6.0



/**
 * Emergency generated by hbm2java
 */
public class Emergency  implements java.io.Serializable {


     private Integer sno;
     private String description;

    public Emergency() {
    }

    public Emergency(String description) {
       this.description = description;
    }
   
    public Integer getSno() {
        return this.sno;
    }
    
    public void setSno(Integer sno) {
        this.sno = sno;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }




}


