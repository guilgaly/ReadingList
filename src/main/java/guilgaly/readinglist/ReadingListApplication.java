package guilgaly.readinglist;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class ReadingListApplication extends WebMvcConfigurerAdapter {

	public static void main(final String[] args) {
		SpringApplication.run(ReadingListApplication.class, args);
	}

    @Override
    public void addViewControllers(final ViewControllerRegistry registry) {
        registry.addViewController("login").setViewName("login");
    }

//    @Override
//    public void addArgumentResolvers(final List<HandlerMethodArgumentResolver> argumentResolvers) {
//        // TODO Auto-generated method stub
//        super.addArgumentResolvers(argumentResolvers);
//    }
//	
//	
}
