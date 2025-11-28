package com.projeto.cadastro_usuario.Infrastructure.entitys;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table
@Entity (name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column (name = "email", unique = true)
    private String email;

    @Column(name = "nome")
    private String nome;

    @Column(name = "idade")
    private int idade;




}
