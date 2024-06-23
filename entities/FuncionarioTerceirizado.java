package entities;

import domain.Cargo;
import domain.Setor;

public class FuncionarioTerceirizado extends Funcionario {
    private String empresaContratada;
    private int tempoPrevistoPermanencia;

    public FuncionarioTerceirizado(String nome, String endereco, double salario, Setor setor, Cargo cargo, String empresaContratada, int tempoPrevistoPermanencia) {
        super(nome, endereco, salario, setor, cargo);
        this.empresaContratada = empresaContratada;
        this.tempoPrevistoPermanencia = tempoPrevistoPermanencia;
    }

    public String getEmpresaContratada() {
        return empresaContratada;
    }

    public int getTempoPrevistoPermanencia() {
        return tempoPrevistoPermanencia;
    }

    @Override
    public void reajustarSalario(double percentual) {
        // Funcionários terceirizados não recebem reajuste
        System.out.println("Funcionário terceirizado não recebe reajuste salarial.");
    }

    @Override
    public String toString() {
        return "FuncionarioTerceirizado{" +
                "empresaContratada='" + empresaContratada + '\'' +
                ", tempoPrevistoPermanencia=" + tempoPrevistoPermanencia +
                ", " + super.toString() +
                '}';
    }
}
