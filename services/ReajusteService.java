package services;

import entities.Reajustavel;

public class ReajusteService {
    private static ReajusteService instance;

    private ReajusteService() {}

    public static ReajusteService getInstance() {
        if (instance == null) {
            instance = new ReajusteService();
        }
        return instance;
    }

    public void reajustarSalario(Reajustavel reajustavel, double percentual) {
        reajustavel.reajustarSalario(percentual);
    }
}
