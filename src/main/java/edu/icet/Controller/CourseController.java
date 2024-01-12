package edu.icet.Controller;

import edu.icet.Service.CourseServise;
import edu.icet.dto.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseServise courseService;

    @GetMapping("/courses/List")
    public List<Course> getCourses(){
        List<Course> Courses = courseService.getCourses();
        return Courses;

    }
}


