/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividades;

import java.io.Serializable;
import java.util.UUID;
import pessoas.Aluno;
import pessoas.Pessoa;

/**
 *
 * @author Felipe
 */
public class Treino implements Comparable<Treino>, Serializable {

    private String id;
    private String nome;
    private String dia;
    private Pessoa pessoa;

    public Treino(String nome, String dia, Pessoa pessoa) {
        UUID uuid = UUID.randomUUID();
        this.id = uuid.toString();
        this.nome = nome;
        this.dia = dia;
        this.pessoa = pessoa;

    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Pessoa getAluno() {
        return pessoa;
    }

    public void setPessoa(Aluno aluno) {
        this.pessoa = aluno;
    }

    @Override
    public int compareTo(Treino o) {
        return this.id.compareTo(o.getId());
    }
    
     public boolean equals(Treino t) {
        return this.id.equals(t.getId());
    }
}
