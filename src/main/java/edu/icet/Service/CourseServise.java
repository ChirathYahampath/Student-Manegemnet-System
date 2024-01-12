package edu.icet.Service;

import edu.icet.dto.Course;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CourseServise {
    public List<Course> getCourses();

}
