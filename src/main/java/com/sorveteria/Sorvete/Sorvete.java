package com.sorveteria.Sorvete;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

import java.time.LocalDateTime;

@Data
@Entity

public class Sorvete{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long ID;

    private String saborSorvete; 
    private String marcaSorvete; 

    private Double valorVenda; 
    private Double valorCusto;

    private LocalDate dataValidade;

    private Integer estoqueAtual;
    private Integer estoqueMinimo;

    private Boolean contemLactose;
    private Boolean ativo = true;

    @CreationTimestamp
    private LocalDateTime dataCadastro;


}
