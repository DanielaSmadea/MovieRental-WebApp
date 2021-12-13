package movies.rental.project.dto;

import movies.rental.project.entity.Address;
import movies.rental.project.entity.Customer;
import movies.rental.project.entity.Order;
import movies.rental.project.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
