package com.ghsong.restapi.common;

import org.springframework.boot.test.autoconfigure.restdocs.RestDocsMockMvcConfigurationCustomizer;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.restdocs.mockmvc.MockMvcRestDocumentationConfigurer;

import static org.springframework.restdocs.operation.preprocess.Preprocessors.prettyPrint;

// 테스트시 사용하는 Configuration
@TestConfiguration
public class RestDocsConfiguration  {

    @Bean
    public RestDocsMockMvcConfigurationCustomizer restDocsMockMvcConfigurationCustomizer() {
//        return new RestDocsMockMvcConfigurationCustomizer() {
//            @Override
//            public void customize(MockMvcRestDocumentationConfigurer configurer) {
//                configurer.operationPreprocessors()
//                        .withRequestDefaults(prettyPrint())
//                        .withResponseDefaults(prettyPrint())
//                ;
//            }
//        };

        // 람다식으로 변형
        return configurer -> configurer.operationPreprocessors()
                .withRequestDefaults(prettyPrint())
                .withResponseDefaults(prettyPrint());
    }
}
