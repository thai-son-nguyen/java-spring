import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.fundamental.service.CustomerService;

/**
 * @author Thai
 *
 */
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		CustomerService service = context.getBean("customerService", CustomerService.class);
		CustomerService service2 = context.getBean("customerService", CustomerService.class);
		
		System.out.println(service);
		System.out.println(service2);
		
		System.out.println(service.findAll().stream().findFirst().get().getFirstname());
	}

}
