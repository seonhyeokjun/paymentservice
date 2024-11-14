package com.example.paymentservice2.payment.domain

import com.example.paymentservice.payment.domain.PaymentStatus

data class PaymentConfirmationResult(
    val status: PaymentStatus
) {

}