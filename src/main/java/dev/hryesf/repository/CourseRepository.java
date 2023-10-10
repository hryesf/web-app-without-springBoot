package dev.hryesf.repository;

import dev.hryesf.model.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseRepository implements CrudRepository<Course> {

    @Override
    public List<Course> findAll() {

        List<Course> courses;
        courses = new ArrayList<>();

        Course springCourse = new Course(1,
                "Spring bootcamp",
                "In this bootcamp you will learn anything that you need for getting a job",
                "www.springbootcamp.com");

        courses.add(springCourse);
        return courses;
    }
}
