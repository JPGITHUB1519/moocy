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
public class MCurso {
    private int _id;
    private String nombre;
    private String slogan;
    private String descripcion;
    private String skill_level;
    private String fecha_lanzamiento;
    private boolean is_active;

    public MCurso(int _id, String nombre, String slogan, String descripcion, String skill_level, String fecha_lanzamiento, boolean is_active) {
        this._id = _id;
        this.nombre = nombre;
        this.slogan = slogan;
        this.descripcion = descripcion;
        this.skill_level = skill_level;
        this.fecha_lanzamiento = fecha_lanzamiento;
        this.is_active = is_active;
    }

    public MCurso() {
    }

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSkill_level() {
        return skill_level;
    }

    public void setSkill_level(String skill_level) {
        this.skill_level = skill_level;
    }

    public String getFecha_lanzamiento() {
        return fecha_lanzamiento;
    }

    public void setFecha_lanzamiento(String fecha_lanzamiento) {
        this.fecha_lanzamiento = fecha_lanzamiento;
    }

    public boolean getIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }
}
