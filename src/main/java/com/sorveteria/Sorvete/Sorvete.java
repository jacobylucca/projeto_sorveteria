package com.sorveteria.Sorvete;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Data
@Entity

public class Sorvete{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long ID;
    private String saborSorvete;
    private String marcaSorvete;
    private Double valorSorvete;

}