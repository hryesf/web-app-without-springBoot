package dev.hryesf.config;

import dev.hryesf.repository.CourseRepository;
import dev.hryesf.service.CourseService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    // this is the only place that you can use new keyword

    @Bean("courseRepository")
    public CourseRepository getCourseRepository() {
        return new CourseRepository();
    }

    @Bean("courseService")
    public CourseService getCourseService() {
        return new CourseService(getCourseRepository());
    }
}
