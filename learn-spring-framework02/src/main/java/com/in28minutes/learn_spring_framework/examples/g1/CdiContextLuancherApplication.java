package com.in28minutes.learn_spring_framework.examples.g1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.learn_spring_framework.examples.c1.DataService;

import jakarta.inject.Inject;
import jakarta.inject.Named;

//@Component
@Named
class BusinessService {
	private DataService dataService;

	// @Autowired
	@Inject
	public void setDataService(DataService dataService) {
		System.out.println("Setter Injection Performed");
		this.dataService = dataService;
	}

	public DataService getDataService() {
		return dataService;
	}


}

@Configuration
@ComponentScan
public class CdiContextLuancherApplication {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(CdiContextLuancherApplication.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(BusinessService.class).getDataService());
		}
	}

}
