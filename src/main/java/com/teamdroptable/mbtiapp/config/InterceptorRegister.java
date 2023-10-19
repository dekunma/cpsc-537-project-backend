package com.teamdroptable.mbtiapp.config;

import com.teamdroptable.mbtiapp.common.CommonResponseInterceptor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
@RequiredArgsConstructor
public class InterceptorRegister implements WebMvcConfigurer {

    private final CommonResponseInterceptor commonResponseInterceptor;

    @Override
    public void addInterceptors(final InterceptorRegistry registry) {
        registry.addInterceptor(commonResponseInterceptor);
    }
}
