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
public class Produto implements Comparable<Produto>,  Serializable{

 
    private String id;
    private String nome;
    private float valor;
    private Categoria categoria;

    public Produto(String nome, float valor, Categoria categoria) {
        UUID uuid = UUID.randomUUID();
        this.id = uuid.toString();
        this.nome = nome;
        this.valor = valor;
        this.categoria = categoria;
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

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
     @Override
    public int compareTo(Produto o) {
        return this.id.compareTo(o.getId());
    }

}
