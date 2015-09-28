package components;

import components.MoodStatus;
import components.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-28T13:27:56")
@StaticMetamodel(Comment.class)
public class Comment_ { 

    public static volatile SingularAttribute<Comment, Date> time_stamp;
    public static volatile SingularAttribute<Comment, Integer> id;
    public static volatile SingularAttribute<Comment, MoodStatus> moodStatus;
    public static volatile SingularAttribute<Comment, User> user;
    public static volatile SingularAttribute<Comment, String> content;

}