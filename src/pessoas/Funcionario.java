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

    protected String cargo;
    protected float salario;

    public Funcionario(String cpf, String nomeCompleto, String dataNasc, String telefone, String sexo, String cargo, float salario) {
        super(cpf, nomeCompleto, dataNasc, telefone, sexo);
        this.cargo = cargo;
        this.salario = salario;
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

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    protected float calcSalario(){
        return salario;
    }

}
