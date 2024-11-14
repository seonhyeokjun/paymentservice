package com.example.paymentservice.payment.adapter.out.persistent.repository

import reactor.core.publisher.Mono

interface PaymentStatusUpdateRepository {
    fun updatePaymentStatusToExecuting(orderId: String, paymentKey: String): Mono<Boolean>
//    fun updatePaymentStatus(command: PaymentStatusUpdateCommand): Mono<Boolean>
}