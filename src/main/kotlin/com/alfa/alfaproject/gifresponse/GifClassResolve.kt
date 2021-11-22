package com.alfa.alfaproject.gifresponse

import com.alfa.alfaproject.response.Currency
import com.alfa.alfaproject.gifresponse.GifClass
import org.springframework.web.bind.annotation.PathVariable

interface GifClassResolve {
        fun GetRequiredGif(@PathVariable tag: String?): String? {
            val currency = Currency().getRates()
            val currency_old = Currency().getRates()
            var gifTag: String? = " "
            val gtag = GifClass()
            when {
                currency?.get("RUB")!! > currency_old?.get("RUB")!! -> gifTag = gtag.richTag
                currency?.get("RUB")!! < currency_old?.get("RUB")!! -> gifTag = gtag.brokeTag

            }
            return gifTag
    }
}
