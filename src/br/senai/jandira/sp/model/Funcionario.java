package br.senai.jandira.sp.model;
abstract class Funcionario {

    private String nome;
    private int cpf, salario;

    public Funcionario(String nome, int cpf, int salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public abstract double calcularSalario();
    public String getNome() {
        return nome;
    }
    public int getCpf() {
        return cpf;
    }
    public int getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}