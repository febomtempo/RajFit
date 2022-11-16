/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vendas;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import pessoas.Aluno;
import pessoas.Pessoa;

/**
 *
 * @author Felipe
 */
public class AlunoProdutos implements Comparable<AlunoProdutos>, Serializable {

    private String id;
    private LocalDate data;
    private Pessoa pessoa;
    private Produto produto;
    private int quantidade;

    public AlunoProdutos(Pessoa pessoa, Produto produto, int quantidade) {
        UUID uuid = UUID.randomUUID();
        this.id = uuid.toString();
        this.data = LocalDate.now();
        this.pessoa = pessoa;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public float somarTotal() {
        float total = 0;
        total += produto.getValor() * this.quantidade;
        return total;
    }

    public float faturaTotal(List<AlunoProdutos> alunoProdutos) {
        float total = 0;
        for (AlunoProdutos ap : alunoProdutos) {
            total+= ap.somarTotal();
        }
        return total + ((Aluno) pessoa).getPacote().getValor();
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

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Aluno aluno) {
        this.pessoa = pessoa;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(AlunoProdutos o) {
        return this.id.compareTo(o.getId());
    }

}
