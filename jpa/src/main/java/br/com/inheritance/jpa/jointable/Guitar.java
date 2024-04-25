package br.com.inheritance.jpa.jointable;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Guitar extends Instrument{

    private Integer numsOfStrings;
}
