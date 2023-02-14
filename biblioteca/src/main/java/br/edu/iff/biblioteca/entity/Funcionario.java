package br.edu.iff.biblioteca.entity;

import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Pessoa{
    
	private static final long serialVersionUID = 1L;

	private String setor;
    
    private String senha;
    
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }  
    
    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }
    
}
