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
public class Lead {
   private int id;
   private int login_id;
   private String descripcion;
   private String titulacion_academica;
   private char sexo;
   private String avatar;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLogin_id() {
        return login_id;
    }

    public void setLogin_id(int login_id) {
        this.login_id = login_id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTitulacion_academica() {
        return titulacion_academica;
    }

    public void setTitulacion_academica(String titulacion_academica) {
        this.titulacion_academica = titulacion_academica;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
    
     public boolean insert(Lead lead) {
        return true;
    }
    
    public boolean update(Lead lead) {
        return true;
    }
    
    public boolean delete(Lead lead) {
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
    
    public void registerLeadToCourse(Curso curso, Lead lead) {
    
    }
    
    public void DeleteLeadToCourse(Curso curso, Lead lead) {
         
    }
    
    public void getLeadsByCourse(Curso curso) {
        
    }
    
    public void sentEmailToStudents(Curso curso, Lead lead, String subject, String content) {
        
    }
    
    public void sentEmailToOneStudent(Estudiante estudiante, Lead lead, String subject, String content) {
        
    }
    
    public void postOnForum(Lead lead, String content) {
        
    }
    
     public DefaultTableModel stadisticalData(String type, Curso curso) {
        return null;
    }
}
