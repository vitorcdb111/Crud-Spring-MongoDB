package com.trabfinal.mongodb.trab.mongodb.service;

import com.trabfinal.mongodb.trab.mongodb.model.Funcionario;

import java.util.List;

public interface FuncionarioService {

    public List<Funcionario> obterTodos();

    public Funcionario obterPorCodigo(String codigo);

    public Funcionario criar(Funcionario funcionario);

    public List<Funcionario> obterFuncionariosPorRangeDeIdade(Integer de, Integer ate);

    public List<Funcionario> obterFuncionariosPorNome(String nome);

}
