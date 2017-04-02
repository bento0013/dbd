/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.baa.dbd.model;

import com.arg.dbd.model.AbstractPojo;
import java.math.BigInteger;
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
@Table(name = "dbd_reg_dvr_req")
public class DbdRegDvrReq extends AbstractPojo{
    private Long id;
    private String cmwoDeliCode;
    private String cmwoDeliDesc;
    private BigInteger cmmGenId;

    public DbdRegDvrReq()
    {
        
    }
    
    public DbdRegDvrReq(Long id, String cmwoDeliCode, String cmwoDeliDesc, BigInteger cmmGenId) {
        this.id = id;
        this.cmwoDeliCode = cmwoDeliCode;
        this.cmwoDeliDesc = cmwoDeliDesc;
        this.cmmGenId = cmmGenId;
    }
    
    
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ID", unique = true ,columnDefinition = "bigint", nullable = false)
    public Long getId() {
        return id;
    }

    
    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "CMWD_DELI_CODE", nullable = false,length = 20 ,insertable = true, updatable = true)
    public String getCmwoDeliCode() {
        return cmwoDeliCode;
    }

    public void setCmwoDeliCode(String cmwoDeliCode) {
        this.cmwoDeliCode = cmwoDeliCode;
    }
    
    @Column(name = "CMWD_DELI_DESC", nullable = true, length = 200,insertable = true, updatable = true)
    public String getCmwoDeliDesc() {
        return cmwoDeliDesc;
    }

    public void setCmwoDeliDesc(String cmwoDeliDesc) {
        this.cmwoDeliDesc = cmwoDeliDesc;
    }

    @Column(name = "CMMGENID", nullable = false,columnDefinition = "DECIMAL(20,0)" ,insertable = true, updatable = true)
    public BigInteger getCmmGenId() {
        return cmmGenId;
    }

    public void setCmmGenId(BigInteger cmmGenId) {
        this.cmmGenId = cmmGenId;
    }
    
}
