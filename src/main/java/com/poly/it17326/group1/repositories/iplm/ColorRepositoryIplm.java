/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17326.group1.repositories.iplm;

import com.poly.it17326.group1.config.HibernateUtil;
import com.poly.it17326.group1.domainmodel.Color;
import com.poly.it17326.group1.repositories.IColorRepository;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author goito
 */
public class ColorRepositoryIplm implements IColorRepository {

    String fromTable = "FROM Color";

    @Override
    public List<Color> findAll() {
        List<Color> listColor;
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            Query query = session.createQuery(fromTable, Color.class);
            listColor = query.getResultList();
            return listColor == null ? new ArrayList<>() : listColor;
        }
    }

    @Override
    public Color finById(Integer code) {
        Color color;
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            String sql = fromTable + " WHERE colorCode = :code";
            Query q = session.createQuery(sql, Color.class);
            q.setParameter("code", code);
            color = (Color) q.getSingleResult();
            return color == null ? null : color;
        }
    }

    public static void main(String[] args) {
        System.out.println(new ColorRepositoryIplm().finById(1));
    }

    @Override
    public Color insertColor(Color color) {
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            Transaction trans = session.getTransaction();
            trans.begin();
            try {
                session.saveOrUpdate(color);
                trans.commit();
            } catch (Exception e) {
                e.printStackTrace();
                trans.rollback();
                color = null;
            }
        } finally {
            return color;
        }
    }

    @Override
    public Integer deleteColor(Integer code) {
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            Transaction trans = session.getTransaction();
            trans.begin();
            try {
                String hql = "DELETE Color c WHERE c.colorCode = :code"; 
                Query query = session.createQuery(hql);
                query.setParameter("code", code);
                int result = query.executeUpdate();
                if(result==0){
                    code = 0;
                }
                trans.commit();
            } catch (Exception e) {
                code = -1;
            }
        } 
        return code;
    }
}
