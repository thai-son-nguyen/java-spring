import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"com.spring.fundamental"})
@PropertySource("app.properties")
public class AppConfig {
//	@Bean(name="customerRepository")
//	public CustomerRepository getCustomerRepository() {
//		return new HibernateCustomerRepositoryImpl();
//	}
//	
//	@Bean(name="customerService")
//	public CustomerService getCustomerService() {
//		return new CustomerServiceImpl(getCustomerRepository());
//	}
}
