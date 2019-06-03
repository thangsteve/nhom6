package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Customers;
import model.OrderDetails;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2019-06-03T18:54:05")
@StaticMetamodel(Orders.class)
public class Orders_ { 

    public static volatile SingularAttribute<Orders, Double> total;
    public static volatile SingularAttribute<Orders, String> createdDate;
    public static volatile SingularAttribute<Orders, String> processStatus;
    public static volatile SingularAttribute<Orders, String> orderID;
    public static volatile SingularAttribute<Orders, String> shipNote;
    public static volatile CollectionAttribute<Orders, OrderDetails> orderDetailsCollection;
    public static volatile SingularAttribute<Orders, Customers> customerID;
    public static volatile SingularAttribute<Orders, String> shipName;
    public static volatile SingularAttribute<Orders, String> shipDate;
    public static volatile SingularAttribute<Orders, String> shipAddress;
    public static volatile SingularAttribute<Orders, String> shipPhone;
    public static volatile SingularAttribute<Orders, Boolean> orderState;

}