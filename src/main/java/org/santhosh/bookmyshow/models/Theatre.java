package org.santhosh.bookmyshow.models;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Theatre extends BaseModel{
    private String name;
    @OneToMany
    private List<Screen> screens;
}
/*
Theatre :: Screen => 1 :: M
*/