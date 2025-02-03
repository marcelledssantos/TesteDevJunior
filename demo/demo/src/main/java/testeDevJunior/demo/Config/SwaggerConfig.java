package testeDevJunior.demo.Config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class SwaggerConfig {
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("REST API - TestDevJunior ")
                                .description("Teste tecnico para vaga de desenvolvedor júnior")
                                .version("v1")
                                .contact(new Contact().name("Marcelle Santos").email("marcelledossantos2@gmail.com"))
                );

    }
}
