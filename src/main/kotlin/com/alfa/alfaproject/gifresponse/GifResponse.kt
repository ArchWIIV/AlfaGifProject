package com.alfa.alfaproject.gifresponse

import com.alfa.alfaproject.gifresponse.GifClass
import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Data
@AllArgsConstructor
@NoArgsConstructor
@FeignClient(value = "api-response", url = "https://api.giphy.com/v1/gifs/")
interface AlfaGifResponseClient{

    @RequestMapping(method = [RequestMethod.GET], value = ["/random?api_key=XIAOvy31fddF60wyUlRZ0IcQOCOHf9UL&tag={tag}"])
    fun GetRequiredGif(@PathVariable tag: String): Map<GifClass,*>?

}