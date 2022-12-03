/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17326.group1.domainmodel;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "Color")
public class Color {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private UUID id;

    @Column(name = "color_code")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer colorCode;

    @Column(name = "color_name")
    private String colorName;

    @Column(name = "created")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date created;

    @Column(name = "updated")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date updated;

    @Column(name = "deleted")
    private Boolean deleted;

    @Column(name = "status")
    private Integer status;

    @OneToMany(mappedBy = "color",fetch = FetchType.EAGER)
    private List<ProductDetails> listProductDetails;

}
