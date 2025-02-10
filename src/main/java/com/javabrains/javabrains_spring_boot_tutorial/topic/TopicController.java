package com.javabrains.javabrains_spring_boot_tutorial.topic;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topics> getAllTopic() {
        return Arrays.asList(
                new Topics("springboot", "Sprint Boot", "Learn with Abhinav zero to Hero in Spring Boot"),
                 new Topics("java", "Java Master Class", "Learn with Abhinav zero to Hero in Java")
        );
    }
   }
