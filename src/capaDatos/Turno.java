/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaDatos;

/**
 *
 * @author Milagros
 */
public class Turno {
    
    
    private int idturno;
    private String descripcion;
    private String inicio;
    private String fin;
    private String uDni;

    public Turno() {
    }

    public Turno(int idturno, String descripcion, String inicio, String fin, String uDni) {
        this.idturno = idturno;
        this.descripcion = descripcion;
        this.inicio = inicio;
        this.fin = fin;
        this.uDni = uDni;
    }

    public int getIdturno() {
        return idturno;
    }

    public void setIdturno(int idturno) {
        this.idturno = idturno;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public String getuDni() {
        return uDni;
    }

    public void setuDni(String uDni) {
        this.uDni = uDni;
    }
    
    


}
