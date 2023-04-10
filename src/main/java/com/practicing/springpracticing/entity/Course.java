package com.practicing.springpracticing.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Entity
public class Course implements Serializable {
    @Serial
    private static final long serialVersionUID = 1678776331219891025L;

    @Id
    private Integer id;
    //@Column (name = "name")//not required - names matches
    private String name;
    private String author;

}
