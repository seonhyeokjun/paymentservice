package com.example.paymentservice.payment.domain

enum class PaymentStatus(description: String) {
    NOT_STARTED("결제 시작 전"),
    EXECUTING("결제 승인 중"),
    SUCCESS("결제 승인 성공"),
    FAILED("결제 승인 실패"),
    UNKNOWN("결제 승인 알 수 없는 상태")
}