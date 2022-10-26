/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pessoas;

import java.io.Serializable;

/**
 *
 * @author Felipe
 */
public abstract class Pessoa implements Serializable {

    protected int cont = 1;
    protected int id;
    protected String cpf;
    protected String nomeCompleto;
    protected String dataNasc;
    protected String telefone;
    protected String sexo;

    public Pessoa(String cpf, String nomeCompleto, String dataNasc, String telefone, String sexo) {
        this.id = cont++;
        this.cpf = cpf;
        this.nomeCompleto = nomeCompleto;
        this.dataNasc = dataNasc;
        this.telefone = telefone;
        this.sexo = sexo;
    }

    public int getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
