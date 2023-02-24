package com.group.libraryapp.controller.calculator;

import com.group.libraryapp.dto.calculator.CalculatorMultiplyRequest;
import com.group.libraryapp.dto.calculator.request.CalculatorAddRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//API의 진입지점으로 만들어주는 역할
@RestController
public class CalculatorController {
    //첫 API개발: 덧셈 API
    /*
    * HTTP Method: GET
    * HTTP Path /add
    * Query(key & value): int number1 / int number2
    * API return: number1 + number2
    * */

    @GetMapping("/add") //Get /add
    public int addTwoNumbers(
            //@RequestParam int number1,
            //@RequestParam int number2
            CalculatorAddRequest request){
        return request.getNumber1() + request.getNumber2();
    }

    @PostMapping("/multiply")
    //아래함수를 HTTP Method가 POST이고, Path가 /multiply인 API로 만든다
    //@RequestBody 어노테이션이 있어야 PostAPI에서 정상적으로 Http Body안의 JSON을 객체(CalculatorMultiplyRequest)로 바꾼다.
    public int multiplyTwoNumbers(@RequestBody CalculatorMultiplyRequest request){
        return request.getNumber1() * request.getNumber2();
    }
}
