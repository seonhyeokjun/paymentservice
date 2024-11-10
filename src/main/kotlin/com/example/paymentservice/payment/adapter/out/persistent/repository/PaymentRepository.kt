package com.example.paymentservice.payment.adapter.out.persistent.repository

import com.example.paymentservice.payment.domain.PaymentEvent
import reactor.core.publisher.Mono

interface PaymentRepository {
    fun save(paymentEvent: PaymentEvent): Mono<Void>
}