package br.com.inheritance.jpa.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
/*
* Jardel Rodrigues
*/

@Entity
@Data
@DiscriminatorValue(value = "car")
public class Car extends Vehicle{

    private String trimLevel;
}
