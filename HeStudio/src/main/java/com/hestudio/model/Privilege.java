/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hestudio.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author hieu.doan
 */
@Entity
@Table(name = "privilege")
@NamedQueries({
    @NamedQuery(name = "Privilege.findAll", query = "SELECT p FROM Privilege p"),
    @NamedQuery(name = "Privilege.findById", query = "SELECT p FROM Privilege p WHERE p.id = :id"),
    @NamedQuery(name = "Privilege.findByName", query = "SELECT p FROM Privilege p WHERE p.name = :name"),
    @NamedQuery(name = "Privilege.findByDescription", query = "SELECT p FROM Privilege p WHERE p.description = :description")})
public class Privilege implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "description")
    private String description;

    public Privilege() {
    }

    public Privilege(Integer id) {
        this.id = id;
    }

    public Privilege(Integer id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Privilege)) {
            return false;
        }
        Privilege other = (Privilege) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication2.Privilege[ id=" + id + " ]";
    }
    
}
