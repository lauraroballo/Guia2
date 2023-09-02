/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umb;
/**
 *
 * @author PC
 */
public class Libro {
    private String idPrestamos, idLibro, fechaPre, fechaDev;
         private    String codigoEst;

    public String getCodigoEst() {
        return codigoEst;
    }

    public void setCodigoEst(String codigoEst) {
        this.codigoEst = codigoEst;
    }
             
              
    public String getIdPrestamos() {
        return idPrestamos;
    }

    public void setIdPrestamos(String idPrestamos) {
        this.idPrestamos = idPrestamos;
    }

    public String getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(String idLibro) {
        this.idLibro = idLibro;
    }

    public String getFechaPre() {
        return fechaPre;
    }

    public void setFechaPre(String fechaPre) {
        this.fechaPre = fechaPre;
    }

    public String getFechaDev() {
        return fechaDev;
    }

    public void setFechaDev(String fechaDev) {
        this.fechaDev = fechaDev;
    }
    

public Libro(String idPrestamos, String idLibro, String fechaPre, String fechaDev, String codigoEst) {
        this.idPrestamos = idPrestamos;
        this.idLibro = idLibro;
        this.fechaPre = fechaPre;
        this.fechaDev= fechaDev;
        this.codigoEst= codigoEst;
        
        
    
    
        
    

}
    @Override
    public String toString() {
        return "Libro{" + "idPrestamos=" + idPrestamos + ", idLibro=" + idLibro + ", fechaPre=" +fechaPre + ",fechaDev=" +fechaDev + ",  CodigoEst=" + codigoEst +'}';
    }
}
