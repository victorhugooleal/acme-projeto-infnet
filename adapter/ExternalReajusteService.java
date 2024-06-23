package adapter;

public class ExternalReajusteService {
    public void adjustSalary(String employeeName, double currentSalary, double percentage) {
        double newSalary = currentSalary + (currentSalary * (percentage / 100));
        System.out.println("External service: Reajustando salário de " + employeeName + " para " + newSalary);
    }
}
