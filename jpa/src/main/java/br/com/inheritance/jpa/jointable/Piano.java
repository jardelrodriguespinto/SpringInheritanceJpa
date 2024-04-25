package br.com.inheritance.jpa.jointable;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Piano extends Instrument{

    private Integer numsOfKeys;
}
