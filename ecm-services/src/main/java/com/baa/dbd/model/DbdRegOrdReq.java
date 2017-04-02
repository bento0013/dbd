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
@Table(name = "dbd_reg_ord_req")
public class DbdRegOrdReq extends AbstractPojo{
    private Long id;
    private String cmwoOrdCode;
    private String cmwoOrdDesc;
    private BigInteger CmmGenId;

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ID", unique = true ,columnDefinition = "bigint", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "CMWD_ORD_CODE", nullable = false,length = 20 ,insertable = true, updatable = true)
    public String getCmwoOrdCode() {
        return cmwoOrdCode;
    }

    public void setCmwoOrdCode(String cmwoOrdCode) {
        this.cmwoOrdCode = cmwoOrdCode;
    }

    @Column(name = "CMWD_ORD_DESC", nullable = true, length = 200,insertable = true, updatable = true)
    public String getCmwoOrdDesc() {
        return cmwoOrdDesc;
    }

    public void setCmwoOrdDesc(String cmwoOrdDesc) {
        this.cmwoOrdDesc = cmwoOrdDesc;
    }

    @Column(name = "CMMGENID", nullable = false,columnDefinition = "DECIMAL(20,0)" ,insertable = true, updatable = true)
    public BigInteger getCmmGenId() {
        return CmmGenId;
    }

    public void setCmmGenId(BigInteger CmmGenId) {
        this.CmmGenId = CmmGenId;
    }
    
    
}
