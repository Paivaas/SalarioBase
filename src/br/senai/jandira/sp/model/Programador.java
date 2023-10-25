package br.senai.jandira.sp.model;

public class Programador extends Funcionario{

    private int horaExtra;

    public Programador(String nome, int cpf, int salario, int horaExtra) {
        super(nome, cpf, salario);
        this.horaExtra = horaExtra;
    }

    @Override
    public double calcularSalario() {
        return getSalario() + (horaExtra * 3);
    }

    public int getHoraExtra() {
        return horaExtra;
    }

}
