package dev.hryesf.service;

import dev.hryesf.model.Course;
import dev.hryesf.repository.CourseRepository;

import java.util.List;
import java.util.Optional;

public class CourseService implements CrudService<Course>{

    private final CourseRepository courseRepository;
    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public List<Course> list() {
        return this.courseRepository.findAll();
    }

    @Override
    public Optional<Course> get(int id) {
        return Optional.empty();
    }

    @Override
    public Course create(Course course) {
        return null;
    }

    @Override
    public void update(int id, Course course) {

    }

    @Override
    public void delete(int id) {

    }
}
