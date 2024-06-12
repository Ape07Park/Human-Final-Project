package com.example.ft.controller;

import org.springframework.boot.web.servlet.error.ErrorController; 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // Spring MVC의 컨트롤러 클래스임을 나타냄
public class WebController {

    /**
     * 지정된 URL 패턴에 대한 요청을 index.html로 포워딩합니다.
     * @RequestMapping은 다양한 HTTP 메서드(GET, POST 등)를 지원합니다.
     * 
     * @return "forward:/index.html" - 요청을 index.html로 포워딩합니다.
     */
    @RequestMapping(value = {"/ft/**", "/ft", "/"})
    public String redirect() {
        return "forward:/index.html";
    }

    /**
     * /success URL 패턴에 대한 요청을 index.html로 포워딩합니다.
     * 성공 시의 요청을 처리합니다.
     * 
     * @return "forward:/index.html" - 요청을 index.html로 포워딩합니다.
     */
    @RequestMapping(value = "/success")
    public String success() {
        return "forward:/index.html";
    }

    /**
     * /fail URL 패턴에 대한 요청을 index.html로 포워딩합니다.
     * 실패 시의 요청을 처리합니다.
     * 
     * @return "forward:/index.html" - 요청을 index.html로 포워딩합니다.
     */
    @RequestMapping(value = "/fail")
    public String fail() {
        return "forward:/index.html";
    }

    /**
     * /item/detail URL 패턴에 대한 요청을 index.html로 포워딩합니다.
     * 아이템 상세 페이지 요청을 처리합니다.
     * 
     * @return "forward:/index.html" - 요청을 index.html로 포워딩합니다.
     */
    @RequestMapping(value = "/item/detail")
    public String itemDetail() {
        return "forward:/index.html";
    }
}
