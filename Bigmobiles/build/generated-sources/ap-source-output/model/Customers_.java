package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Orders;
import model.Rating;
import model.Wishlist;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2019-06-03T18:54:05")
@StaticMetamodel(Customers.class)
public class Customers_ { 

    public static volatile SingularAttribute<Customers, Boolean> customerState;
    public static volatile SingularAttribute<Customers, String> password;
    public static volatile SingularAttribute<Customers, String> createdDate;
    public static volatile SingularAttribute<Customers, Boolean> gender;
    public static volatile SingularAttribute<Customers, String> phone;
    public static volatile SingularAttribute<Customers, String> customerID;
    public static volatile SingularAttribute<Customers, String> fullName;
    public static volatile CollectionAttribute<Customers, Wishlist> wishlistCollection;
    public static volatile SingularAttribute<Customers, String> avatar;
    public static volatile CollectionAttribute<Customers, Orders> ordersCollection;
    public static volatile CollectionAttribute<Customers, Rating> ratingCollection;
    public static volatile SingularAttribute<Customers, String> email;

}