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
@Table(name = "dbd_reg_rul_req")
public class DbdRegRulReq extends AbstractPojo{
    private Long id;
    private String cmwrRuleCode;    
    private BigInteger cmmGenId;

    public DbdRegRulReq()
    {
        
    }
    
    public DbdRegRulReq(Long id, String cmwrRuleCode,  BigInteger cmmGenId) {
        this.id = id;
        this.cmwrRuleCode = cmwrRuleCode;        
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

    @Column(name = "CMWR_RULE_CODE", nullable = false,columnDefinition = "VARCHAR(20)" ,insertable = true, updatable = true)
    public String getCmwrRuleCode() {
        return cmwrRuleCode;
    }

    public void setCmwrRuleCode(String cmwrRuleCode) {
        this.cmwrRuleCode = cmwrRuleCode;
    }
    
    @Column(name = "CMMGENID", nullable = false,columnDefinition = "DECIMAL(20,0)" ,insertable = true, updatable = true)
    public BigInteger getCmmGenId() {
        return cmmGenId;
    }

    public void setCmmGenId(BigInteger CmmGenId) {
        this.cmmGenId = CmmGenId;
    }
    
}
