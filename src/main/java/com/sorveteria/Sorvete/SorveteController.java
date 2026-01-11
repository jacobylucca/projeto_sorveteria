package com.sorveteria.Sorvete;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sorveteria")
@RequiredArgsConstructor

public class SorveteController {

    private final SorveteRepository sorveteRepository;

    @GetMapping
    public List<Sorvete> listar(){

        return sorveteRepository.findAll();
    }
    @PostMapping
    public Sorvete salvar(@RequestBody Sorvete sorvete){

        return sorveteRepository.save(sorvete);
    }
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        sorveteRepository.deleteById(id);
    }
    @PutMapping("/{id}")
    public Sorvete atualizar(@PathVariable Long id, @RequestBody Sorvete sorveteAtualizado) {
        return sorveteRepository.findById(id)
                .map(sorvete -> {
                    sorvete.setSaborSorvete(sorveteAtualizado.getSaborSorvete());
                    sorvete.setMarcaSorvete(sorveteAtualizado.getMarcaSorvete());
                    sorvete.setValorSorvete(sorveteAtualizado.getValorSorvete());
                    return sorveteRepository.save(sorvete);
                }).orElseThrow(() -> new RuntimeException("Sorvete não encontrado!"));
    }
}
