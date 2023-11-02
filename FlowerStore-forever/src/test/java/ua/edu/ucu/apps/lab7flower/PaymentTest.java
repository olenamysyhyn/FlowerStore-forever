package ua.edu.ucu.apps.lab7flower;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.lab7flower.payment.CreditCardPaymentStrategy;
import ua.edu.ucu.apps.lab7flower.payment.PayPalPaymentStrategy;

public class PaymentTest {
    private CreditCardPaymentStrategy creditCard;
    private PayPalPaymentStrategy payPal;

    @BeforeEach
    public void init() {
        creditCard = new CreditCardPaymentStrategy();
        payPal = new PayPalPaymentStrategy();
    }

    @Test
    public void testPaymentStrategies() {
        Assertions.assertEquals(800.0,creditCard.pay(800.0));
        Assertions.assertEquals(660.0, payPal.pay(660.0));
    }
}