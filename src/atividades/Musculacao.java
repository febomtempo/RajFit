/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividades;

/**
 *
 * @author Felipe
 */
public class Musculacao extends Exercicio {

    private String tipo;
    private String aparelho;

    public Musculacao(String nome, String tipo, String aparelho) {
        super(nome);
        this.tipo = tipo;
        this.aparelho = aparelho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAparelho() {
        return aparelho;
    }

    public void setAparelho(String aparelho) {
        this.aparelho = aparelho;
    }

}
