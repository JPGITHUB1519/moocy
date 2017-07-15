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
public class Concepto {
    private int id;
    private int lesson_id;
    private String nombre;
    private String descripcion;
    private String video_url;
    private int concept_number;
    private boolean is_active;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLesson_id() {
        return lesson_id;
    }

    public void setLesson_id(int lesson_id) {
        this.lesson_id = lesson_id;
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

    public String getVideo_url() {
        return video_url;
    }

    public void setVideo_url(String video_url) {
        this.video_url = video_url;
    }

    public int getConcept_number() {
        return concept_number;
    }

    public void setConcept_number(int concept_number) {
        this.concept_number = concept_number;
    }

    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }
    
    public boolean insert(Concepto concepto) {
        return true;
    }
    
    public boolean update(Concepto concepto) {
        return true;
    }
    
    public boolean delete(Concepto concepto) {
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
    
    public void showVideo() {
        
    }
    
    public void registerConceptoOnCourse(Leccion leccion, Curso course) {
        
    }
    
    public void deleteConceptoFromCourse(Leccion leccion, Curso curso) {
        
    }
    
    public DefaultTableModel stadisticalData(String type, Curso curso) {
        return null;
    }
}
