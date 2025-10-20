package tea_coffee_store.model;

import tea_coffee_store.model.enumertion.Status;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Order {
    private LocalDateTime orderDate;
    private User user;
    private Address address;
    private BigDecimal totalPrice;
    private Status status;
    private CartItem[] cartItemArray;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public CartItem[] getCartItemArray() {
        return cartItemArray;
    }

    public void setCartItemArray(CartItem[] cartItemArray) {
        this.cartItemArray = cartItemArray;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
