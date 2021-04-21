package example.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DefaultRestController {

  @GetMapping("/")
  fun home1(): String {
      return "Welcome to gradle kotlin springframework"
  }

}
