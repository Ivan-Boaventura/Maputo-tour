package com.maputo.maputo_tour.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Publicacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;
    private String imagemUrl;
    
    private LocalDateTime dataPublicacao;

    @ManyToOne
    private Usuario autor;

    @ManyToOne
    private PontoTuristico ponto;
}
