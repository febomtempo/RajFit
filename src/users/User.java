/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package users;

import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author Felipe
 */
public class User implements Comparable<User>, Serializable{
    private String id;
    private String login;
    private String senha;
    private String tipo;

    public User(String login, String senha, String tipo) {
        UUID uuid = UUID.randomUUID();
        this.id = uuid.toString();
        this.login = login;
        this.senha = senha;
        this.tipo = tipo;
    }

    public String getId() {
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
    
    @Override
    public int compareTo(User o) {
        return this.id.compareTo(o.getId());
    }
}
