/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17326.group1.domainmodel;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
@Table(name = "Oder")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue()
    private UUID id;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_code")
    private Integer orderCode;

    @ManyToOne
    @JoinColumn(name = "id_account")
    private Account account;

    @ManyToOne
    @JoinColumn(name = "id_customer")
    private Customer customer;

    @Column(name = "total_money")
    private BigDecimal totalMoney;

    @Column(name = "created")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date created;

    @Column(name = "payment_date")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date paymentDate;

    @Column(name = "order_date")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date oderDate;

    @Column(name = "receivecd_date")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date receivedDate;

    @Column(name = "updated")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date updated;

    @Column(name = "deleted")
    private Boolean deleted;

    @Column(name = "status")
    private int status;

    public String statusOrder() {
        String tb="";
        if (this.status == 1) {
            tb = "Chờ thanh toán";
        } else if (this.status == 2) {
            tb = "Đã thanh toán";
        }
        return tb;
    }

    public Object[] toDataRow() {
        return new Object[]{orderCode, "Tuan", totalMoney, statusOrder(), created, paymentDate, "Tuans"};
    }
}
