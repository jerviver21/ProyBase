package edu.paideia.base;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import edu.paideia.base.repository.EmpleadoRepository;


// Indica a Spring que este objeto es de configuración
@Configuration
//Se habilita el repositorio de spring
@EnableJpaRepositories(basePackageClasses = EmpleadoRepository.class)
//Enciende Spring WebMVC esto habilita el DispatcherServlet, para activar Jackson.
@EnableWebMvc
//Indica a Spring que busque las clases dentro de este paquete que esten anotadas
@ComponentScan
//Permite la inyección de dependencias anotadas con Autowired
@EnableAutoConfiguration
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}

