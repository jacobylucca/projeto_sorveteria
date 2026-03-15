package com.sorveteria.Sorvete;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sorveteria")
@RequiredArgsConstructor
public class SorveteController {

    private final SorveteService sorveteService;

    @GetMapping
    public List<Sorvete> listar() {
        return sorveteService.listar();
    }

    @PostMapping
    public Sorvete salvar(@RequestBody Sorvete sorvete) {
        return sorveteService.salvar(sorvete);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        sorveteService.excluir(id);
    }

    @PutMapping("/{id}")
    public Sorvete atualizar(@PathVariable Long id, @RequestBody Sorvete sorveteAtualizado) {
        return sorveteService.atualizar(id, sorveteAtualizado);
    }
}
