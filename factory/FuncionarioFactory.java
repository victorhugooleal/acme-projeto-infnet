package factory;

import domain.Cargo;
import domain.Setor;
import entities.Funcionario;

public abstract class FuncionarioFactory {
    public abstract Funcionario createFuncionario(String nome, String endereco, double salario, Setor setor, Cargo cargo);
}
