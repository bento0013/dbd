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
@Table(name = "dbd_group_website_registered"
        ,uniqueConstraints=
        @UniqueConstraint(columnNames={"registeredID", "wsGroupID","userId","oldID"}))
public class DbdGroupWebsiteRegistered extends AbstractPojo{
    private Long id;
    private Long rId;
    private Long wId;  
    private String wOther;
    private Integer userId;
    private Date createDate;
    private Date updateDate;
    private Integer flagInsert;
    private Integer ordering;
    private Boolean published;
    private Integer oldID;    
        
    @Column(name = "registeredID", unique = false ,columnDefinition = "bigint", nullable = false)
    public Long getrId() {
        return rId;
    }

    public void setrId(Long rId) {
        this.rId = rId;
    }
        
    @Column(name = "wsGroupID", unique = false ,columnDefinition = "bigint", nullable = false)
    public Long getwId() {
        return wId;
    }

    public void setwId(Long wId) {
        this.wId = wId;
    }

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ID", unique = true ,columnDefinition = "bigint", nullable = false)
    public Long getId() {
        return id;
    }

    

    

    public void setId(Long id) {
        this.id = id;
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

    @Column(name = "wsOther", nullable = true, length = 100,insertable = true, updatable = true)
    public String getwOther() {
        return wOther;
    }

    
    public void setwOther(String wOther) {
        this.wOther = wOther;
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
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.rId);
        hash = 79 * hash + Objects.hashCode(this.wId);
        hash = 79 * hash + Objects.hashCode(this.userId);
        hash = 79 * hash + Objects.hashCode(this.oldID);
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
        final DbdGroupWebsiteRegistered other = (DbdGroupWebsiteRegistered) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.rId, other.rId)) {
            return false;
        }
        if (!Objects.equals(this.wId, other.wId)) {
            return false;
        }
        if (!Objects.equals(this.userId, other.userId)) {
            return false;
        }
        if (!Objects.equals(this.oldID, other.oldID)) {
            return false;
        }
        return true;
    }
    
    

    
    
    
}
