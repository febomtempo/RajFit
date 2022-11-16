/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pessoas;

/**
 *
 * @author Felipe
 */
public abstract class Funcionario extends Pessoa {
    protected final float SALARIO_BASE = 1000;
    protected String cargo;
    protected float salario;

    public Funcionario(String cpf, String nomeCompleto, String dataNasc, String telefone, String sexo, String cargo) {
        super(cpf, nomeCompleto, dataNasc, telefone, sexo);
        this.cargo = cargo;
        this.salario = SALARIO_BASE;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }
    
    public float calcSalario(){
        return this.salario;
    }

}
