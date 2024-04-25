package br.com.inheritance.jpa.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
@DiscriminatorValue(value = "truck")
public class Truck extends Vehicle{
    private Integer payload;
}
