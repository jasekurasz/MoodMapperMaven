
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "MOOD_STATUSES")

public class MoodStatus implements Serializable {

    @Column(name = "descriptive_word", table = "MOOD_STATUSES", length = 32)
    @Basic
    private String descriptiveWord;

    @OneToMany(targetEntity = Comment.class, mappedBy = "moodStatusId")
    private Collection<Comment> comments;

    @Column(name = "pleasantness_rating", table = "MOOD_STATUSES")
    @Basic
    private Integer pleasantnessRating;

    @Column(name = "energy_rating", table = "MOOD_STATUSES")
    @Basic
    private Integer energyRating;

    @Column(name = "id", table = "MOOD_STATUSES", nullable = false)
    @Id
    private Integer id;

    @Column(name = "is_private", table = "MOOD_STATUSES")
    @Basic
    private Boolean isPrivate;

    @ManyToOne(optional = false, targetEntity = User.class)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User userId;

    @Column(name = "reflective_paragraph", table = "MOOD_STATUSES")
    @Basic
    private String reflectiveParagraph;

    @Column(name = "timestamp", table = "MOOD_STATUSES", length = 45)
    @Basic
    private String timestamp;

    public MoodStatus() {

    }

    public String getDescriptiveWord() {
        return this.descriptiveWord;
    }

    public void setDescriptiveWord(String descriptiveWord) {
        this.descriptiveWord = descriptiveWord;
    }

    public Collection<Comment> getComments() {
        return this.comments;
    }

    public void setComments(Collection<Comment> comments) {
        this.comments = comments;
    }

    public Integer getPleasantnessRating() {
        return this.pleasantnessRating;
    }

    public void setPleasantnessRating(Integer pleasantnessRating) {
        this.pleasantnessRating = pleasantnessRating;
    }

    public Integer getEnergyRating() {
        return this.energyRating;
    }

    public void setEnergyRating(Integer energyRating) {
        this.energyRating = energyRating;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean isIsPrivate() {
        return this.isPrivate;
    }

    public void setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public User getUserId() {
        return this.userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public String getReflectiveParagraph() {
        return this.reflectiveParagraph;
    }

    public void setReflectiveParagraph(String reflectiveParagraph) {
        this.reflectiveParagraph = reflectiveParagraph;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
