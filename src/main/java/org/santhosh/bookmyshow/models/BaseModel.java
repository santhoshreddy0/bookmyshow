package org.santhosh.bookmyshow.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public class BaseModel {
//    This class will contain the common attributes to all Model
    @Id //TO MAKE PRIMARY KEY
    @GeneratedValue(strategy = GenerationType.IDENTITY)//FOR AUTO INCREMENT
    private Long id;
    private Date createdAt;
    private Date lastModifiedAt;

}
