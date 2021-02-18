package com.example.courseapi.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topics=
            Arrays.asList(new Topic("1","topic1","topic 1 desc"),
                    new Topic("2","topic2","topic 2 desc"),
                    new Topic("3","topic3","topic 3 desc"));

    public List<Topic> getAllTopics(){
        return topics;
    }

    public Topic getTopic(String id){
            return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
    };

}
