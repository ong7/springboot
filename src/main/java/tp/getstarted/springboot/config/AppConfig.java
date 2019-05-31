package tp.getstarted.springboot.config;

import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;


@Configuration
@EnableWebMvc
public class AppConfig implements ServletContextInitializer {

    @Override
    public void onStartup(ServletContext servletContext){
            servletContext.addFilter("corsFilter", new CORSFilter());
    }
}
