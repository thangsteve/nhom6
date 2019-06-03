package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Customers;
import model.Products;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2019-06-03T18:54:05")
@StaticMetamodel(Rating.class)
public class Rating_ { 

    public static volatile SingularAttribute<Rating, String> ratingDate;
    public static volatile SingularAttribute<Rating, Products> productID;
    public static volatile SingularAttribute<Rating, Integer> rate;
    public static volatile SingularAttribute<Rating, Integer> ratingID;
    public static volatile SingularAttribute<Rating, Customers> customerID;

}