/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividades;

import java.io.Serializable;
import java.util.UUID;
import pessoas.Aluno;

/**
 *
 * @author Felipe
 */
public class Treino implements Comparable<Treino>, Serializable {

    private String id;
    private String nome;
    private String dia;
    private Aluno aluno;

    public Treino(int id, String nome, String dia, Aluno aluno) {
        UUID uuid = UUID.randomUUID();
        this.id = uuid.toString();
        this.nome = nome;
        this.dia = dia;
        this.aluno = aluno;

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

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    @Override
    public int compareTo(Treino o) {
        return this.id.compareTo(o.getId());
    }
}
