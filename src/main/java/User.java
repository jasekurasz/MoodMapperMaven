
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "USERS", uniqueConstraints = @UniqueConstraint(columnNames = {"email", "username"}))

public class User implements Serializable {

    @Column(name = "first_name", table = "USERS", length = 45)
    @Basic
    private String firstName;

    @Column(name = "last_name", table = "USERS", length = 45)
    @Basic
    private String lastName;

    @Column(name = "password", table = "USERS", nullable = false, length = 45)
    @Basic
    private String password;

    @OneToMany(targetEntity = MMGroup.class, mappedBy = "ownerId")
    private Collection<MMGroup> groups_created;

    @OneToMany(targetEntity = Comment.class, mappedBy = "userId")
    private Collection<Comment> comments;

    @OneToMany(targetEntity = MoodStatus.class, mappedBy = "userId")
    private Collection<MoodStatus> moodStatuses;

    @ManyToMany(targetEntity = MMGroup.class, mappedBy = "users")
    private Collection<MMGroup> groups;

    @Column(name = "id", table = "USERS", nullable = false)
    @Id
    private Integer id;

    @Column(name = "email", table = "USERS", nullable = false)
    @Basic
    private String email;

    @Column(name = "username", table = "USERS", nullable = false, length = 16)
    @Basic
    private String username;

    public User() {

    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Collection<MMGroup> getGroups_created() {
        return this.groups_created;
    }

    public void setGroups_created(Collection<MMGroup> groups_created) {
        this.groups_created = groups_created;
    }

    public Collection<Comment> getComments() {
        return this.comments;
    }

    public void setComments(Collection<Comment> comments) {
        this.comments = comments;
    }

    public Collection<MoodStatus> getMoodStatuses() {
        return this.moodStatuses;
    }

    public void setMoodStatuses(Collection<MoodStatus> moodStatuses) {
        this.moodStatuses = moodStatuses;
    }

    public Collection<MMGroup> getGroups() {
        return this.groups;
    }

    public void setGroups(Collection<MMGroup> groups) {
        this.groups = groups;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
