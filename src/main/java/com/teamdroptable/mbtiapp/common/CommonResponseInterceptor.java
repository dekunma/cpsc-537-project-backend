package com.teamdroptable.mbtiapp.common;

import lombok.extern.log4j.Log4j2;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Log4j2
@Component
public class CommonResponseInterceptor implements HandlerInterceptor {

    public static final String COMMON_RESPONSE_WRAPPER_AWARE = "COMMON_RESPONSE_WRAPPER_AWARE";

    @Override
    public boolean preHandle(@NonNull final HttpServletRequest request,
                             @NonNull final HttpServletResponse response,
                             @NonNull final Object handler) {

        if (handler instanceof HandlerMethod) {
            final var handlerMethod = (HandlerMethod) handler;
            final Class<?> clazz = handlerMethod.getBeanType();
            final var method = handlerMethod.getMethod();

            if (clazz.isAnnotationPresent(CommonResponseWrapper.class)) {
                request.setAttribute(COMMON_RESPONSE_WRAPPER_AWARE, clazz.getAnnotation(CommonResponseWrapper.class));
            } else if (method.isAnnotationPresent(CommonResponseWrapper.class)) {
                request.setAttribute(COMMON_RESPONSE_WRAPPER_AWARE, method.getAnnotation(CommonResponseWrapper.class));
            }

        }
        return true;
    }
}
