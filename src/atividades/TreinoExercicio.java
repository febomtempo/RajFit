/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author Felipe
 */
public class TreinoExercicio implements Comparable<TreinoExercicio>, Serializable {

    
    private String id;
    private int repeticoes;
    private int series;
    private Treino treino;
    private Exercicio exercicio;

    public TreinoExercicio(int repeticoes, int series, Treino treino, Exercicio exercicio) {
        UUID uuid = UUID.randomUUID();
        this.id = uuid.toString();
        this.repeticoes = repeticoes;
        this.series = series;
        this.treino = treino;
        this.exercicio = exercicio;
    }

    public String getId() {
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

    public Exercicio getExercicio() {
        return exercicio;
    }

    public void setExercicio(Exercicio exercicio) {
        this.exercicio = exercicio;
    }

    

    @Override
    public int compareTo(TreinoExercicio o) {
        return this.id.compareTo(o.getId());
    }
}
