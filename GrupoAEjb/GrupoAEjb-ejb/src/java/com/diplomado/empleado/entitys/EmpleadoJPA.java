/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diplomado.empleado.entitys;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author HellmuthTrejo
 */
@Entity
@Table(name = "empleado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmpleadoJPA.findAll", query = "SELECT e FROM EmpleadoJPA e")
    , @NamedQuery(name = "EmpleadoJPA.findByCedula", query = "SELECT e FROM EmpleadoJPA e WHERE e.cedula = :cedula")
    , @NamedQuery(name = "EmpleadoJPA.findByNombre", query = "SELECT e FROM EmpleadoJPA e WHERE e.nombre = :nombre")
    , @NamedQuery(name = "EmpleadoJPA.findByApellido", query = "SELECT e FROM EmpleadoJPA e WHERE e.apellido = :apellido")
    , @NamedQuery(name = "EmpleadoJPA.findBySexo", query = "SELECT e FROM EmpleadoJPA e WHERE e.sexo = :sexo")
    , @NamedQuery(name = "EmpleadoJPA.findByEdad", query = "SELECT e FROM EmpleadoJPA e WHERE e.edad = :edad")
    , @NamedQuery(name = "EmpleadoJPA.findByDireccion", query = "SELECT e FROM EmpleadoJPA e WHERE e.direccion = :direccion")
    , @NamedQuery(name = "EmpleadoJPA.findByTelefono", query = "SELECT e FROM EmpleadoJPA e WHERE e.telefono = :telefono")})
public class EmpleadoJPA implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "cedula")
    private Integer cedula;
    @Size(max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 50)
    @Column(name = "apellido")
    private String apellido;
    @Size(max = 10)
    @Column(name = "sexo")
    private String sexo;
    @Column(name = "edad")
    private Integer edad;
    @Size(max = 50)
    @Column(name = "direccion")
    private String direccion;
    @Size(max = 20)
    @Column(name = "telefono")
    private String telefono;

    public EmpleadoJPA() {
    }

    public EmpleadoJPA(Integer cedula) {
        this.cedula = cedula;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cedula != null ? cedula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmpleadoJPA)) {
            return false;
        }
        EmpleadoJPA other = (EmpleadoJPA) object;
        if ((this.cedula == null && other.cedula != null) || (this.cedula != null && !this.cedula.equals(other.cedula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.diplomado.empleado.entitys.EmpleadoJPA[ cedula=" + cedula + " ]";
    }
    
}
