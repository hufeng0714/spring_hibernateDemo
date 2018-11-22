package com.how2java.test;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.how2java.dao.CategoryDAO;
import com.how2java.pojo.Category;

public class TestSpring03 {

	/*
	 * ��ҳ
		Spring��Hibernate�����ǽ���HibernateTemplate���е�. 
		��ҳ��ѯ����ֱ��ʹ��hibernate�������� 
		��Ҫ���õ�DetachedCriteria����
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[]{"applicationContext.xml"});
		CategoryDAO dao = (CategoryDAO) context.getBean("dao");
        
        DetachedCriteria dc = DetachedCriteria.forClass(Category.class);
        int start =5;//�Ӷ��ٿ�ʼ��ѯ
        int count =10;//ÿҳ��ʾ����
        List<Category> cs= dao.findByCriteria(dc,start,count);
        System.out.println(cs);
	}
}
