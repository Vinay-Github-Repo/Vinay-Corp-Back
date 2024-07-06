package com.springrest.springrest.Controller;


import com.springrest.springrest.Model.Course;
import com.springrest.springrest.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    CourseService courseService;


    @GetMapping("/home")
    public String home() {
        return "Welcome to cource home page";
    }

    @GetMapping("/cources")
    public List<Course> getCources() {
        System.out.println("getCources");
        return courseService.getCources();
    }

    @GetMapping("/course/{courseId}")
    public Course getCourse(@PathVariable String courseId) {
        return this.courseService.getCourse(Long.parseLong(courseId));
    }

    @PostMapping("/course")
    public Course addCourse(@RequestBody Course course) {
        System.out.println("addCourse");
        return this.courseService.addCourse(course);
    }

//    @PutMapping("/cources")
//    public Course updateCourse(@RequestBody Course course){
//        System.out.println("updateCourse");
//        return this.courseService.updateCourse(course);
//    }

    @PutMapping("/cources/{id}")
    public Course updateCourse(@PathVariable int id,@RequestBody Course course){
        System.out.println("updateCourse");
        return this.courseService.updateCourse(id, course);
    }


    @DeleteMapping("/courses/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourses(@PathVariable String courseId){
        try{
            System.out.println("deleteCourses");
            this.courseService.deleteCourses(Long.parseLong(courseId));
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
