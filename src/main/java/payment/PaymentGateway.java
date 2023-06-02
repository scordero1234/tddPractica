package payment;

import payment.PaymentRequest;
import payment.PaymentResponse;

public interface PaymentGateway {
    public PaymentResponse requestPayment(PaymentRequest paymentRequest);

}