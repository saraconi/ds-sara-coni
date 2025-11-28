package ProjetoEscolar.CadastroAtletas;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@AllArgsConstructor
public class AtletaController {

    @Autowired
    AtletaRepository atletaRepository;

    @GetMapping("/atleta")
    public List<Atleta> getAllAtleta(){
        return atletaRepository.findAll();
    }

    @GetMapping("/atleta/id")
    private  Atleta getAtletaById(@PathVariable Long id) {
        return atletaRepository.findById(id).get();
    }

    @PostMapping("/atleta")
    public Atleta save(@RequestBody Atleta atleta) {
        return atletaRepository.save(atleta);
    }

    @DeleteMapping("/atleta/{id}")
    public void delete(@PathVariable Long id) {
        atletaRepository.deleteById(id);
    }
}
