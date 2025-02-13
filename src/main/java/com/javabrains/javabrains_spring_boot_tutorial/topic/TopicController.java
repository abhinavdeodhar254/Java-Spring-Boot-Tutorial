package com.javabrains.javabrains_spring_boot_tutorial.topic;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    //Controller must have access to the business service so  we tell it by defining the private data member of the service class and annotating it with @autowired.
    //Now we need to ask to inject this member variable.
    //there is only the singleton instance of the class that is created and injected wherever it is needed.
    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topics> getAllTopic() {
            return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    //Here id is passed to the function call.
    //path variable annotation takes the value of id from the url that is passed and gives it to the function call.
    public Topics getTopicById(@PathVariable  String id){
        //as now we are just going to return the one entity from the list of topics opbject here the data type is only topic and not list of topics. Because only one object will get return.
        return topicService.getTopicId(id);
        //the same id is now passed in this funtion call and this funtion is in the service class.
        //Also the reference to the service class is now autowired here.
        //function call is done.
    }
   }
