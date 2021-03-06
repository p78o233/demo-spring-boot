package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@EnableWebMvc
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //为当前包路径
                .apis(RequestHandlerSelectors.basePackage("com.example.demo.controller.pt"))
                .paths(PathSelectors.any())
                .build().groupName("parttime_job");
//        return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class)).build();
    }
    //构建 api文档的详细信息函数,注意这里的注解引用的是哪个
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //页面标题
                .title("Spring Boot 使用 Swagger2")
                //版本号
                .version("1.0")
                //描述
                .description("API 描述")
                .build();
    }


    @Bean
    public Docket createRestLotteryApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfoLottery())
                .select()
                //为当前包路径
                .apis(RequestHandlerSelectors.basePackage("com.example.demo.controller.lottery"))
                .paths(PathSelectors.any())
                .build().groupName("lottery");
//        return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class)).build();
    }
    //构建 api文档的详细信息函数,注意这里的注解引用的是哪个
    private ApiInfo apiInfoLottery() {
        return new ApiInfoBuilder()
                //页面标题
                .title("Spring Boot 使用 Swagger2")
                //版本号
                .version("1.0")
                //描述
                .description("API 描述")
                .build();
    }


    @Bean
    public Docket createRestApiDefault() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfoDefault())
                .select()
                //为当前包路径
                .apis(RequestHandlerSelectors.basePackage("com.example.demo.controller"))
                .paths(PathSelectors.any())
                .build();
//        return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class)).build();
    }
    //构建 api文档的详细信息函数,注意这里的注解引用的是哪个
    private ApiInfo apiInfoDefault() {
        return new ApiInfoBuilder()
                //页面标题
                .title("Spring Boot 使用 Swagger2")
                //版本号
                .version("1.0")
                //描述
                .description("API 描述 默认")
                .build();
    }
}
