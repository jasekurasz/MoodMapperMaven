package components;

import components.Comment;
import components.MMGroup;
import components.MoodStatus;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-28T13:27:56")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> firstName;
    public static volatile SingularAttribute<User, String> lastName;
    public static volatile SingularAttribute<User, String> password;
    public static volatile SetAttribute<User, Comment> comments;
    public static volatile SetAttribute<User, MoodStatus> moodStatuses;
    public static volatile SetAttribute<User, MMGroup> groupsOwned;
    public static volatile SetAttribute<User, MMGroup> groupsJoined;
    public static volatile SingularAttribute<User, Integer> id;
    public static volatile SingularAttribute<User, String> email;
    public static volatile SingularAttribute<User, String> username;

}