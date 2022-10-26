/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package users;

import java.io.Serializable;

/**
 *
 * @author Felipe
 */
public class User implements Serializable {

    private int cont = 1;
    private final int id;
    private String login;
    private String senha;
    private String tipo;

    public User(String login, String senha, String tipo) {
        this.id = cont++;
        this.login = login;
        this.senha = senha;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
