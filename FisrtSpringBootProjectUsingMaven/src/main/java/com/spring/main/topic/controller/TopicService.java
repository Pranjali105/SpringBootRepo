package com.spring.main.topic.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(new Topic("Spring_Core", "Spring Core", "Spring Core Description"),
			new Topic("Spring_MVC", "Spring MVC", "Spring MVC Description"),
			new Topic("Spring_Boot", "Spring Boot", "Spring Boot Description")));

	public List<Topic> getAllTopicList() {
		return topics;
	}
	
	public Topic getTopicByID(String id)
	{
		for(Topic obj : topics)
		{
			if(obj.getId().equalsIgnoreCase(id))
			{
				return obj;
			}
			else
			{
				System.out.println("Id not found...");
			}
		}
		return null;
				
	}

	public void addTopicInList(Topic topic) {
		topics.add(topic);
		
	}

	public void updateTopicInList(Topic topic, String id) {
		
		for(int i = 0; i<topics.size(); i++)
		{
			Topic t = topics.get(i);
			if(t.getId().equalsIgnoreCase(id))
			{
				topics.set(i, topic);
			}
			else
			{
				System.out.println("Id not found...");
			}
		
		}
		
	}

	public void deleteTopicById(String id) {
		
		for(Topic t : topics)
		{
			if(t.getId().equalsIgnoreCase(id))
			{
				topics.remove(t);
			}
			else
			{
				System.out.println("Id not found...");
			}
		}
		
	}

}
