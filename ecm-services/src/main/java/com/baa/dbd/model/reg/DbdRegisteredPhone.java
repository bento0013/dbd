/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.baa.dbd.model.reg;

import com.arg.dbd.model.AbstractPojo;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Noom
 */
@Entity
@Table(name = "dbd_registered_phone")
public class DbdRegisteredPhone extends AbstractPojo{
    private Integer id;
    private Integer rId;
    private String phone;
    private Integer ordering;
    private Integer userId;
    private Date createDate;
    private Date updateDate;
    private Integer flagInsert;    
    private Boolean published;
    private Integer oldID; 
        
    @Column(name = "registeredID", unique = false ,columnDefinition = "int", nullable = true)
    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ID", unique = false ,columnDefinition = "int", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "phone", nullable = true, length = 100,insertable = true, updatable = true)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Column(name = "ordering", unique = false ,columnDefinition = "int", nullable = true)
    public Integer getOrdering() {
        return ordering;
    }

    

    public void setOrdering(Integer ordering) {
        this.ordering = ordering;
    }
    
    
    @Column(name = "userID", unique = false ,columnDefinition = "int", nullable = true)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Column(name = "createdDate", unique = false ,columnDefinition = "DATETIME", nullable = true)
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Column(name = "modifiedDate", unique = false ,columnDefinition = "DATETIME", nullable = true)
    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Column(name = "flag_insert", unique = false ,columnDefinition = "int", nullable = true)
    public Integer getFlagInsert() {
        return flagInsert;
    }

    public void setFlagInsert(Integer flagInsert) {
        this.flagInsert = flagInsert;
    }    
    
    @Column(name = "published", unique = false ,columnDefinition = "BIT", nullable = true)
    public Boolean getPublished() {
        return published;
    }

    public void setPublished(Boolean published) {
        this.published = published;
    }
    
    @Column(name = "oldID", unique = false ,columnDefinition = "int", nullable = true)
    public Integer getOldID() {
        return oldID;
    }

    public void setOldID(Integer oldID) {
        this.oldID = oldID;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.id);        
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DbdRegisteredPhone other = (DbdRegisteredPhone) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }                
        return true;
    }
    
    
    
    
    
    
}
