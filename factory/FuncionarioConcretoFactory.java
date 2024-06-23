package factory;

import domain.Cargo;
import domain.Setor;
import entities.Funcionario;

public class FuncionarioConcretoFactory extends FuncionarioFactory {
    @Override
    public Funcionario createFuncionario(String nome, String endereco, double salario, Setor setor, Cargo cargo) {
        return new Funcionario(nome, endereco, salario, setor, cargo) {};
    }
}
