package org.santhosh.bookmyshow.models;

import java.util.List;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Movie extends BaseModel{
    private String name;
    @ManyToMany
    private List<Actor> actors;

    private String duration;
    private double rating;
    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Genre> genres;
}

/*
* Movie :: Actor => M :: M
* */
