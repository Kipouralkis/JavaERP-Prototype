package model;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface Subscription {
    int getMaxSlotsPerMonth();  // Defines the max number of sessions allowed per month
    BigDecimal getCost();           // Defines the cost for the subscription
    BigDecimal applyDiscount();

    LocalDate getStartingDate();
    LocalDate getExpiryDate();
    boolean isExpired();

    void renewSubscription();

}
