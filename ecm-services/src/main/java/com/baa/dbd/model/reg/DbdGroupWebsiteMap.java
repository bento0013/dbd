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
@Table(name = "dbd_group_website_map")
public class DbdGroupWebsiteMap extends AbstractPojo{
    private Long id;
    private Long webId;      
    private Integer groupwsId;
        
        
    @Column(name = "WEBSITE_CATALOG_ID", unique = true ,columnDefinition = "bigint", nullable = false)    
    public Long getWebId() {
        return webId;
    }

    public void setWebId(Long webId) {
        this.webId = webId;
    }

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ID", unique = true ,columnDefinition = "bigint", nullable = false)
    public Long getId() {
        return id;
    }

      
    public void setId(Long id) {
        this.id = id;
    }
    
    @Column(name = "groupwsID", unique = false ,columnDefinition = "int", nullable = false)           
    public Integer getGroupwsId() {
        return groupwsId;
    }

    public void setGroupwsId(Integer groupwsId) {
        this.groupwsId = groupwsId;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.id);
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
        final DbdGroupWebsiteMap other = (DbdGroupWebsiteMap) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
        
    
    
    

    
    
    
}
