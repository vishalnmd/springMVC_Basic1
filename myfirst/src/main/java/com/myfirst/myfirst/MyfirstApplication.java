package com.myfirst.myfirst;
import org.springframework.context.ApplicationContext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyfirstApplication {

	public static void main(String[] args) {
		
//		binarySearchImp obj = new binarySearchImp(new BubbleSort());
//		
//		obj.ElementTobeFind(new int[] {1,2,3,45}, 5);
		
		ApplicationContext applicationContext = SpringApplication.run(MyfirstApplication.class, args);
		
		binarySearchImp obj = applicationContext.getBean(binarySearchImp.class);
	}

}
