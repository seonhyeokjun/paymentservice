package com.example.paymentservice.payment.adapter.out.web.product

import com.example.paymentservice.common.WebAdapter
import com.example.paymentservice.payment.application.port.out.LoadProductPort
import com.example.paymentservice.payment.domain.Product
import reactor.core.publisher.Flux

@WebAdapter
class ProductWebAdapter : LoadProductPort {
    override fun getProducts(cartId: Long, productIds: List<Long>): Flux<Product> {
        TODO("Not yet implemented")
    }
}