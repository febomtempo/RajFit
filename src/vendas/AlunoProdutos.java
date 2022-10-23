/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vendas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import pessoas.Aluno;

/**
 *
 * @author Felipe
 */
public class AlunoProdutos {

    private int cont = 1;
    private final int id;
    private LocalDate data;
    private float valorTotal;
    private Aluno aluno;
    private List<Produto> produtos = new ArrayList<>();

    public AlunoProdutos(float valorTotal, Aluno aluno, ArrayList<Produto> produtos) {
        this.id = cont++;
        this.data = LocalDate.now();
        this.valorTotal = valorTotal;
        this.aluno = aluno;
        this.produtos = produtos;
    }
    
    public float somarTotal(){
        float total = 0;
        for(Produto p: produtos){
            total += p.getValor();
        }
        return total;
    }
    

    public int getId() {
        return id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

}
