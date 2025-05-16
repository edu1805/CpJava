package org.example.controllers;

import org.example.domainmodel.Moto;
import org.example.services.MotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/motos")
public class MotoController {

    private final MotoService motoService;

    @Autowired
    public MotoController(MotoService motoService) {
        this.motoService = motoService;
    }

    @PostMapping
    public ResponseEntity<Moto> criarMoto(@RequestBody Moto moto) {
        Moto novaMoto = motoService.salvar(moto);
        return ResponseEntity.ok(novaMoto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Moto> buscarPorId(@PathVariable Long id) {
        Moto moto = motoService.buscarPorId(id);
        return ResponseEntity.ok(moto);
    }

    @GetMapping
    public ResponseEntity<List<Moto>> listarTodas() {
        List<Moto> motos = motoService.listarTodas();
        return ResponseEntity.ok(motos);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Moto> atualizarMoto(@PathVariable Long id, @RequestBody Moto dadosAtualizados) {
        Moto atualizada = motoService.atualizar(id, dadosAtualizados);
        return ResponseEntity.ok(atualizada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarMoto(@PathVariable Long id) {
        motoService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
