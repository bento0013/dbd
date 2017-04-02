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
@Table(name = "dbd_users")
public class DbdUser extends AbstractPojo{
    private Long id;
    private Long oldId;
    private Integer regId;
    private String name;
    private String username;
    private String password;
    private String email;
    private Date registerDate;
    private String activation;    
    private Integer sendEmail;    
    private Date lastvisitDate;
    private String params;
    private Date lastResetTime;
    private Integer resetCount;
    private String otpKey;
    private String otep;
    private Integer requireReset;
    private String password_decode;    
    private Integer flag_insert;
    private Date date_insert;
    private Integer block;


    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ID", unique = true ,columnDefinition = "bigint", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    @Id
    @Column(name = "R_ID", unique = true ,columnDefinition = "int", nullable = false)
    public Integer getRegId() {
        return regId;
    }

    public void setRegId(Integer regId) {
        this.regId = regId;
    }  
    
//    @Id
    @Column(name = "oldID", unique = true ,columnDefinition = "bigint", nullable = false)
    public Long getOldId() {
        return oldId;
    }

    

    public void setOldId(Long oldId) {
        this.oldId = oldId;
    }

    @Column(name = "name", nullable = true, length = 200,insertable = true, updatable = true)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "username", nullable = true, length = 150,insertable = true, updatable = true)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "password", nullable = true, length = 100,insertable = true, updatable = true)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "email", nullable = true, length = 100,insertable = true, updatable = true)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "registerDate", unique = false ,columnDefinition = "DATETIME", nullable = false)    
    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    @Column(name = "activation", nullable = true, length = 100,insertable = true, updatable = true)
    public String getActivation() {
        return activation;
    }

    public void setActivation(String activation) {
        this.activation = activation;
    }

    @Column(name = "sendEmail", unique = false ,columnDefinition = "TINYINT", nullable = false)
    public Integer getSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(Integer sendEmail) {
        this.sendEmail = sendEmail;
    }

    @Column(name = "lastvisitDate", unique = false ,columnDefinition = "DATETIME", nullable = false)
    public Date getLastvisitDate() {
        return lastvisitDate;
    }

    public void setLastvisitDate(Date lastvisitDate) {
        this.lastvisitDate = lastvisitDate;
    }

    @Column(name = "params", nullable = true, length = 2000,insertable = true, updatable = true)
    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    @Column(name = "lastResetTime", unique = false ,columnDefinition = "DATETIME", nullable = false)
    public Date getLastResetTime() {
        return lastResetTime;
    }

    public void setLastResetTime(Date lastResetTime) {
        this.lastResetTime = lastResetTime;
    }

    @Column(name = "resetCount", unique = false ,columnDefinition = "int", nullable = false)
    public Integer getResetCount() {
        return resetCount;
    }

    public void setResetCount(Integer resetCount) {
        this.resetCount = resetCount;
    }

    @Column(name = "otpKey", nullable = true, length = 1000,insertable = true, updatable = true)
    public String getOtpKey() {
        return otpKey;
    }

    public void setOtpKey(String otpKey) {
        this.otpKey = otpKey;
    }

    @Column(name = "otep", nullable = true, length = 1000,insertable = true, updatable = true)
    public String getOtep() {
        return otep;
    }

    public void setOtep(String otep) {
        this.otep = otep;
    }

    @Column(name = "requireReset", unique = false ,columnDefinition = "TINYINT", nullable = false)
    public Integer getRequireReset() {
        return requireReset;
    }

    public void setRequireReset(Integer requireReset) {
        this.requireReset = requireReset;
    }

    @Column(name = "password_decode", nullable = true, length = 20,insertable = true, updatable = true)
    public String getPassword_decode() {
        return password_decode;
    }

    public void setPassword_decode(String password_decode) {
        this.password_decode = password_decode;
    }
  

    @Column(name = "flag_insert", unique = false ,columnDefinition = "int", nullable = false)
    public Integer getFlag_insert() {
        return flag_insert;
    }

    public void setFlag_insert(Integer flag_insert) {
        this.flag_insert = flag_insert;
    }

    @Column(name = "date_insert", unique = false ,columnDefinition = "DATETIME", nullable = false)
    public Date getDate_insert() {
        return date_insert;
    }

    public void setDate_insert(Date date_insert) {
        this.date_insert = date_insert;
    }

    @Column(name = "block", unique = false ,columnDefinition = "TINYINT", nullable = false)
    public Integer getBlock() {
        return block;
    }

    public void setBlock(Integer block) {
        this.block = block;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final DbdUser other = (DbdUser) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }        
        return true;
    }

    
    
    

    
    
    
    
}
