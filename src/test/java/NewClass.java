
import com.poly.it17326.group1.config.HibernateUtil;
import com.poly.it17326.group1.domainmodel.Order;
import org.hibernate.Session;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author goito
 */
public class NewClass {
    public static void main(String[] args) {
        try(Session session = HibernateUtil.getFACTORY().openSession()){
        }
    }
}
