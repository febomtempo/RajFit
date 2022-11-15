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

    private String aparelho;

    public Musculacao(String nome, String aparelho) {
        super(nome);
        this.aparelho = aparelho;
    }

    public String getAparelho() {
        return aparelho;
    }

    public void setAparelho(String aparelho) {
        this.aparelho = aparelho;
    }

}
