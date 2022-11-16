/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pessoas;

import vendas.Pacote;

/**
 *
 * @author Felipe
 */
public class Aluno extends Pessoa{
    private Pacote pacote;
    
    public Aluno(String cpf, String nomeCompleto, String dataNasc, String telefone, String sexo, Pacote pacote) {
        super(cpf, nomeCompleto, dataNasc, telefone, sexo);
        this.pacote = pacote;
    }
    
}
