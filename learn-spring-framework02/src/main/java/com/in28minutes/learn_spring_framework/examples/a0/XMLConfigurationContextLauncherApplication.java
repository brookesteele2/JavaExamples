package com.in28minutes.learn_spring_framework.examples.a0;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28minutes.learn_spring_framework.game.GameRunner;



@Configuration
@ComponentScan
public class XMLConfigurationContextLauncherApplication {

	public static void main(String[] args) {
		try (var context = new ClassPathXmlApplicationContext("contextConfiguration.xml")) { 			

			// Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("game"));
			context.getBean(GameRunner.class).run();
		}
	}

}
