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
public class Curso {
    private int id;
    private String nombre;
    private String descripcion;
    private String slogan;
    private String fecha_lanzamiento;
    private String skill_level;
    private String is_active;

    public int getId() {
        return id;
    }

    public void setId(int idcurso) {
        this.id = idcurso;
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

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getFecha_lanzamiento() {
        return fecha_lanzamiento;
    }

    public void setFecha_lanzamiento(String fecha_lanzamiento) {
        this.fecha_lanzamiento = fecha_lanzamiento;
    }

    public String getSkill_level() {
        return skill_level;
    }

    public void setSkill_level(String skill_level) {
        this.skill_level = skill_level;
    }

    public String getIs_active() {
        return is_active;
    }

    public void setIs_active(String is_active) {
        this.is_active = is_active;
    }
    
    public boolean insert(Curso curso) {
        return true;
    }
    
    public boolean update(Curso curso) {
        return true;
    }
    
    public boolean delete(Curso curso) {
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
    
    public void registerStudenOnCourse(Curso curso, Estudiante estudiante) {
    
    }
    
    public void deleteStudenFromCourse(Curso curso, Estudiante estudiante) {
    
    }
    
    public DefaultTableModel getLessonsByCourses(Curso curso) {
        return null;
    }
    
    public DefaultTableModel getConceptsByCourses(Curso curso) {
        return null;
    }
    
    public DefaultTableModel getStudentsByCourses(Curso curso) {
        return null;
    }
    
    public DefaultTableModel getHottestCourses() {
        return null;
    }
    
    public DefaultTableModel stadisticalData(String type, Curso curso) {
        return null;
    }
    
    
}
