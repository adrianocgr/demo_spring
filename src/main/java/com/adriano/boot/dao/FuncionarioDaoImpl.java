package com.adriano.boot.dao;

import org.springframework.stereotype.Repository;

import com.adriano.boot.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

}
