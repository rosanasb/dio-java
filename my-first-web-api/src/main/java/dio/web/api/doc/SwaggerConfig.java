package dio.web.api.doc;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {
	@Bean
	public OpenAPI customOpenAPI(){
		return new OpenAPI()
				.info(new Info()
						.title("REST API")
	                    .version("1.0")
	                    .description("API exemplo de uso de Springboot REST API")
	                    .termsOfService("Termo de uso: Open Source")
	                    .license(new License()
	                    		.name("Licenca - Sua Empresa")
	                    		.url("https://www.seusite.com.br"))
						.contact(new Contact()
								.name("Rosana")
								.url("https://www.seusite.com.br")
								.email("seuemail@email.com.br")));
	}
	@Bean
	public GroupedOpenApi publicApi() {
		return GroupedOpenApi.builder()
				.group("public")
	            .pathsToMatch("/api/**")
	            .build();
	}
}
