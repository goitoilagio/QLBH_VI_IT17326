/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17326.group1.repositories.iplm;

import com.poly.it17326.group1.config.HibernateUtil;
import com.poly.it17326.group1.domainmodel.ProductDetails;
import com.poly.it17326.group1.repositories.IProductDetailsRepository;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author goito
 */
public class ProductDetailsRepositoryIplm implements IProductDetailsRepository {

    String fromTable = "FROM ProductDetails";

    @Override
    public List<ProductDetails> findAll() {
        List<ProductDetails> listProductDetails;
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            Query query = session.createQuery(fromTable, ProductDetails.class);
            listProductDetails = query.getResultList();
            return listProductDetails == null ? new ArrayList<>() : listProductDetails;
        }
    }

    @Override
    public ProductDetails finById(String code) {
        ProductDetails productDetails;
        String hql = fromTable + " WHERE productDetailsCode = :code";
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            TypedQuery<ProductDetails> query = session.createQuery(hql, ProductDetails.class);
            query.setParameter("code", code);
            productDetails = query.getSingleResult();
        }
        return productDetails;
    }


    public static void main(String[] args) {
        System.out.println(new ProductDetailsRepositoryIplm().findAll().size());
    }
}
