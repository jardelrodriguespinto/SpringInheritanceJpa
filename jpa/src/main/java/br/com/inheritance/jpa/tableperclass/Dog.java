package br.com.inheritance.jpa.tableperclass;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Dog extends Mammel{

    private boolean hasSpots;

}
