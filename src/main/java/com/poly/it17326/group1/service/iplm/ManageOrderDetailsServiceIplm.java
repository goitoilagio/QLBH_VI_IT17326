/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17326.group1.service.iplm;

import com.poly.it17326.group1.domainmodel.OrderDetails;
import com.poly.it17326.group1.domainmodel.ProductDetails;
import com.poly.it17326.group1.repositories.IOrderDetailsRepository;
import com.poly.it17326.group1.repositories.iplm.OrderDetailsRepository;
import com.poly.it17326.group1.service.IManageOrderDetailsService;
import java.util.List;

/**
 *
 * @author goito
 */
public class ManageOrderDetailsServiceIplm implements IManageOrderDetailsService {

    private final IOrderDetailsRepository repository;

    public ManageOrderDetailsServiceIplm() {
        repository = new OrderDetailsRepository();
    }

    @Override
    public List<OrderDetails> getAll() {
        return repository.findnAll();
    }

}
