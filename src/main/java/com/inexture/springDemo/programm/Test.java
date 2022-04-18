package com.inexture.springDemo.programm;

import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		PushPop pushPop = context.getBean("pushpop", PushPop.class);
		while (true) {
			System.out.println("Enter 1 for push");
			System.out.println("Enter 2 for pop");
			System.out.println("Enter 3 for show");
			System.out.println("Enter 0 for Exit");
			int key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("Enter Number for push operation: ");
				int push = sc.nextInt();
				break;

			case 2:
				System.out.println(" pop operation: ");
				pushPop.getStack().pop();
				break;

			case 3:
				System.out.println(" show: ");
				for (Integer it : pushPop.getStack()) {
					System.out.println(it);
				}
				break;
			case 0:
				System.exit(0);
			default:
				break;
			}
		}
	}
}
