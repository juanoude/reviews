package br.com.alura.javaIeIIempresa;

abstract class Funcionario { //abstract para impedir que ela possa ser instanciada
    protected String nome;
    protected String cpf;
    protected double salario;
    
    abstract double getBonificacao();
//um m�todo abstrato ser� sempre escrito pelas classes filhas. Obrigat�rio.
}

