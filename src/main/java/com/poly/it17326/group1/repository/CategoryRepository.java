/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17326.group1.repository;

import com.poly.it17326.group1.config.HibernateUtil;
import com.poly.it17326.group1.domainmodel.Category;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;

/**
 *
 * @author ADMIN
 */
public class CategoryRepository {
    private Session session = HibernateUtil.getFACTORY().openSession();
    
    private String fromTable ="FROM Category";
    
    public List<Category>getAll(){
        Query query = session.createQuery(fromTable);
        return query.getResultList();
    }
    
    public static void main(String[] args) {
        List<Category>categorys = (List<Category>) new CategoryRepository();
        for(Category category: categorys){
            System.out.println(category.toString());
        }
    }
}
