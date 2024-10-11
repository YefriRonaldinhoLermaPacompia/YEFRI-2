package pe.edu.upeu.sysalmacenfx;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SysAlmacenFxApplication {

	public static void main(String[] args) {
		SpringApplication.run(SysAlmacenFxApplication.class, args);
	}

	//@Bean
	//public CommandLineRunner run(ApplicationContext context) { return args -> {
		//MainX mx = context.getBean(MainX.class);
		//mx.menu();
	//};
	//}//
	@Bean
	public CommandLineRunner RUN2(ApplicationContext context) { return args -> {
		MainY my = context.getBean(MainY.class);
		my.menu();
	};
	}

}
