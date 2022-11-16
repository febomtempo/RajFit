/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pessoas;

/**
 *
 * @author Felipe
 */
public class Instrutor extends Funcionario {
    
    public Instrutor(String cpf, String nomeCompleto, String dataNasc, String telefone, String sexo, String cargo) {
        super(cpf, nomeCompleto, dataNasc, telefone, sexo, cargo);
    }

    @Override
    public float calcSalario() {
        return (float) (super.calcSalario() * 3.5); 
    }
    
}
