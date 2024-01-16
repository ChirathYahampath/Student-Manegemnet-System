package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class Course {

    private String Name;

    private String code;

    private String fee;

    private String duration;

    private String institute;

    }

