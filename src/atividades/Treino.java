/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividades;

import pessoas.Aluno;
import pessoas.Instrutor;

/**
 *
 * @author Felipe
 */
public class Treino {
    private int cont = 1;
    private int id;
    private String nome;
    private String dia;
    private Aluno aluno;
    private Instrutor instrutor;

    public Treino(int id, String nome, String dia, Aluno aluno, Instrutor instrutor) {
        this.id = id;
        this.nome = nome;
        this.dia = dia;
        this.aluno = aluno;
        this.instrutor = instrutor;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }
    
    
}
