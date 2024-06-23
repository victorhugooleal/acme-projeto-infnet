package entities;

import domain.Cargo;
import domain.Setor;

import java.util.ArrayList;
import java.util.List;

public class Funcionario implements Reajustavel {
    private String nome;
    private List<String> telefones;
    private String endereco;
    private double salario;
    private Setor setor;
    private Cargo cargo;

    public Funcionario(String nome, String endereco, double salario, Setor setor, Cargo cargo) {
        this.nome = nome;
        this.telefones = new ArrayList<>();
        this.endereco = endereco;
        this.salario = salario;
        this.setor = setor;
        this.cargo = cargo;
    }

    public void addTelefone(String telefone) {
        this.telefones.add(telefone);
    }

    public String getNome() {
        return nome;
    }

    public List<String> getTelefones() {
        return telefones;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getSalario() {
        return salario;
    }

    public Setor getSetor() {
        return setor;
    }

    public Cargo getCargo() {
        return cargo;
    }

    @Override
    public void reajustarSalario(double percentual) {
        this.salario += this.salario * (percentual / 100);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", telefones=" + telefones +
                ", endereco='" + endereco + '\'' +
                ", salario=" + salario +
                ", setor=" + setor +
                ", cargo=" + cargo +
                '}';
    }
}