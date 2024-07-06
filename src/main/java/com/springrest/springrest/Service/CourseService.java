package com.springrest.springrest.Service;

import com.springrest.springrest.Model.Course;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CourseService {
    List<Course> getCources();

    Course getCourse(long l);

    Course addCourse(Course course);

    Course updateCourse(int id,Course course);

    void deleteCourses(long l);
}
