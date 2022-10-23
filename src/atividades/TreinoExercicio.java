/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Felipe
 */
public class TreinoExercicio {

    private int cont = 1;
    private final int id;
    private int repeticoes;
    private int series;
    private Treino treino;
    private List<Exercicio> exercicios = new ArrayList<>();

    public TreinoExercicio(int id, int repeticoes, int series, Treino treino, ArrayList<Exercicio> exercicios) {
        this.id = cont++;
        this.repeticoes = repeticoes;
        this.series = series;
        this.treino = treino;
        this.exercicios = exercicios;
    }

    public int getId() {
        return id;
    }

    public int getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public Treino getTreino() {
        return treino;
    }

    public void setTreino(Treino treino) {
        this.treino = treino;
    }

    public List<Exercicio> getExercicios() {
        return exercicios;
    }

    public void setExercicios(List<Exercicio> exercicios) {
        this.exercicios = exercicios;
    }

}
