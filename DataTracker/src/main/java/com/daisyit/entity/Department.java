package com.daisyit.entity;
// Generated Mar 20, 2018 2:44:46 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Department generated by hbm2java
 */
@Entity
@Table(name="Department"
    ,schema="dbo"
    ,catalog="nsrp"
)
public class Department  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int deptId;
     private String deptName;
     private String description;

    public Department() {
    }

	
    public Department(int deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }
    public Department(int deptId, String deptName, String description) {
       this.deptId = deptId;
       this.deptName = deptName;
       this.description = description;
    }
   
     @Id 

    
    @Column(name="DeptId", unique=true, nullable=false)
    public int getDeptId() {
        return this.deptId;
    }
    
    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    
    @Column(name="DeptName", nullable=false)
    public String getDeptName() {
        return this.deptName;
    }
    
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    
    @Column(name="Description", length=60)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }




}


