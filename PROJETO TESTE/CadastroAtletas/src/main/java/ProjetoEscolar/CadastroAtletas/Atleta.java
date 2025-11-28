package ProjetoEscolar.CadastroAtletas;

import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "atleta")

public class Atleta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column (name = "id_atleta")
    private long id;

    @Column (name = "nome")
    private String nome;

    @Column (name = "iade")
    private int idade;

    @Column (name = "posicao")
    private String posicao;

}
