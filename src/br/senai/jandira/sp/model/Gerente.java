package br.senai.jandira.sp.model;
public class Gerente extends Funcionario{

    private int bonus = 100;
    public Gerente(String nome, int cpf, int salario, int bonus) {
        super(nome, cpf, salario);
        this.bonus = bonus;
    }
    @Override
    public double calcularSalario() {
        return getSalario() + bonus;
    }
    public int getBonus() {
        return bonus;
    }

}