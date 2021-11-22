package com.alfa.alfaproject

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class AlfaProjectApplication

fun main(args: Array<String>) {
    runApplication<AlfaProjectApplication>(*args)

}
