package strategy;

import entities.Funcionario;
public class FuncionarioReajusteStrategy implements ReajusteStrategy {
    private Funcionario funcionario;

    public FuncionarioReajusteStrategy(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public void reajustar(double percentual) {
        funcionario.reajustarSalario(percentual);
    }
}
