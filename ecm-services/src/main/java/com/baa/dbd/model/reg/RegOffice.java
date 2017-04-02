/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.baa.dbd.model.reg;

import com.arg.dbd.model.AbstractPojo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Noom
 */
@Entity
@Table(name = "reg_office")
public class RegOffice extends AbstractPojo{
    private Long id;
    private Long code;
    private String  desLo;
    private String desEn;

    @Id 
    @Column(name = "ID", unique = true ,columnDefinition = "int", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "DES_LO", nullable = true, length = 255,insertable = true, updatable = true)
    public String getDesLo() {
        return desLo;
    }

    public void setDesLo(String desLo) {
        this.desLo = desLo;
    }

    @Column(name = "DES_EN", nullable = true, length = 255,insertable = true, updatable = true)
    public String getDesEn() {
        return desEn;
    }

    public void setDesEn(String desEn) {
        this.desEn = desEn;
    }

    @Column(name = "CODE", unique = false ,columnDefinition = "int", nullable = false)
    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }
                
}
