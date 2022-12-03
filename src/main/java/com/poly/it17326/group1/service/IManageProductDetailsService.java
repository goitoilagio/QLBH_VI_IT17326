/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17326.group1.service;

import com.poly.it17326.group1.domainmodel.ProductDetails;
import java.util.List;

/**
 *
 * @author goito
 */
public interface IManageProductDetailsService {

    List<ProductDetails> getAll();

    ProductDetails getById(String code);
}
