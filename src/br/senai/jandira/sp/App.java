package br.senai.jandira.sp;

import br.senai.jandira.sp.model.Gerente;
import br.senai.jandira.sp.model.Programador;

public class App {

    public static void main(String[] args) {

        Gerente gerente = new Gerente("Julia", 125, 1265);
        Programador programador1 = new Programador("Vito", 162, 1729);

        System.out.println("⊱⋅ ──────────── ⋅⊰");
        System.out.println("Informações - GERENTE:");
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("CPF: " + gerente.getCpf());
        System.out.println("Salário:" + gerente.getSalario());
        System.out.println("Bônus:" + gerente.getBonus());
        System.out.println("Salário Total:" + gerente.calcularSalario());
        System.out.println();

        System.out.println("⊱⋅ ──────────── ⋅⊰");
        System.out.println("Informações - PROGRAMADOR:");
        System.out.println("Nome: " + programador1.getNome());
        System.out.println("CPF: " + programador1.getCpf());
        System.out.println("Salário" + programador1.getSalario());
        System.out.println("Horas Extras: " + programador1.getHoraExtra());


    }
}
