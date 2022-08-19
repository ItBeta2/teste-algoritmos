package br.com.itbeta;

public class Funcionario {
    public static enum Categoria{
        ANALISTA, DESENVOLVEDOR, GERENCIAL
    }
    public String nome;
    public Double salario;
    public Categoria categoria;

    public Funcionario(String nome, Double salario, Categoria categoria) {
        this.nome = nome;
        this.salario = salario;
        this.categoria = categoria;
    }
}
