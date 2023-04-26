//package com.aeologic.echallan.gateway.config;
//
//import java.io.FileReader;
//import java.io.IOException;
//
//import org.springframework.context.annotation.Bean;
//import org.xmlpull.v1.XmlPullParserException;
//
//import io.swagger.models.Model;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//@org.springframework.context.annotation.Configuration
//@EnableSwagger2
//public class SwaggerConfig {
//	
//	@Bean
//	public Docket api() throws IOException, XmlPullParserException {
//	   MavenXpp3Reader reader = new MavenXpp3Reader();
//	   Model model = reader.read(new FileReader("pom.xml"));
//	   return new Docket(DocumentationType.SWAGGER_2)
//	      .select()
//	      .apis(RequestHandlerSelectors.basePackage("pl.piomin.microservices.advanced.account."))
//	      .paths(PathSelectors.any())
//	      .build().apiInfo(new ApiInfo("Account Service Api Documentation", "Documentation automatically generated", model.getParent().getVersion(), null, new Contact("Piotr Mińkowski", "piotrminkowski.wordpress.com", "piotr.minkowski@gmail.com"), null, null));
//	}
//
//}