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
public class Estudiante {
    private int id;
    private int login_id;
    private String nombre;
    private String nacionalidad;
    private String fecha_nacimiento;
    private char sexo;
    private String telefono;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
    
    public boolean insert(Estudiante estudiante) {
        return true;
    }
    
    public boolean update(Estudiante estudiante) {
        return true;
    }
    
    public boolean delete(Estudiante estudiante) {
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
    
    private void sendEmailToLead(Estudiante estudiante, Lead lead, String Subject, String Content) {
        
    }
    
    private void registerStudentToCourse(Curso curso, Estudiante estudiante) {
        
    }
    
    private void deleteStudentFromCourse(Curso curso, Estudiante estudiante) {
        
    }
    
    public DefaultTableModel getCoursesByStudent(Estudiante estudiante) {
        return null;
    }
    
    private DefaultTableModel showStudentStatusByCourse(Curso curso, Estudiante estudiante) {
        return null;
    }
    
    public void postQuestionOnForum(Estudiante estudiante, String Question) {
        
    }
    
    public void markConceptAsCompleted(Concepto concepto, Estudiante estudiante) {
        
    }
    
    public void markLessontAsCompleted(Leccion leccion, Estudiante estudiante) {
        
    }
    
    public void markCourseAsCompleted(Curso curso, Estudiante estudiante) {
        
    }
    public DefaultTableModel stadisticalData(String type, Curso curso) {
        return null;
    }
}
