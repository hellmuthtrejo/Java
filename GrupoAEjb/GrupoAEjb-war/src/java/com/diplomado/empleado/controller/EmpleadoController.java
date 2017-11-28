package com.diplomado.empleado.controller;

import com.diplomado.empleado.entitys.EmpleadoJPA;
import com.diplomado.empleado.model.EmpleadoJPAFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author GRUPO A.
 */
@Named(value = "empleadoController")
@SessionScoped
public class EmpleadoController implements Serializable {
    
    @EJB
    private EmpleadoJPAFacade empleadoJPAFacade;
    private EmpleadoJPA empleado;

    /**
     * Creates a new instance of EmpleadoController
     */
    public EmpleadoController() {
        this.empleado = new EmpleadoJPA();
    }

    /**
     * metodo para obtener todos los datos de los empleados.
     */
    public List<EmpleadoJPA> listaEmpleados() {
        return getEmpleadoJPAFacade().findAll();
    }

    /**
     * metodo para registrar un empleado.
     */
    public String addEmpleado() {
        empleadoJPAFacade.create(empleado);
        this.empleado = new EmpleadoJPA();
        return "index";
    }

    /**
     * Metodo para preparar la edicion del Empleado.
     */
    public String prepararEditEmpleado(EmpleadoJPA a) {
        this.setEmpleado(a);
        return "modificarEmpleado";
    }

    /**
     * Metodo para modificar el empleado.
     */
    public String editEmpleado() {
        this.getEmpleadoJPAFacade().edit(getEmpleado());
        this.setEmpleado(new EmpleadoJPA());
        return "index";
    }

    /**
     * metodo para eliminar empleado.
     */
    public void deleteEmpleado(EmpleadoJPA a) {
        this.getEmpleadoJPAFacade().remove(a);
    }

    /**
     * @return the empleado
     */
    public EmpleadoJPA getEmpleado() {
        return empleado;
    }

    /**
     * @param empleado the empleado to set
     */
    public void setEmpleado(EmpleadoJPA empleado) {
        this.empleado = empleado;
    }

    /**
     * @return the empleadoJPAFacade
     */
    public EmpleadoJPAFacade getEmpleadoJPAFacade() {
        return empleadoJPAFacade;
    }

    /**
     * @param empleadoJPAFacade the empleadoJPAFacade to set
     */
    public void setEmpleadoJPAFacade(EmpleadoJPAFacade empleadoJPAFacade) {
        this.empleadoJPAFacade = empleadoJPAFacade;
    }
    
}
