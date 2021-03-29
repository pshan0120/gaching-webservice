package com.gaching.gachingwebservice.web;


import com.gaching.gachingwebservice.web.dto.HelloResponseDto;
import java.util.HashMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/hello")
  public String hello() {
    return "hello";
  }

  @GetMapping("/calc")
  public String calc() {
    return String.valueOf(1+5);
  }

  @GetMapping("/hello/dto")
  public HelloResponseDto helloDto(@RequestParam("name") String name,
      @RequestParam("amount") int amount) {
    return new HelloResponseDto(name, amount);
  }

  @GetMapping("/api/test/hello")
  public HashMap api_hello() {
    HashMap result = new HashMap();
    result.put("message", "안녕하세요");
    return result;
  }


}
