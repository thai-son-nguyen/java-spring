import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.spring.fundamental"})
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
