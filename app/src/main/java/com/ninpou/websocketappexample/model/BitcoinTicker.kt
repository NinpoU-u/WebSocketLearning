package com.ninpou.websocketappexample.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BitcoinTicker(val  price: String?)