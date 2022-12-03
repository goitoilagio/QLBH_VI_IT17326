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

/**
 * số lượng
 *
 * @author goitoQuantity of inventory
 */
@Entity
@Table(name = "ProductDetails")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDetails implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private UUID id;

    @Column(name = "product_details_code")
    private String productDetailsCode;
    @ManyToOne
    @JoinColumn(name = "id_category")
    private Category category;
    
    @ManyToOne
    @JoinColumn(name = "id_color")
    private Color color;
    
    @ManyToOne
    @JoinColumn(name = "id_product")
    private Product product;
    
    @ManyToOne
    @JoinColumn(name = "id_fabric")
    private Fabric fabric;
    
    @ManyToOne
    @JoinColumn(name = "id_unit")
    private Unit unit;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "figure")
    private int figure;

    @Column(name = "description")
    private String description;

    @Column(name = "active")
    private Boolean active;

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

//    @OneToMany(mappedBy = "productDetails")
//    private List<OderDetails> listOrderDetails;
    @OneToMany(mappedBy = "productDetails")
    private List<Images> listImages;

    public Object[] toDataRow() {
        return new Object[]{productDetailsCode, product.getProductName(), category.getCategoryName(), color.getColorName(), fabric.getFabricName(), unit.getUnitName(), price, figure};
    }
}
