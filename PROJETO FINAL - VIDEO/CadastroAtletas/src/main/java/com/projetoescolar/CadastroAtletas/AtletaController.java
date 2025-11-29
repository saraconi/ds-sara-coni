package com.projetoescolar.CadastroAtletas;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor

public class AtletaController {


    AtletaRepository atletaRepository;

    @GetMapping("/atleta")
    public List<Atleta> getAllAtletas() {
        return atletaRepository.findAll();
    }

    @GetMapping("/atleta/{id}")
    public Atleta getAtletaById(@PathVariable Long id) {
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
