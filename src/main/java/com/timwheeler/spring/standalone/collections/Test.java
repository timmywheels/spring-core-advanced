package com.timwheeler.spring.standalone.collections;

import com.timwheeler.spring.autowiring.annotations.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("standaloneListsConfig.xml");
        ProductsList productsList = (ProductsList) context.getBean("productsList");
        System.out.println(productsList);
    }

}
