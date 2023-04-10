package com.practicing.springpracticing.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Course {
    private Integer id;
    private String name;
    private String author;

}
