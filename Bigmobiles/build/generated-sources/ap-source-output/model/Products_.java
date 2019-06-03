package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Brand;
import model.Category;
import model.OrderDetails;
import model.Rating;
import model.Wishlist;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2019-06-03T18:54:05")
@StaticMetamodel(Products.class)
public class Products_ { 

    public static volatile SingularAttribute<Products, String> image3;
    public static volatile SingularAttribute<Products, String> image4;
    public static volatile SingularAttribute<Products, String> productID;
    public static volatile CollectionAttribute<Products, OrderDetails> orderDetailsCollection;
    public static volatile SingularAttribute<Products, String> description;
    public static volatile CollectionAttribute<Products, Wishlist> wishlistCollection;
    public static volatile SingularAttribute<Products, String> image1;
    public static volatile SingularAttribute<Products, String> image2;
    public static volatile SingularAttribute<Products, Boolean> productState;
    public static volatile SingularAttribute<Products, String> productName;
    public static volatile SingularAttribute<Products, String> des2;
    public static volatile CollectionAttribute<Products, Rating> ratingCollection;
    public static volatile SingularAttribute<Products, String> createdDate;
    public static volatile SingularAttribute<Products, String> feature;
    public static volatile SingularAttribute<Products, Double> price;
    public static volatile SingularAttribute<Products, Brand> brandID;
    public static volatile SingularAttribute<Products, Category> categoryID;

}