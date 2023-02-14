package br.edu.iff.biblioteca.entity;

import java.util.ArrayList;
import java.util.List;



public class Aluno extends Pessoa{
    
	private static final long serialVersionUID = 1L;

	private String matricula;
   
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public String getDocumentos() {
        return matricula;
    }

    public void setDocumentos(String matricula) {
        this.matricula = matricula;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }
    
    
    
}
