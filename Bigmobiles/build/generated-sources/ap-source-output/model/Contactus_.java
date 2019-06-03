package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2019-06-03T18:54:05")
@StaticMetamodel(Contactus.class)
public class Contactus_ { 

    public static volatile SingularAttribute<Contactus, Integer> contactID;
    public static volatile SingularAttribute<Contactus, String> name;
    public static volatile SingularAttribute<Contactus, String> email;
    public static volatile SingularAttribute<Contactus, String> content;
    public static volatile SingularAttribute<Contactus, String> createDate;
    public static volatile SingularAttribute<Contactus, Boolean> status;

}