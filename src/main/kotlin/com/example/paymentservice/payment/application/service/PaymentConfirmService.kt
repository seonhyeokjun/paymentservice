package com.example.paymentservice.payment.application.service

import com.example.paymentservice.common.UseCase
import com.example.paymentservice.payment.application.port.`in`.PaymentConfirmCommand
import com.example.paymentservice.payment.application.port.`in`.PaymentConfirmUseCase
import com.example.paymentservice.payment.application.port.out.PaymentStatusUpdatePort
import com.example.paymentservice2.payment.domain.PaymentConfirmationResult
import reactor.core.publisher.Mono

@UseCase
class PaymentConfirmService (
    private val paymentStatusUpdatePort: PaymentStatusUpdatePort
) : PaymentConfirmUseCase {
    override fun confirm(command: PaymentConfirmCommand): Mono<PaymentConfirmationResult> {
        paymentStatusUpdatePort.updatePaymentStatusToExecuting(command.orderId, command.paymentKey)
    }
}