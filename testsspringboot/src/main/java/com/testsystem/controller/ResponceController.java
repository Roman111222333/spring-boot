package com.testsystem.controller;

import com.testsystem.dto.ResponceDto;
import com.testsystem.dto.ResponceDto1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by roman.ali on 8/31/2022.
 */
@RestController
@RequestMapping("/api/restTemplate")
public class ResponceController {
    @Autowired
    private RestTemplate restTemplate;
    String url = "https://jsonplaceholder.typicode.com/posts/1/";
    String url1 = "https://api.publicapis.org/entries";


    @GetMapping("/responce")
    public Object getResponce() {
        Object responce = restTemplate.getForObject(url, Object.class);
        return responce;
    }

    @GetMapping("/responceTemplate")
    public ResponceDto getResponceTemplate() {
        ResponceDto responceTemplate = restTemplate.getForObject(url, ResponceDto.class, "java");
        return responceTemplate;
    }

    @PostMapping("users")
    public ResponceDto create() {
        ResponceDto responceDto = restTemplate.getForObject(url, ResponceDto.class);
        return responceDto;
    }

    @GetMapping("/responce1")
    public ResponceDto1 getResponceTemplate1() {
        ResponceDto1 response =
                restTemplate.getForObject(
                        "https://api.publicapis.org/entries",
                        ResponceDto1.class);
        return response;
    }

    @GetMapping("/responce11")
    public ResponceDto1 getResponceTemplate2() {
        ResponceDto1 response =
                restTemplate.getForObject(
                        "https://api.publicapis.org/entries",
                        ResponceDto1.class);
        return response;
    }


   // @GetMapping("/responce2")


//    public ResponseEntity<?> getStatusCode() {
//        ResponseEntity responseEntity = restTemplate.getForEntity("https://api.publicapis.org/entries",
//                ResponceDto1.class);
//        System.out.println( responseEntity.getStatusCode());
//
//        return new ResponseEntity<>(responseEntity.getBody(),HttpStatus.OK);
//    }

//
//  //  ResponseEntity<Employee[]> responseEntity = restTemplate.getForEntity(uri, Employee[].class);
//    public ResponceDto1 <List<Entries>> getResponceDto1(){
//        ResponceDto1<Entries[]> entries=restTemplate.getForEntity(url1, Entries[].class);
//        return Arrays.asList();
}

//Using RestTemplate





