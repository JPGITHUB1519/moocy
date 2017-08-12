/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author Tester
 */
public class MConcepto {
    private int id;
    private int lesson_id;
    private String nombre;
    private String direccion;
    private String video_url;
    private int concept_number;
    private boolean is_active;

    public MConcepto() {
    }

    public MConcepto(int id, int lesson_id, String nombre, String direccion, String video_url, int concept_number, boolean is_active) {
        this.id = id;
        this.lesson_id = lesson_id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.video_url = video_url;
        this.concept_number = concept_number;
        this.is_active = is_active;
    }
    
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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
    
    
}
