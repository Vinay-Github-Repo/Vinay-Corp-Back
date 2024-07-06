package com.springrest.springrest.Service.Impl;

import com.springrest.springrest.Model.Course;
import com.springrest.springrest.Repository.CourseRepository;
import com.springrest.springrest.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {


    @Autowired
    CourseRepository courseRepository;

    @Override
    public List<Course> getCources() {
        return this.courseRepository.findAll();
    }

    @Override
    public Course getCourse(long l) {
        return this.courseRepository.findById(l).get();
    }

    @Override
    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course updateCourse(int id,Course course) {

        Course c = courseRepository.findById((long)id).get();
        c.setTitle(course.getTitle());
        c.setDescription(course.getDescription());
        return courseRepository.save(c);
    }

    @Override
    public void deleteCourses(long l) {
        courseRepository.deleteById(l);
    }
}
