import src.dto.OrderDto;

public class OrderService {

    public double calculateTotal(OrderDto order) {
        // Teammate added a small bug intentionally
        return order.getPrice() * order.getQuantity() + 5;
    }
}