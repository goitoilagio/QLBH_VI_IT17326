/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17326.group1.service.iplm;

import com.poly.it17326.group1.domainmodel.ProductDetails;
import com.poly.it17326.group1.repositories.IProductDetailsRepository;
import com.poly.it17326.group1.repositories.iplm.ProductDetailsRepositoryIplm;
import com.poly.it17326.group1.service.IManageProductDetailsService;
import java.util.List;

/**
 *
 * @author goito
 */
public class ManageProductDetailsServiceIplm implements IManageProductDetailsService {

    private IProductDetailsRepository repository;
    public ManageProductDetailsServiceIplm() {
        repository = new ProductDetailsRepositoryIplm();
        
    }

    @Override
    public List<ProductDetails> getAll() {
        return repository.findAll();
    }

    @Override
    public ProductDetails getById(String code) {
        return repository.finById(code);
    }

}
