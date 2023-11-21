package org.santhosh.bookmyshow.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class City extends BaseModel{
    private String name;
    @OneToMany
    private List<Theatre> theatres;

}
// Cty :: Theatre ==> 1 :: M