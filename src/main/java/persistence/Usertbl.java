/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package persistence;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Luis Alfredo Moctezu
 */
@Entity
@Table(name = "usertbl")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usertbl.findAll", query = "SELECT u FROM Usertbl u"),
    @NamedQuery(name = "Usertbl.findById", query = "SELECT u FROM Usertbl u WHERE u.id = :id"),
    @NamedQuery(name = "Usertbl.findByMail", query = "SELECT u FROM Usertbl u WHERE u.mail = :mail"),
    @NamedQuery(name = "Usertbl.findByName", query = "SELECT u FROM Usertbl u WHERE u.name = :name"),
    @NamedQuery(name = "Usertbl.findByPassword", query = "SELECT u FROM Usertbl u WHERE u.password = :password")})
public class Usertbl implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "mail")
    private String mail;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "password")
    private String password;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usertbl")
    private Collection<Usrmobiletbl> usrmobiletblCollection;

    public Usertbl() {
    }

    public Usertbl(Integer id) {
        this.id = id;
    }

    public Usertbl(Integer id, String mail, String name, String password) {
        this.id = id;
        this.mail = mail;
        this.name = name;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @XmlTransient
    public Collection<Usrmobiletbl> getUsrmobiletblCollection() {
        return usrmobiletblCollection;
    }

    public void setUsrmobiletblCollection(Collection<Usrmobiletbl> usrmobiletblCollection) {
        this.usrmobiletblCollection = usrmobiletblCollection;
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
        if (!(object instanceof Usertbl)) {
            return false;
        }
        Usertbl other = (Usertbl) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistence.Usertbl[ id=" + id + " ]";
    }
    
}
