/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pessoas;

/**
 *
 * @author Felipe
 */
public class Secretaria extends Funcionario{
    
    public Secretaria(String cpf, String nomeCompleto, String dataNasc, String telefone, String sexo, String cargo, float salario) {
        super(cpf, nomeCompleto, dataNasc, telefone, sexo, cargo, salario);
    }

    @Override
    protected float calcSalario() {
        return (float) (super.calcSalario() * 2.5);
    }

    
    
    
}
