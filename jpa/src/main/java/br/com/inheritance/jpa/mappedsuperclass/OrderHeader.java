package br.com.inheritance.jpa.mappedsuperclass;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class OrderHeader extends BaseEntity{
    private String customerName;
}
