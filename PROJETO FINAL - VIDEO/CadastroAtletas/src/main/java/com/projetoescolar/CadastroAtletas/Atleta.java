package com.projetoescolar.CadastroAtletas;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "atleta")

public class Atleta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "idade")
    private int idade;

    @Column(name = "posicao")
    private String posicao;
}
