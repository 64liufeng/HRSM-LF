package com.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.service.ServiceRegistryBuilder;

import javax.imageio.spi.ServiceRegistry;
import javax.security.auth.login.Configuration;

public class MySessionFactory {
    private static SessionFactory sessionFactory = null;
    private static Session session = null;

    static {
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        ServiceRegistryBuilder builder = new ServiceRegistryBuilder();
        builder.applySettings(config.getProperties());
        ServiceRegistry registry = builder.buildServiceRegistry();
        sessionFactory = config.buildSessionFactory(registry);
    }

    public static Session getSession(){
        session = sessionFactory.openSession();
        return session;
    }
}
