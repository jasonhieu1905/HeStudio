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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author hieu.doan
 */
@Entity
@Table(name = "contact")
@NamedQueries({
    @NamedQuery(name = "Contact.findAll", query = "SELECT c FROM Contact c"),
    @NamedQuery(name = "Contact.findById", query = "SELECT c FROM Contact c WHERE c.id = :id"),
    @NamedQuery(name = "Contact.findByCompanyname", query = "SELECT c FROM Contact c WHERE c.companyname = :companyname"),
    @NamedQuery(name = "Contact.findByAddress", query = "SELECT c FROM Contact c WHERE c.address = :address"),
    @NamedQuery(name = "Contact.findByPhone", query = "SELECT c FROM Contact c WHERE c.phone = :phone"),
    @NamedQuery(name = "Contact.findByEmail", query = "SELECT c FROM Contact c WHERE c.email = :email"),
    @NamedQuery(name = "Contact.findByMapX", query = "SELECT c FROM Contact c WHERE c.mapX = :mapX"),
    @NamedQuery(name = "Contact.findByMapY", query = "SELECT c FROM Contact c WHERE c.mapY = :mapY"),
    @NamedQuery(name = "Contact.findByWorkingtime", query = "SELECT c FROM Contact c WHERE c.workingtime = :workingtime"),
    @NamedQuery(name = "Contact.findByIsoimage", query = "SELECT c FROM Contact c WHERE c.isoimage = :isoimage"),
    @NamedQuery(name = "Contact.findByZoommap", query = "SELECT c FROM Contact c WHERE c.zoommap = :zoommap"),
    @NamedQuery(name = "Contact.findByBannerfooter", query = "SELECT c FROM Contact c WHERE c.bannerfooter = :bannerfooter")})
public class Contact implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "companyname")
    private String companyname;
    @Basic(optional = false)
    @Column(name = "address")
    private String address;
    @Basic(optional = false)
    @Column(name = "phone")
    private String phone;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "map_x")
    private String mapX;
    @Basic(optional = false)
    @Column(name = "map_y")
    private String mapY;
    @Basic(optional = false)
    @Column(name = "workingtime")
    private String workingtime;
    @Basic(optional = false)
    @Column(name = "isoimage")
    private String isoimage;
    @Column(name = "zoommap")
    private Integer zoommap;
    @Column(name = "bannerfooter")
    private String bannerfooter;
    @Basic(optional = false)
    @Lob
    @Column(name = "aboutus")
    private String aboutus;

    public Contact() {
    }

    public Contact(Integer id) {
        this.id = id;
    }

    public Contact(Integer id, String companyname, String address, String phone, String email, String mapX, String mapY, String workingtime, String isoimage, String aboutus) {
        this.id = id;
        this.companyname = companyname;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.mapX = mapX;
        this.mapY = mapY;
        this.workingtime = workingtime;
        this.isoimage = isoimage;
        this.aboutus = aboutus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMapX() {
        return mapX;
    }

    public void setMapX(String mapX) {
        this.mapX = mapX;
    }

    public String getMapY() {
        return mapY;
    }

    public void setMapY(String mapY) {
        this.mapY = mapY;
    }

    public String getWorkingtime() {
        return workingtime;
    }

    public void setWorkingtime(String workingtime) {
        this.workingtime = workingtime;
    }

    public String getIsoimage() {
        return isoimage;
    }

    public void setIsoimage(String isoimage) {
        this.isoimage = isoimage;
    }

    public Integer getZoommap() {
        return zoommap;
    }

    public void setZoommap(Integer zoommap) {
        this.zoommap = zoommap;
    }

    public String getBannerfooter() {
        return bannerfooter;
    }

    public void setBannerfooter(String bannerfooter) {
        this.bannerfooter = bannerfooter;
    }

    public String getAboutus() {
        return aboutus;
    }

    public void setAboutus(String aboutus) {
        this.aboutus = aboutus;
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
        if (!(object instanceof Contact)) {
            return false;
        }
        Contact other = (Contact) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication2.Contact[ id=" + id + " ]";
    }
    
}
