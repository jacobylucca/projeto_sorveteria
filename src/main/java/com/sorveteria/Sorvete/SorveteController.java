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
}
