import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jay.spring.springjavaconfig.configclass.SpringConfig;
import com.jay.spring.springjavaconfig.dao.Dao;
import com.jay.spring.springjavaconfig.service.DaoService;

public class TestJavaConfig {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		DaoService dao = context.getBean(DaoService.class);
		dao.save();
		context.close();
	}

}
