package adapter;

import entities.Reajustavel;

public class ExternalReajusteServiceAdapter implements Reajustavel {
    private ExternalReajusteService externalService;
    private String nome;
    private double salario;

    public ExternalReajusteServiceAdapter(ExternalReajusteService externalService, String nome, double salario) {
        this.externalService = externalService;
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public void reajustarSalario(double percentual) {
        externalService.adjustSalary(nome, salario, percentual);
    }
}
