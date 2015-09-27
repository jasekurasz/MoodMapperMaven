
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "GROUPS")

public class MMGroup implements Serializable {

    @Column(name = "name", table = "GROUPS", length = 45)
    @Basic
    private String name;

    @Column(name = "id", table = "GROUPS", nullable = false)
    @Id
    private Integer id;

    @Column(name = "join_code", table = "GROUPS", length = 45)
    @Basic
    private String joinCode;

    @ManyToOne(optional = false, targetEntity = User.class)
    @JoinColumn(name = "owner_id", referencedColumnName = "id")
    private User ownerId;

    @ManyToMany(targetEntity = User.class)
    @JoinTable(name = "GROUP_MEMBERS", joinColumns = {
        @JoinColumn(name = "group_id", referencedColumnName = "id")}, inverseJoinColumns = {
        @JoinColumn(name = "user_id", referencedColumnName = "id")})
    private Collection<User> users;

    public MMGroup() {

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJoinCode() {
        return this.joinCode;
    }

    public void setJoinCode(String joinCode) {
        this.joinCode = joinCode;
    }

    public User getOwnerId() {
        return this.ownerId;
    }

    public void setOwnerId(User ownerId) {
        this.ownerId = ownerId;
    }

    public Collection<User> getUsers() {
        return this.users;
    }

    public void setUsers(Collection<User> users) {
        this.users = users;
    }
}
