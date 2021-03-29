package com.gaching.gachingwebservice.config;

import com.gaching.gachingwebservice.config.auth.LoginUserArgumentResolver;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/* HandlerMethodArgumentResolver는 항상 WebMvcConfigurer의
addArgumentResolvers를 통해 추가해야 함 */
@RequiredArgsConstructor
@Configuration
public class WebConfig implements WebMvcConfigurer {
  private final LoginUserArgumentResolver loginUserArgumentResolver;

  @Override
  public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
    argumentResolvers.add(loginUserArgumentResolver);
  }

  // react에서 Cross Origin Resource Sharing 문제 해결을 위함
  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry
        .addMapping("/api/**")
        .allowedOrigins("http://localhost:3000")
    ;
  }


}
