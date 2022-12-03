/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17326.group1.domainmodel;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author goito
 */
@Entity
@Table(name = "OrderDetails")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderDetails implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "id_order")
    private Order oder;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_product_details")
    private ProductDetails productDetails;

    @Column(name = "order_details_code")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer oderDetailsCode;

    @Column(name = "figure")
    private int figure;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "created")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date created;

    @Column(name = "updated")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date updated;

    @Column(name = "deleted")
    private Boolean deleted;

    @Column(name = "status")
    private int status;


    public Object[] toDataRow() {
        return new Object[] {"",productDetails.getProduct().getProductName(),productDetails.getUnit().getUnitName(),figure,productDetails.getPrice(),productDetails.getPrice()};
    }

}
