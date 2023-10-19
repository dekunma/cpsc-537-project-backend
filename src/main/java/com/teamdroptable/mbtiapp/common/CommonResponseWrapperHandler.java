package com.teamdroptable.mbtiapp.common;

import java.util.Objects;

import com.teamdroptable.mbtiapp.enums.ResponseCode;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

@ControllerAdvice
public class CommonResponseWrapperHandler implements ResponseBodyAdvice<Object> {
    @Override
    public boolean supports(@Nullable final MethodParameter returnType,
                            @Nullable final Class converterType) {
        final var requestAttributes = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes());
        final var request = Objects.requireNonNull(requestAttributes).getRequest();
        final var expectedAttribute = request.getAttribute(CommonResponseInterceptor.COMMON_RESPONSE_WRAPPER_AWARE);

        return Objects.nonNull(expectedAttribute);
    }

    @Override
    public Object beforeBodyWrite(final Object body,
                                  @NonNull final MethodParameter returnType,
                                  @NonNull final MediaType selectedContentType,
                                  @NonNull final Class selectedConverterType,
                                  @NonNull final ServerHttpRequest request,
                                  @NonNull final ServerHttpResponse response) {
        if (body instanceof ResponseCode) {

            final var responseCode = (ResponseCode) body;
            return CommonResponse.fail(responseCode);
        }

        return CommonResponse.success(body);
    }
}
