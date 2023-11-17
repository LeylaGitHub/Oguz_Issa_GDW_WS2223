package de.thkoeln.gm.movierecommendations.movies

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody

// MovieController muss überarbeitet werden

@Controller
class MovieController {

    @GetMapping("/")
    @ResponseBody
    fun sayHelloWorld() : String {
        return "Hello World"

    }

    @RequestMapping(path = arrayOf("/greetings"), method = arrayOf(RequestMethod.GET, RequestMethod.POST))
    @ResponseBody
    fun sayHello (name: String): String {
        return "Hello ${name}"
    }

}