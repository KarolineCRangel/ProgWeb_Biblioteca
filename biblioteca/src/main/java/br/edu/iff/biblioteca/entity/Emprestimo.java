package br.edu.iff.biblioteca.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;

public class Emprestimo implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private Long id;

    private Calendar dataHora;

    private Calendar inicio;

    private Calendar termino;
    
    private List<Livro> livros = new ArrayList<>();

    private Aluno aluno;

    private Funcionario funcionario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Calendar getDataHora() {
        return dataHora;
    }

    public void setDataHora(Calendar dataHora) {
        this.dataHora = dataHora;
    }

    public Calendar getInicio() {
        return inicio;
    }

    public void setInicio(Calendar inicio) {
        this.inicio = inicio;
    }

    public Calendar getTermino() {
        return termino;
    }

    public void setTermino(Calendar termino) {
        this.termino = termino;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setQuartos(List<Livro> livros) {
        this.livros = livros;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.id);
        return hash;
    }
    
}
