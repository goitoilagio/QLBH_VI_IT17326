/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17326.group1.service.iplm;

import com.poly.it17326.group1.domainmodel.Order;
import com.poly.it17326.group1.repositories.IOrderRepository;
import com.poly.it17326.group1.repositories.iplm.OrderRepositoriIplm;
import com.poly.it17326.group1.service.IManageOrderService;
import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author goito
 */
public class ManageOderServiceIplm implements IManageOrderService {

    private final IOrderRepository repository;

    public ManageOderServiceIplm() {
        repository = new OrderRepositoriIplm();
    }

    @Override
    public List<Order> getAll() {
        return repository.findAll();
    }

    @Override
    public Order getOne(Integer code) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Order createNewOrder(Order order) {
        return repository.insertOrder(order);
    }

}
