/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vendas;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;
import pessoas.Aluno;

/**
 *
 * @author Felipe
 */
public class Fatura implements Comparable<Fatura>, Serializable {

    private String id;
    private LocalDate data;
    private float valorFatura;
    private String statusPagamento;
    private Aluno aluno;
    private Pacote pacote;
    private AlunoProdutos alunoProdutos;

    public Fatura(float valorFatura, String statusPagamento, Aluno aluno, Pacote pacote, AlunoProdutos alunoProdutos) {
        UUID uuid = UUID.randomUUID();
        this.id = uuid.toString();
        this.data = LocalDate.now();
        this.valorFatura = valorFatura;
        this.statusPagamento = statusPagamento;
        this.aluno = aluno;
        this.pacote = pacote;
        this.alunoProdutos = alunoProdutos;
    }
    
    
    public float somarTotal(){
        return pacote.getValor() + alunoProdutos.getValorTotal();
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

    public float getValorFatura() {
        return valorFatura;
    }

    public void setValorFatura(float valorFatura) {
        this.valorFatura = valorFatura;
    }

    public String getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(String statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Pacote getPacote() {
        return pacote;
    }

    public void setPacote(Pacote pacote) {
        this.pacote = pacote;
    }

    public AlunoProdutos getAlunoProdutos() {
        return alunoProdutos;
    }

    public void setAlunoProdutos(AlunoProdutos alunoProdutos) {
        this.alunoProdutos = alunoProdutos;
    }

    @Override
    public int compareTo(Fatura o) {
        return this.id.compareTo(o.getId());
    }
}
