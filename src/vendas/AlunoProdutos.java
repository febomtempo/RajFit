/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vendas;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import pessoas.Aluno;

/**
 *
 * @author Felipe
 */
public class AlunoProdutos implements Comparable<AlunoProdutos>, Serializable {

    private String id;
    private LocalDate data;
    private float valorTotal;
    private Aluno aluno;
    private List<Produto> produtos = new ArrayList<>();

    public AlunoProdutos(float valorTotal, Aluno aluno, ArrayList<Produto> produtos) {
        UUID uuid = UUID.randomUUID();
        this.id = uuid.toString();
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
    

    public String getId() {
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
    
     @Override
    public int compareTo(AlunoProdutos o) {
        return this.id.compareTo(o.getId());
    }

}
