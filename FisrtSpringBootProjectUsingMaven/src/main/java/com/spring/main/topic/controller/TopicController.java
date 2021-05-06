package com.spring.main.topic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;

	@RequestMapping("/topics")
	public List<Topic> getTopics() {
		return topicService.getAllTopicList();
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getTopicById(@PathVariable String id)
	{
		return topicService.getTopicByID(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public void addTopicInList(@RequestBody Topic topic)
	{
		topicService.addTopicInList(topic);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
	public void updateTopicInList(@RequestBody Topic topic, @PathVariable String id)
	{
		topicService.updateTopicInList(topic, id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
	public void deleteTopicById(@PathVariable String id)
	{
		topicService.deleteTopicById(id);
	}

}
