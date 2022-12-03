/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17326.group1.config;

<<<<<<< HEAD
import com.poly.it17326.group1.domainmodel.Category;
import com.poly.it17326.group1.domainmodel.Fabric;
import com.poly.it17326.group1.domainmodel.Images;
import com.poly.it17326.group1.domainmodel.Product;
import com.poly.it17326.group1.domainmodel.ProductDetails;
import com.poly.it17326.group1.domainmodel.Unit;
import java.awt.Color;
=======
import com.poly.it17326.group1.domainmodel.Account;
import com.poly.it17326.group1.domainmodel.Category;
import com.poly.it17326.group1.domainmodel.Color;
import com.poly.it17326.group1.domainmodel.Customer;
import com.poly.it17326.group1.domainmodel.Fabric;
import com.poly.it17326.group1.domainmodel.Images;
import com.poly.it17326.group1.domainmodel.Order;
import com.poly.it17326.group1.domainmodel.OrderDetails;
import com.poly.it17326.group1.domainmodel.Position;
import com.poly.it17326.group1.domainmodel.Product;
import com.poly.it17326.group1.domainmodel.ProductDetails;
import com.poly.it17326.group1.domainmodel.Unit;
>>>>>>> c8b9141eb7ccda78b3616b908981855292401965
import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author goito
 */
public class HibernateUtil {

    private static final SessionFactory FACTORY;

    static {
        Configuration conf = new Configuration();

        Properties properties = new Properties();
        properties.put(Environment.DIALECT, "org.hibernate.dialect.SQLServerDialect");
        properties.put(Environment.DRIVER, "com.microsoft.sqlserver.jdbc.SQLServerDriver");
        properties.put(Environment.URL, "jdbc:sqlserver://localhost:1433;databaseName=IT17326_VI_DA_HANDMATE");
        properties.put(Environment.USER, "sa");
        properties.put(Environment.PASS, "songlong");
        properties.put(Environment.SHOW_SQL, "true");

        conf.setProperties(properties);
        conf.addAnnotatedClass(Category.class);
        conf.addAnnotatedClass(Color.class);
        conf.addAnnotatedClass(Fabric.class);
        conf.addAnnotatedClass(Images.class);
        conf.addAnnotatedClass(Product.class);
        conf.addAnnotatedClass(Unit.class);
        conf.addAnnotatedClass(ProductDetails.class);
<<<<<<< HEAD
=======
        conf.addAnnotatedClass(Order.class);
        conf.addAnnotatedClass(OrderDetails.class);
        conf.addAnnotatedClass(Account.class);
        conf.addAnnotatedClass(Position.class);
        conf.addAnnotatedClass(Customer.class);
>>>>>>> c8b9141eb7ccda78b3616b908981855292401965

        ServiceRegistry registry = new StandardServiceRegistryBuilder()
                .applySettings(conf.getProperties()).build();
        FACTORY = conf.buildSessionFactory(registry);

    }

    public static SessionFactory getFACTORY() {
        return FACTORY;
    }

    public static void main(String[] args) {
        getFACTORY();
    }
}
