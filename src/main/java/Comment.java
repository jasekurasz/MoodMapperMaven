
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "COMMENTS")

public class Comment implements Serializable {

    @ManyToOne(optional = false, targetEntity = MoodStatus.class)
    @JoinColumn(name = "mood_status_id", referencedColumnName = "id")
    private MoodStatus moodStatusId;

    @Column(name = "id", table = "COMMENTS", nullable = false)
    @Id
    private Integer id;

    @ManyToOne(optional = false, targetEntity = User.class)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User userId;

    @Column(name = "content", table = "COMMENTS")
    @Basic
    private String content;

    @Column(name = "timestamp", table = "COMMENTS")
    @Temporal(TemporalType.TIMESTAMP)
    @Basic
    private Date timestamp;

    public Comment() {

    }

    public MoodStatus getMoodStatusId() {
        return this.moodStatusId;
    }

    public void setMoodStatusId(MoodStatus moodStatusId) {
        this.moodStatusId = moodStatusId;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUserId() {
        return this.userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
