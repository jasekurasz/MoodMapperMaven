package components;

import components.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-28T13:27:56")
@StaticMetamodel(MMGroup.class)
public class MMGroup_ { 

    public static volatile SetAttribute<MMGroup, User> groupMembers;
    public static volatile SingularAttribute<MMGroup, User> owner;
    public static volatile SingularAttribute<MMGroup, String> name;
    public static volatile SingularAttribute<MMGroup, Integer> id;
    public static volatile SingularAttribute<MMGroup, String> joinCode;

}