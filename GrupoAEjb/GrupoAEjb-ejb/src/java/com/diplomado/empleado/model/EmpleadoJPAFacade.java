package com.diplomado.empleado.model;

import com.diplomado.empleado.entitys.EmpleadoJPA;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author GRUPO A.
 */
@Stateless
public class EmpleadoJPAFacade extends AbstractFacade<EmpleadoJPA> {

    @PersistenceContext(unitName = "GrupoAEjb-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EmpleadoJPAFacade() {
        super(EmpleadoJPA.class);
    }
    
}
