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
public class DetalleCuentasBancarias {

    private int iddetallecuentasbancarias;
    private String banco;
    private String cuenta;
    private String nroCuenta;
    private String provRuc;

    public DetalleCuentasBancarias() {
    }

    public DetalleCuentasBancarias(int iddetallecuentasbancarias, String banco, String cuenta, String nroCuenta, String provRuc) {
        this.iddetallecuentasbancarias = iddetallecuentasbancarias;
        this.banco = banco;
        this.cuenta = cuenta;
        this.nroCuenta = nroCuenta;
        this.provRuc = provRuc;
    }

    public int getIddetallecuentasbancarias() {
        return iddetallecuentasbancarias;
    }

    public void setIddetallecuentasbancarias(int iddetallecuentasbancarias) {
        this.iddetallecuentasbancarias = iddetallecuentasbancarias;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public String getProvRuc() {
        return provRuc;
    }

    public void setProvRuc(String provRuc) {
        this.provRuc = provRuc;
    }

    
}
