package com.example.paymentservice.payment.application.port.out

import reactor.core.publisher.Mono

interface PaymentStatusUpdatePort {
    fun updatePaymentStatusToExecuting(orderId: String, paymentKey: String): Mono<Boolean>
}