/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17326.group1.domainmodel;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "Account")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Account implements Serializable {

    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "staff_code")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer staffCode;

    @Column(name = "id_position")
    private Position position;

    @Column(name = "staff_name")
    private String staffName;

    @Column(name = "birtday")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date birtDay;

    @Column(name = "sex")
    private Boolean sex;

    @Column(name = "cccd")
    private String cccd;

    @Column(name = "staff_address")
    private String staffAddress;

    @Column(name = "staff_images")
    private String staffImages;

    @Column(name = "password")
    private String password;

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
}
