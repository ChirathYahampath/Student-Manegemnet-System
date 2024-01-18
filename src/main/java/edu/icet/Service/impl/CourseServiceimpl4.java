package edu.icet.Service.impl;

import edu.icet.Service.CourseServise;
import edu.icet.dto.Course;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceimpl4 implements CourseServise {

    @Value("${application.institute}")
    String institute;
    public List<Course>getCourses(){

        ArrayList<Course> courseList = new ArrayList();
        courseList.add(new Course("Icet java master ",
                "ICm",
                "70000",
                "6",institute));

        courseList.add(new Course("Icet Java Developer",
                "ICd",
                "80000",
                "8",institute));

        return courseList;
    }

}
