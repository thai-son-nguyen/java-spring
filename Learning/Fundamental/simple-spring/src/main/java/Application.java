import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.fundamental.service.CustomerService;

/**
 * @author Thai
 *
 */
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService service = context.getBean("customerService", CustomerService.class);
		System.out.println(service.findAll().stream().findFirst().get().getFirstname());
	}

}
