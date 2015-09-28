package components;

import components.Comment;
import components.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-28T13:27:56")
@StaticMetamodel(MoodStatus.class)
public class MoodStatus_ { 

    public static volatile SingularAttribute<MoodStatus, String> descriptiveWord;
    public static volatile SetAttribute<MoodStatus, Comment> comments;
    public static volatile SingularAttribute<MoodStatus, Date> time_stamp;
    public static volatile SingularAttribute<MoodStatus, Integer> pleasantnessRating;
    public static volatile SingularAttribute<MoodStatus, Integer> energyRating;
    public static volatile SingularAttribute<MoodStatus, Integer> id;
    public static volatile SingularAttribute<MoodStatus, Boolean> isPrivate;
    public static volatile SingularAttribute<MoodStatus, User> user;
    public static volatile SingularAttribute<MoodStatus, String> reflectiveParagraph;

}