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
import javax.persistence.UniqueConstraint;

/**
 *
 * @author Noom
 */
@Entity
@Table(name = "dbd_delivery_registered",uniqueConstraints=
        @UniqueConstraint(columnNames={"registeredID", "deliveryID","userId"}))
public class DbdDeliveryRegistered extends AbstractPojo{
    private Integer id;
    private Integer rId;
    private Integer dId;    
    private String deliveryOther;   
    private Integer userId;
    private Date createDate;
    private Date updateDate;
    private Integer flagInsert;
    
    
    @Column(name = "registeredID", unique = true ,columnDefinition = "int", nullable = false)
    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }
    
  
    @Column(name = "deliveryID", unique = true ,columnDefinition = "int", nullable = false)
    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ID", unique = true ,columnDefinition = "int", nullable = false)
    public Integer getId() {
        return id;
    }

    

    public void setId(Integer id) {
        this.id = id;
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

    @Column(name = "deliveryOther", nullable = true, length = 100,insertable = true, updatable = true)
    public String getDeliveryOther() {
        return deliveryOther;
    }

    public void setDeliveryOther(String deliveryOther) {
        this.deliveryOther = deliveryOther;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.rId);
        hash = 97 * hash + Objects.hashCode(this.dId);
        hash = 97 * hash + Objects.hashCode(this.userId);
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
        final DbdDeliveryRegistered other = (DbdDeliveryRegistered) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.rId, other.rId)) {
            return false;
        }
        if (!Objects.equals(this.dId, other.dId)) {
            return false;
        }
        if (!Objects.equals(this.userId, other.userId)) {
            return false;
        }
        return true;
    }

    
    
    
}
