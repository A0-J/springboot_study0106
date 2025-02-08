package com.qiena.book.springboot.web;

import com.qiena.book.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // REST API를 처리하는 컨트롤러로 지정
public class HelloController {

    @GetMapping("/hello") // HTTP GET 요청을 처리
    public String hello() {
        return "hello"; // "hello" 문자열을 반환
    }

    @GetMapping("/hello/dto") // HTTP GET 요청으로 DTO를 반환
    public HelloResponseDto helloDto(@RequestParam("name") String name, // 요청 파라미터 "name" 매핑
                                     @RequestParam("amount") int amount) { // 요청 파라미터 "amount" 매핑
        return new HelloResponseDto(name, amount); // HelloResponseDto 객체 반환
    }
}