package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Products;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2019-06-03T18:54:05")
@StaticMetamodel(Category.class)
public class Category_ { 

    public static volatile SingularAttribute<Category, String> categoryImages;
    public static volatile CollectionAttribute<Category, Products> productsCollection;
    public static volatile SingularAttribute<Category, Boolean> categoryState;
    public static volatile SingularAttribute<Category, String> categoryName;
    public static volatile SingularAttribute<Category, String> categoryID;

}