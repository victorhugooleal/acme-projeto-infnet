package strategy;

import entities.FuncionarioTerceirizado;

public class FuncionarioTerceirizadoReajusteStrategy implements ReajusteStrategy {
    private FuncionarioTerceirizado funcionarioTerceirizado;

    public FuncionarioTerceirizadoReajusteStrategy(FuncionarioTerceirizado funcionarioTerceirizado) {
        this.funcionarioTerceirizado = funcionarioTerceirizado;
    }

    @Override
    public void reajustar(double percentual) {
        funcionarioTerceirizado.reajustarSalario(percentual);
    }
}
