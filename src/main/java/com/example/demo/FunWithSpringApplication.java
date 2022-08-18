package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class FunWithSpringApplication {

	public static void main(String[] args) {
        ApplicationContext xmlContext=new ClassPathXmlApplicationContext("spring.xml");
		ApplicationContext context=SpringApplication.run(FunWithSpringApplication.class, args);
		ApplicationContext configContext=new AnnotationConfigApplicationContext(Phone.class);
		System.out.println("-----------------------------");
		System.out.println("Using Java Annotations with the Address class:");
        Address myHouse=context.getBean(Address.class);
		System.out.println(myHouse);
		System.out.println("-----------------------------");
		System.out.println("Using an XML for DI with the student class:");
		student etude=(student) xmlContext.getBean("student");
		etude.printInfo();
		System.out.println("-----------------------------");
		System.out.println("Using Java Configurations for DI with the Phone class:");
		String number=(String) configContext.getBean("getMob");
		System.out.println(number);
		System.out.println("-----------------------------");
	}

}
