/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividades;

import java.io.Serializable;
import java.util.UUID;
import pessoas.Pessoa;

/**
 *
 * @author Felipe
 */
public abstract class Exercicio implements Comparable <Exercicio>, Serializable{

    protected String id;
    protected String nome;

    public Exercicio(String nome) {
         UUID uuid = UUID.randomUUID();
        this.id = uuid.toString();
        this.nome = nome;
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

    @Override
    public int compareTo(Exercicio o) {
        return this.id.compareTo(o.getId());
    }
}
