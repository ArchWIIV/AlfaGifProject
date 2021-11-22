package com.alfa.alfaproject

import com.alfa.alfaproject.response.Currency
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod


@FeignClient(value = "instantwebtools-api", url = "https://openexchangerates.org/api/")
interface ApiClient {
    @RequestMapping(method = [RequestMethod.GET], value = ["/latest.json?app_id=2177e9c42a51421d81889de132768d05"])
    fun readCurrencyLatestList(): List<Currency?>?

    @RequestMapping(method = [RequestMethod.GET], value = ["/historical/{modifiedDate}.json?app_id=2177e9c42a51421d81889de132768d05/"])
    fun readCurrencyOldList(@PathVariable("modifiedDate") modifiedDate: String?): List<Currency>?
}

