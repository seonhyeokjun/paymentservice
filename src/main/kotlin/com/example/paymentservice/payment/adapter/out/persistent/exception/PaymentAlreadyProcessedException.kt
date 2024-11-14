package com.example.paymentservice.payment.adapter.out.persistent.exception

import com.example.paymentservice.payment.domain.PaymentStatus

class PaymentAlreadyProcessedException (
    val status: PaymentStatus,
    message: String
) : RuntimeException(message)