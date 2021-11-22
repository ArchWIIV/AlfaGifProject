package com.alfa.alfaproject.gifresponse

import com.alfa.alfaproject.response.Currency
import lombok.Data
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.PathVariable


@Data
class GifClass(url: String = " " ) {

    private var url = url


    @Value("\${giphy.rich}")
     val richTag: String? = null

    @Value("\${giphy.broke}")
     val brokeTag: String? = null

    }


