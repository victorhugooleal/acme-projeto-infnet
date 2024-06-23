import domain.Cargo;
import domain.Setor;
import entities.Funcionario;
import entities.FuncionarioTerceirizado;
import services.ReajusteService;

public class Main {
    public static void main(String[] args) {
        AppInitializer initializer = new AppInitializer();

        Funcionario f1 = initializer.createFuncionario(
                "Anna",
                "Av dom elder camara 3443, bloco 3 ap 201",
                2000,
                Setor.BANCO_DE_DADOS,
                Cargo.JUNIOR);
        f1.addTelefone("98352-6225");
        f1.addTelefone("95226-2538");

        FuncionarioTerceirizado ft1 = initializer.createFuncionarioTerceirizado(
                "Victor",
                "Rua Alaíde 31, casa 1",
                12000,
                Setor.DESENVOLVIMENTO,
                Cargo.SENIOR);
        ft1.addTelefone("96454-5144");

        System.out.println(f1);
        System.out.println(ft1);

        ReajusteService reajusteService = ReajusteService.getInstance();
        System.out.println("Reajustando salários...");
        reajusteService.reajustarSalario(f1, 10);
        reajusteService.reajustarSalario(ft1, 10);

        System.out.println(f1);
        System.out.println(ft1);
    }
}
