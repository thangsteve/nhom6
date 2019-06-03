package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Products;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2019-06-03T18:54:05")
@StaticMetamodel(Brand.class)
public class Brand_ { 

    public static volatile SingularAttribute<Brand, String> brandImages;
    public static volatile SingularAttribute<Brand, String> brandName;
    public static volatile CollectionAttribute<Brand, Products> productsCollection;
    public static volatile SingularAttribute<Brand, String> brandID;
    public static volatile SingularAttribute<Brand, Boolean> brandState;

}