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
public class Categoria implements Comparable<Categoria>, Serializable {

    private String id;
    private String nome;

    public Categoria(String nome) {
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
    public String toString() {
        return "Categoria{" + "id=" + id + ", nome=" + nome + '}';
    }

    @Override
    public int compareTo(Categoria o) {
        return this.id.compareTo(o.getId());
    }

}
