/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COMBOs;

/**
 *
 * @author admin
 */
public class COMBOEmpleado {
    private Integer idEmpleado;
    private String NombreEmpleado;

    public COMBOEmpleado(Integer idEmpleado, String NombreEmpleado) {
        this.idEmpleado = idEmpleado;
        this.NombreEmpleado = NombreEmpleado;
    }

    /**
     * @return the idEmpleado
     */
    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * @param idEmpleado the idEmpleado to set
     */
    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    /**
     * @return the NombreEmpleado
     */
    public String getNombreEmpleado() {
        return NombreEmpleado;
    }

    /**
     * @param NombreEmpleado the NombreEmpleado to set
     */
    public void setNombreEmpleado(String NombreEmpleado) {
        this.NombreEmpleado = NombreEmpleado;
    }
    @Override
    public String toString(){
    return this.getNombreEmpleado();
    }
}
