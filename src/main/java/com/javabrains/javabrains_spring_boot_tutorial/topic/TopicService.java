package com.javabrains.javabrains_spring_boot_tutorial.topic;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

//business service
@Service //stereotype annotation to tell that this class is the business service
public class TopicService {

    private List<Topics> topics =  Arrays.asList(
            new Topics("springboot", "Sprint Boot", "Learn with Abhinav zero to Hero in Spring Boot"),
            new Topics("java", "Java Master Class", "Learn with Abhinav zero to Hero in Java")
        );

    public List<Topics> getAllTopics(){
        return topics;
    }

    public Topics getTopicId(String id){
        return topics.stream().filter(t-> t.getId().equals(id))
                .findFirst().orElse(null);

    }
}
