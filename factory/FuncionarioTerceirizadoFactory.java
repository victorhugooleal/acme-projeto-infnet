package factory;

import domain.Cargo;
import domain.Setor;
import entities.FuncionarioTerceirizado;

public class FuncionarioTerceirizadoFactory extends FuncionarioFactory {
    private String empresaContratada;
    private int tempoPrevistoPermanencia;

    public FuncionarioTerceirizadoFactory(String empresaContratada, int tempoPrevistoPermanencia) {
        this.empresaContratada = empresaContratada;
        this.tempoPrevistoPermanencia = tempoPrevistoPermanencia;
    }

    @Override
    public FuncionarioTerceirizado createFuncionario(String nome, String endereco, double salario, Setor setor, Cargo cargo) {
        return new FuncionarioTerceirizado(nome, endereco, salario, setor, cargo, empresaContratada, tempoPrevistoPermanencia);
    }
}