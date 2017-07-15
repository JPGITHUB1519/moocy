/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tester
 */
public class Usuario {
    private int id;
    private String username;
    private String password;
    private String tipo;
    private String email;
    private String fecha_registro;
    private String last_visit_date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public String getLast_visit_date() {
        return last_visit_date;
    }

    public void setLast_visit_date(String last_visit_date) {
        this.last_visit_date = last_visit_date;
    }
    
    public boolean insert(Usuario usuario) {
        return true;
    }
    
    public boolean update(Usuario usuario) {
        return true;
    }
    
    public boolean delete(Usuario usuario) {
        return true;
    }
    
    public DefaultTableModel select() {
        return null;
    }
    
    public DefaultTableModel getById(int id) {
        return null;
    }
    
    public void enableDisable() {
        
    }
    
    public void login(Usuario usuario) {
        
    }
    
    public void logout(Usuario usuario) {
        
    }
    
    public boolean checkStatus(Usuario usuario) {
        return true;
    }
    
    public String generatePasswordHash() {
        return "";
    }
    
    public boolean sendConfirmationEmail(Usuario usuario) {
        return false;
    }
    
    public void validateUserByToken(Usuario user) {
        
    }
}
