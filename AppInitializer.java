import domain.Cargo;
import domain.Setor;
import factory.FuncionarioConcretoFactory;
import factory.FuncionarioTerceirizadoFactory;
import entities.Funcionario;
import entities.FuncionarioTerceirizado;

public class AppInitializer {
    private FuncionarioConcretoFactory funcionarioFactory;
    private FuncionarioTerceirizadoFactory funcionarioTerceirizadoFactory;

    public AppInitializer() {
        this.funcionarioFactory = new FuncionarioConcretoFactory();
        this.funcionarioTerceirizadoFactory = new FuncionarioTerceirizadoFactory("Empresa TTY", 12);
    }

    public Funcionario createFuncionario(String nome, String endereco, double salario, Setor setor, Cargo cargo) {
        return funcionarioFactory.createFuncionario(nome, endereco, salario, setor, cargo);
    }

    public FuncionarioTerceirizado createFuncionarioTerceirizado(String nome, String endereco, double salario, Setor setor, Cargo cargo) {
        return funcionarioTerceirizadoFactory.createFuncionario(nome, endereco, salario, setor, cargo);
    }
}
