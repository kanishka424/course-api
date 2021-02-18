package com.example.courseapi.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.Arrays;
import java.util.List;


@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getTopics(){
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")//how to get a single resource using id
    public Topic getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }

//    @RequestMapping("/topic/{foo}")//if variable is different from argument
//    public Topic getTopic(@PathVariable("foo") String id){
//        return topicService.getTopic();
//    }

}
