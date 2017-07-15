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
public class Leccion {
    private int id;
    private int curso_id;
    private String nombre;
    private String descripcion;
    private int lesson_number;
    private boolean is_active;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCurso_id() {
        return curso_id;
    }

    public void setCurso_id(int curso_id) {
        this.curso_id = curso_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getLesson_number() {
        return lesson_number;
    }

    public void setLesson_number(int lesson_number) {
        this.lesson_number = lesson_number;
    }

    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }
    
    public boolean insert(Leccion leccion) {
        return true;
    }
    
    public boolean update(Leccion leccion) {
        return true;
    }
    
    public boolean delete(Leccion leccion) {
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
    
    public void registerLessonOnCourse(Leccion leccion) {
        
    }
    
    public void deleteLessonFromCourse(Leccion leccion) {
        
    }
    
    public DefaultTableModel showLessonConcepts(Leccion leccion) {
        return null;
    }
    
    public DefaultTableModel stadisticalData(String type, Curso curso) {
        return null;
    }
    
    
}
