/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vendas;

import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author Felipe
 */
public class Pacote implements Comparable<Pacote>, Serializable {

    private String id;
    private String nome;
    private String descricao;
    private float valor;

    public Pacote(String nome, String descricao, float valor) {
        UUID uuid = UUID.randomUUID();
        this.id = uuid.toString();
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
     @Override
    public int compareTo(Pacote o) {
        return this.id.compareTo(o.getId());
    }

}
