package br.com.inheritance.jpa.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class OrderHeader extends BaseEntity{
    private String customerName;
}
