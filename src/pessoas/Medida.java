/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pessoas;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Felipe
 */
public class Medida implements Serializable{

    private static int cont = 1;
    private int id;
    private int altura;
    private float peso;
    private int bicepsDir;
    private int bicepsEsq;
    private int coxaDir;
    private int coxaEsq;
    private int peito;
    private int ombro;
    private int quadril;
    private LocalDate data;
    private Aluno aluno;

    public Medida(int altura, float peso, int bicepsDir, int bicepsEsq, int coxaDir, int coxaEsq, int peito, int ombro, int quadril, Aluno aluno) {
        this.id = cont++;
        this.altura = altura;
        this.peso = peso;
        this.bicepsDir = bicepsDir;
        this.bicepsEsq = bicepsEsq;
        this.coxaDir = coxaDir;
        this.coxaEsq = coxaEsq;
        this.peito = peito;
        this.ombro = ombro;
        this.quadril = quadril;
        this.data = LocalDate.now();
        this.aluno = aluno;
    }

    public int getId() {
        return id;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getBicepsDir() {
        return bicepsDir;
    }

    public void setBicepsDir(int bicepsDir) {
        this.bicepsDir = bicepsDir;
    }

    public int getBicepsEsq() {
        return bicepsEsq;
    }

    public void setBicepsEsq(int bicepsEsq) {
        this.bicepsEsq = bicepsEsq;
    }

    public int getCoxaDir() {
        return coxaDir;
    }

    public void setCoxaDir(int coxaDir) {
        this.coxaDir = coxaDir;
    }

    public int getCoxaEsq() {
        return coxaEsq;
    }

    public void setCoxaEsq(int coxaEsq) {
        this.coxaEsq = coxaEsq;
    }

    public int getPeito() {
        return peito;
    }

    public void setPeito(int peito) {
        this.peito = peito;
    }

    public int getOmbro() {
        return ombro;
    }

    public void setOmbro(int ombro) {
        this.ombro = ombro;
    }

    public int getQuadril() {
        return quadril;
    }

    public void setQuadril(int quadril) {
        this.quadril = quadril;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

}
