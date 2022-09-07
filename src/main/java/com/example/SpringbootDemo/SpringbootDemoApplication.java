package com.example.SpringbootDemo;

import com.example.SpringbootDemo.Component.ComponentDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringbootDemoApplication {

	public static void main(String[] args) {

		/**AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.example.SpringbootDemo");
		// as we dont want the previous session , to be called from the cache memory //
		context.refresh();

		ComponentDemo componentDemo = context.getBean(ComponentDemo.class);

		componentDemo.demoFunction();

		context.close();**/
		SpringApplication.run(SpringbootDemoApplication.class,args);

	}

}
