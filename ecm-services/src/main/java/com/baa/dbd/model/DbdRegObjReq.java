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
@Table(name = "dbd_reg_obj_req")
public class DbdRegObjReq extends AbstractPojo{
    private Long id;
    private String cmoiObjCode;
    private String cmoiObjDesc;
    private String cmoiObjSubCode;
    private Integer cmoOrd;
    private BigInteger cmmGenId;

    public DbdRegObjReq()
    {
        
    }

    public DbdRegObjReq(Long id, String cmoiObjCode, String cmoiObjDesc, String cmoiObjSubCode, Integer cmoOrd, BigInteger cmmGenId) {
        this.id = id;
        this.cmoiObjCode = cmoiObjCode;
        this.cmoiObjDesc = cmoiObjDesc;
        this.cmoiObjSubCode = cmoiObjSubCode;
        this.cmoOrd = cmoOrd;
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

    @Column(name = "CMOI_OBJ_CODE", nullable = true, length = 20,insertable = true, updatable = true)
    public String getCmoiObjCode() {
        return cmoiObjCode;
    }

    public void setCmoiObjCode(String cmoiObjCode) {
        this.cmoiObjCode = cmoiObjCode;
    }

    @Column(name = "CMOI_OBJ_DESC", nullable = true, length = 1000,insertable = true, updatable = true)
    public String getCmoiObjDesc() {
        return cmoiObjDesc;
    }

    public void setCmoiObjDesc(String cmoiObjDesc) {
        this.cmoiObjDesc = cmoiObjDesc;
    }

    @Column(name = "CMOI_OBJ_SUB_CODE", nullable = true, length = 20,insertable = true, updatable = true)
    public String getCmoiObjSubCode() {
        return cmoiObjSubCode;
    }

    public void setCmoiObjSubCode(String cmoiObjSubCode) {
        this.cmoiObjSubCode = cmoiObjSubCode;
    }

    @Column(name = "CMO_ORD", nullable = true, columnDefinition = "int",insertable = true, updatable = true)
    public Integer getCmoOrd() {
        return cmoOrd;
    }

    public void setCmoOrd(Integer cmoOrd) {
        this.cmoOrd = cmoOrd;
    }

    @Column(name = "CMMGENID", nullable = false,columnDefinition = "DECIMAL(20,0)" ,insertable = true, updatable = true)
    public BigInteger getCmmGenId() {
        return cmmGenId;
    }

    public void setCmmGenId(BigInteger cmmGenId) {
        this.cmmGenId = cmmGenId;
    }
    
    
    
    
    
}
