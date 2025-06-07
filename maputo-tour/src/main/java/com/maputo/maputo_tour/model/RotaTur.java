package com.maputo.maputo_tour.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class RotaTur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToMany
    @JoinTable(
        name = "rota_ponto",
        joinColumns = @JoinColumn(name = "rota_id"),
        inverseJoinColumns = @JoinColumn(name = "ponto_id")
    )
    private List<PontoTuristico> pontos;
}
