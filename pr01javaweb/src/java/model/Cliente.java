/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Oscar
 */
public class Cliente {

    int cli_id;
    String cli_nombre;
    String cli_apellidos;
    String cli_email;
    String cli_cuentabancaria;

    public Cliente() {
    }

    public Cliente(int cli_id, String cli_nombre, String cli_apellidos, String cli_email, String cli_cuentabancaria) {
        this.cli_id = cli_id;
        this.cli_nombre = cli_nombre;
        this.cli_apellidos = cli_apellidos;
        this.cli_email = cli_email;
        this.cli_cuentabancaria = cli_cuentabancaria;
    }

    public int getCli_id() {
        return cli_id;
    }

    public void setCli_id(int cli_id) {
        this.cli_id = cli_id;
    }

    public String getCli_nombre() {
        return cli_nombre;
    }

    public void setCli_nombre(String cli_nombre) {
        this.cli_nombre = cli_nombre;
    }

    public String getCli_apellidos() {
        return cli_apellidos;
    }

    public void setCli_apellidos(String cli_apellidos) {
        this.cli_apellidos = cli_apellidos;
    }

    public String getCli_email() {
        return cli_email;
    }

    public void setCli_email(String cli_email) {
        this.cli_email = cli_email;
    }

    public String getCli_cuentabancaria() {
        return cli_cuentabancaria;
    }

    public void setCli_cuentabancaria(String cli_cuentabancaria) {
        this.cli_cuentabancaria = cli_cuentabancaria;
    }

}
