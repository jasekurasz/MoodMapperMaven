/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author faithfulokoye
 */
@Entity
@Table(name = "GROUPS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MMGroup.findAll", query = "SELECT m FROM MMGroup m"),
    @NamedQuery(name = "MMGroup.findById", query = "SELECT m FROM MMGroup m WHERE m.id = :id"),
    @NamedQuery(name = "MMGroup.findByName", query = "SELECT m FROM MMGroup m WHERE m.name = :name"),
    @NamedQuery(name = "MMGroup.findByJoinCode", query = "SELECT m FROM MMGroup m WHERE m.joinCode = :joinCode")})
public class MMGroup implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Size(max = 45)
    private String name;
    
    @Size(max = 45)
    @Column(name = "join_code")
    private String joinCode;
    
    @JoinTable(name = "GROUP_MEMBERS", joinColumns = {
        @JoinColumn(name = "group_id", referencedColumnName = "id")}, inverseJoinColumns = {
        @JoinColumn(name = "user_id", referencedColumnName = "id")})
    @ManyToMany
    private Set<User> groupMembers;
    
    @JoinColumn(name = "owner_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private User owner;

    public MMGroup() {
    }

    public MMGroup(Integer id) {
        this.id = id;
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

    public String getJoinCode() {
        return joinCode;
    }

    public void setJoinCode(String joinCode) {
        this.joinCode = joinCode;
    }

    @XmlTransient
    public Set<User> getGroupMembers() {
        return groupMembers;
    }

    public void setGroupMembers(Set<User> groupMembers) {
        this.groupMembers = groupMembers;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
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
        if (!(object instanceof MMGroup)) {
            return false;
        }
        MMGroup other = (MMGroup) object;
        
        return this.id.equals(other.id);
    }

    @Override
    public String toString() {
        return "components.MMGroup[ id=" + id + " groupName=" + name + "]";
    }
    
}
