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
public class MTest {
    private int _idtest;
    private String descripcion;
    private String tipo;
    private boolean status;
    
    public MTest() {

    }
    
    public MTest(int _idtest, String descripcion, String tipo, boolean status) {
        this._idtest = _idtest;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.status = status;
    }

    public int getIdtest() {
        return _idtest;
    }

    public void setIdtest(int _idtest) {
        this._idtest = _idtest;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
   
    
}