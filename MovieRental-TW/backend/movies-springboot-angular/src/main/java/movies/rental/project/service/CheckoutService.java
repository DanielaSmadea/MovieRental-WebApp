package movies.rental.project.service;

import movies.rental.project.dto.Purchase;
import movies.rental.project.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
