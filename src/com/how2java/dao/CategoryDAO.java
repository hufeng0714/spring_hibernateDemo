package com.how2java.dao;

import org.springframework.orm.hibernate3.HibernateTemplate;

//DAO继承HibernateTemplete，而HibernateTemplete类里有一个setSessionFactory用于接收sessionFactory的注入
public class CategoryDAO extends HibernateTemplate{

}
