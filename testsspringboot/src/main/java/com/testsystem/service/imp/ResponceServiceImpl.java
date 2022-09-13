package com.testsystem.service.imp;

import com.testsystem.dto.ResponceDto;
import org.springframework.web.client.RestTemplate;

/**
 * Created by roman.ali on 9/1/2022.
 */
public class ResponceServiceImpl {
    String url = "https://jsonplaceholder.typicode.com/posts/1";

    // create an instance of RestTemplate
    RestTemplate restTemplate = new RestTemplate();

    // make an HTTP GET request
    ResponceDto json = restTemplate.getForObject(url, ResponceDto.class);

}
