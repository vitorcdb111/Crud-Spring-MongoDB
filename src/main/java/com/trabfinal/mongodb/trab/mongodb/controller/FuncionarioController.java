package com.trabfinal.mongodb.trab.mongodb.controller;

import com.trabfinal.mongodb.trab.mongodb.model.Funcionario;
import com.trabfinal.mongodb.trab.mongodb.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {
    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping
    public List<Funcionario> obterTodos() {
        return this.funcionarioService.obterTodos();
    }

    @GetMapping("/{codigo}")
    public Funcionario obterPorCodigo(@PathVariable String codigo) {
        return this.funcionarioService.obterPorCodigo(codigo);
    }

    @PostMapping
    public Funcionario criar(@RequestBody Funcionario funcionario) {
        return this.funcionarioService.criar(funcionario);
    }

    @GetMapping("/range")
    public List<Funcionario> obterFuncionariosPorRangeDeIdade(
            @RequestParam("de") Integer de,
            @RequestParam("ate") Integer ate) {
        return this.funcionarioService.obterFuncionariosPorRangeDeIdade(de, ate);
    }

    @GetMapping("/por-nome")
    public List<Funcionario> obterFuncionariosPorNome(
            @RequestParam("nome") String nome) {
        return this.funcionarioService.obterFuncionariosPorNome(nome);
    }
}
