package com.sorveteria.Sorvete;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SorveteService {

    private final SorveteRepository sorveteRepository;

    public List<Sorvete> listar() {
        return sorveteRepository.findAll();
    }

    public Sorvete salvar(Sorvete sorvete) {
        return sorveteRepository.save(sorvete);
    }

    public void excluir(Long id) {
        sorveteRepository.deleteById(id);
    }

    public Sorvete atualizar(Long id, Sorvete sorveteAtualizado) {
        return sorveteRepository.findById(id)
                .map(sorvete -> {
                    sorvete.setSaborSorvete(sorveteAtualizado.getSaborSorvete());
                    sorvete.setMarcaSorvete(sorveteAtualizado.getMarcaSorvete());
                    sorvete.setEstoqueAtual(sorveteAtualizado.getEstoqueAtual());
                    sorvete.setDataValidade(sorveteAtualizado.getDataValidade());
                    sorvete.setAtivo(sorveteAtualizado.getAtivo());
                    return sorveteRepository.save(sorvete);
                }).orElseThrow(() -> new RuntimeException("Não foi possível realizar a alteração. Tente novamente."));
    }
}
