/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.baa.dbd.model.reg;

import com.arg.dbd.model.AbstractPojo;
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
@Table(name = "dbd_delivery_map")
public class DbdDeliveryMap extends AbstractPojo{
    private Long id;
    private Long deliveryId;

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ID", unique = true ,columnDefinition = "int", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "delivery_Id", unique = true ,columnDefinition = "bigint", nullable = false)
    public Long getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(Long deliveryId) {
        this.deliveryId = deliveryId;
    }
        
}
