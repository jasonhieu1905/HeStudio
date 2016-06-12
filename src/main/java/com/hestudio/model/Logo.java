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
@Table(name = "logo")
@NamedQueries({
    @NamedQuery(name = "Logo.findAll", query = "SELECT l FROM Logo l"),
    @NamedQuery(name = "Logo.findById", query = "SELECT l FROM Logo l WHERE l.id = :id"),
    @NamedQuery(name = "Logo.findByName", query = "SELECT l FROM Logo l WHERE l.name = :name"),
    @NamedQuery(name = "Logo.findByImage", query = "SELECT l FROM Logo l WHERE l.image = :image"),
    @NamedQuery(name = "Logo.findByPriority", query = "SELECT l FROM Logo l WHERE l.priority = :priority")})
public class Logo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "image")
    private String image;
    @Basic(optional = false)
    @Column(name = "priority")
    private String priority;

    public Logo() {
    }

    public Logo(Integer id) {
        this.id = id;
    }

    public Logo(Integer id, String name, String image, String priority) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.priority = priority;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
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
        if (!(object instanceof Logo)) {
            return false;
        }
        Logo other = (Logo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication2.Logo[ id=" + id + " ]";
    }
    
}
