package com.example.Batflix.v20.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Movie {
    private Long id;
    private String title;
    private String description;
    private String rating;
    private String city;
    private String year;

}
