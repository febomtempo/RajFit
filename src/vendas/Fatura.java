/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vendas;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import pessoas.Pessoa;

/**
 *
 * @author Felipe
 */
public class Fatura implements Comparable<Fatura>, Serializable {

    private String id;
    private LocalDate data;
    private String statusPagamento;
    private List<AlunoProdutos> alunoProdutos;
    private Pessoa pessoa;

    public Fatura( List<AlunoProdutos> alunoProdutos, Pessoa pessoa) {
        UUID uuid = UUID.randomUUID();
        this.id = uuid.toString();
        this.data = LocalDate.now();
        this.statusPagamento = "Em Aberto";
        this.alunoProdutos = alunoProdutos;
        this.pessoa = pessoa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public String getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(String statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public List<AlunoProdutos> getAlunoProdutos() {
        return alunoProdutos;
    }

    public void setAlunoProdutos(List<AlunoProdutos> alunoProdutos) {
        this.alunoProdutos = alunoProdutos;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }


     public float totalFatura(Pessoa p) {
        float total = 0;
        for(AlunoProdutos aprodutos: this.alunoProdutos){
            if(aprodutos.getPessoa().equals(p)){
                total+= aprodutos.somarTotal();
            }
        }
        return total;
    }

    @Override
    public int compareTo(Fatura o) {
        return this.id.compareTo(o.getId());
    }
}
