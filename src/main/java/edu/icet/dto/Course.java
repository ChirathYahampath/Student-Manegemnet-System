package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class Course {

    private String Name;

    private String Code;

    private String Fee;

    private String Duration;

    private String Institute;

    }

