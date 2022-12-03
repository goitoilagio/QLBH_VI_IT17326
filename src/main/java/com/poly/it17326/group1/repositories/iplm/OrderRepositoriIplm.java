/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17326.group1.repositories.iplm;

import com.poly.it17326.group1.config.HibernateUtil;
import com.poly.it17326.group1.domainmodel.Order;
import com.poly.it17326.group1.repositories.IOrderRepository;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author goito
 */
public class OrderRepositoriIplm implements IOrderRepository {

    private String fromTable = "FROM Order";

    @Override
    public List<Order> findAll() {
        List<Order> listOrder;
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            Query query = session.createQuery(fromTable, Order.class);
            listOrder = query.getResultList();
            return listOrder == null ? new ArrayList<>() : listOrder;
        }
    }

    @Override
    public Order finById(Integer code) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Order insertOrder(Order order) {
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            Transaction trans = session.getTransaction();
            trans.begin();
            try {
                session.saveOrUpdate(order);
                trans.commit();
            } catch (Exception e) {
                e.printStackTrace();
                trans.rollback();
                order = null;
            }
        } finally {
            return order;
        }
    }
    public static void main(String[] args) {
        Order order = new Order();

        System.out.println(new OrderRepositoriIplm().insertOrder(order));
    }
}
