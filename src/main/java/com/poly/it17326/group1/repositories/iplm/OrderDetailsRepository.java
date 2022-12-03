/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17326.group1.repositories.iplm;

import com.poly.it17326.group1.config.HibernateUtil;
import com.poly.it17326.group1.domainmodel.OrderDetails;
import com.poly.it17326.group1.repositories.IOrderDetailsRepository;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author goito
 */
public class OrderDetailsRepository implements IOrderDetailsRepository {

    private String fromTable = "FROM OrderDetails";

    @Override
    public List<OrderDetails> findnAll() {
        List<OrderDetails> listOrderDetails;
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            Query query = session.createQuery(fromTable, OrderDetails.class);
            listOrderDetails = query.getResultList();
            return listOrderDetails == null ? new ArrayList<>() : listOrderDetails;
        }
    }

    @Override
    public OrderDetails finById(Integer code) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public OrderDetails insertOrderDetail(OrderDetails order) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static void main(String[] args) {
        System.out.println(new OrderDetailsRepository().findnAll().size());
    }
}
