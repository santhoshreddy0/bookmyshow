package org.santhosh.bookmyshow.models;

import java.util.Date;
import java.util.List;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Show extends BaseModel{
    @ManyToOne
    private Movie movie;

    @ManyToOne
    private Screen screen;

    private Date startTime;

    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Feature> features;
}

/*
Show :: Movie => M :: 1
Show :: Screen => M :: 1
*/
