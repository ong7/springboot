package springboot.webservice.reservation.config;

import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.servlet.ServletContext;


@Configuration
@EnableWebMvc
public class AppConfig implements ServletContextInitializer {

    @Override
    public void onStartup(ServletContext servletContext){
            servletContext.addFilter("corsFilter", new CORSFilter());
    }
}
