package com.in28minutes.learn_spring_framework.examples.a1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
//Your Business Class
class YourBusinessClass {
//field injection
	Dependency1 dependency1;
	Dependency2 dependency2;
//setter injection
	// @Autowired
	// public void setDependency1(Dependency1 dependency1) {
	// System.out.println("setter injection - setDependency1 ");
	// this.dependency1 = dependency1;
	// }
//
	// @Autowired
	// public void setDependency2(Dependency2 dependency2) {
	// System.out.println("setter injection - setDependency2 ");
	// this.dependency2 = dependency2;
	// }
//constructor injection should always use (works without autowired)
	@Autowired
	public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		System.out.println("Constructor Injection - ");
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}

	@Override
	public String toString() {
		return "Using " + dependency1 + " and " + dependency2;
	}
}

//Dependency1
@Component
class Dependency1 {

}

//Dependency2
@Component
class Dependency2 {

}


@Configuration
@ComponentScan
public class DepInjectionLauncherApplication {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.print(context.getBean(YourBusinessClass.class));
		}
	}

}