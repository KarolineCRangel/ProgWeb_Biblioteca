
package br.edu.iff.biblioteca.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import br.edu.iff.biblioteca.model.TemaLivro;

public class Livro implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private Long id;
   
    private int qtdEstoque;
   
    private TemaLivro tema;
    
    private String autor;

    private String editora;

    private List<Emprestimo> emprestimos = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public TemaLivro getTemaLivro() {
        return tema;
    }

    public void setTemaLivro(TemaLivro tema) {
        this.tema = tema;
    }
    
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setReservas(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Livro other = (Livro) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }


    
    
    
}
