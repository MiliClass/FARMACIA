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
public class Usuario {
    private String uDni;
    private String uNombre;
    private String uApellido;
    private String uDireccion;
    private String uClave;
    private String uCelular;
    private int idtipousuario;
    private String tienda;

    public Usuario() {
    }

    public Usuario(String uDni, String uNombre, String uApellido, String uDireccion, String uClave, String uCelular, int idtipousuario, String tienda) {
        this.uDni = uDni;
        this.uNombre = uNombre;
        this.uApellido = uApellido;
        this.uDireccion = uDireccion;
        this.uClave = uClave;
        this.uCelular = uCelular;
        this.idtipousuario = idtipousuario;
        this.tienda = tienda;
    }

    public String getuDni() {
        return uDni;
    }

    public void setuDni(String uDni) {
        this.uDni = uDni;
    }

    public String getuNombre() {
        return uNombre;
    }

    public void setuNombre(String uNombre) {
        this.uNombre = uNombre;
    }

    public String getuApellido() {
        return uApellido;
    }

    public void setuApellido(String uApellido) {
        this.uApellido = uApellido;
    }

    public String getuDireccion() {
        return uDireccion;
    }

    public void setuDireccion(String uDireccion) {
        this.uDireccion = uDireccion;
    }

    public String getuClave() {
        return uClave;
    }

    public void setuClave(String uClave) {
        this.uClave = uClave;
    }

    public String getuCelular() {
        return uCelular;
    }

    public void setuCelular(String uCelular) {
        this.uCelular = uCelular;
    }

    public int getIdtipousuario() {
        return idtipousuario;
    }

    public void setIdtipousuario(int idtipousuario) {
        this.idtipousuario = idtipousuario;
    }

    public String getTienda() {
        return tienda;
    }

    public void setTienda(String tienda) {
        this.tienda = tienda;
    }
    
    
    
}
