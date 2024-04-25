package br.com.inheritance.jpa.jointable;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class EletricGuitar extends Guitar{
    private Integer numsOfPickups;
}
