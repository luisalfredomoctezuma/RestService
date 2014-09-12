/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package persistence;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Luis Alfredo Moctezu
 */

@Entity
@Table(name = "usrmobiletbl")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usrmobiletbl.findAll", query = "SELECT u FROM Usrmobiletbl u"),
    @NamedQuery(name = "Usrmobiletbl.findById", query = "SELECT u FROM Usrmobiletbl u WHERE u.usrmobiletblPK.id = :id"),
    @NamedQuery(name = "Usrmobiletbl.findByPlatform", query = "SELECT u FROM Usrmobiletbl u WHERE u.platform = :platform"),
    @NamedQuery(name = "Usrmobiletbl.findByOperatingSystem", query = "SELECT u FROM Usrmobiletbl u WHERE u.operatingSystem = :operatingSystem"),
    @NamedQuery(name = "Usrmobiletbl.findByIdUser", query = "SELECT u FROM Usrmobiletbl u WHERE u.usrmobiletblPK.idUser = :idUser")})
public class Usrmobiletbl implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UsrmobiletblPK usrmobiletblPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "platform")
    private String platform;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "operating_system")
    private String operatingSystem;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "isActive")
    private byte[] isActive;
    @JoinColumn(name = "id_User", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Usertbl usertbl;

    public Usrmobiletbl() {
    }

    public Usrmobiletbl(UsrmobiletblPK usrmobiletblPK) {
        this.usrmobiletblPK = usrmobiletblPK;
    }

    public Usrmobiletbl(UsrmobiletblPK usrmobiletblPK, String platform, String operatingSystem, byte[] isActive) {
        this.usrmobiletblPK = usrmobiletblPK;
        this.platform = platform;
        this.operatingSystem = operatingSystem;
        this.isActive = isActive;
    }

    public Usrmobiletbl(int id, int idUser) {
        this.usrmobiletblPK = new UsrmobiletblPK(id, idUser);
    }

    public UsrmobiletblPK getUsrmobiletblPK() {
        return usrmobiletblPK;
    }

    public void setUsrmobiletblPK(UsrmobiletblPK usrmobiletblPK) {
        this.usrmobiletblPK = usrmobiletblPK;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public byte[] getIsActive() {
        return isActive;
    }

    public void setIsActive(byte[] isActive) {
        this.isActive = isActive;
    }

    public Usertbl getUsertbl() {
        return usertbl;
    }

    public void setUsertbl(Usertbl usertbl) {
        this.usertbl = usertbl;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usrmobiletblPK != null ? usrmobiletblPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usrmobiletbl)) {
            return false;
        }
        Usrmobiletbl other = (Usrmobiletbl) object;
        if ((this.usrmobiletblPK == null && other.usrmobiletblPK != null) || (this.usrmobiletblPK != null && !this.usrmobiletblPK.equals(other.usrmobiletblPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistence.Usrmobiletbl[ usrmobiletblPK=" + usrmobiletblPK + " ]";
    }
    
}
