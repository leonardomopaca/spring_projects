package com.practicing.springpracticing.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
//@Entity
public class Course {
    //@Id
    private Integer id;
    //@Column (name = "name")//not required - names matches
    private String name;
    private String author;

}
