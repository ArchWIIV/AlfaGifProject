package com.alfa.alfaproject.response

import lombok.Data
import java.time.LocalDate

var date = LocalDate.now()
val modifiedDate: String = date.minusDays(1).toString()

@Data
class Currency {
    private var disclaimer: String? = null
    private var license: String? = null
    private var timestamp: Int? = null
    private var base: String? = null
    private var rates: Map<String, Double>? = null
    fun getDisclaimer(): String? {
        return disclaimer
    }

    fun setDisclaimer(disclaimer: String?) {
        this.disclaimer = disclaimer
    }

    fun getLicense(): String? {
        return license
    }

    fun setLicense(license: String?) {
        this.license = license
    }

    fun getTimestamp(): Int? {
        return timestamp
    }

    fun setTimestamp(timestamp: Int?) {
        this.timestamp = timestamp
    }

    fun getBase(): String? {
        return base
    }

    fun setBase(base: String?) {
        this.base = base
    }

    fun getRates(): Map<String, Double>? {
        return rates
    }

    fun setRates(rates: Map<String, Double>?) {
        this.rates = rates
    }

}