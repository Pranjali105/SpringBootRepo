package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

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

	// get all the Topics
	@RequestMapping("/topics")
	public List<Topic> getTopics() {
		return topicService.getAllTopicList();
	}

	// get Topics by ID
	@RequestMapping("/topics/{id}")
	public Topic getTopicById(@PathVariable String id) {
		return topicService.getTopicByID(id);
	}

	// add the topics in list
	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public void addTopicInList(@RequestBody Topic topic) {
		topicService.addTopicInList(topic);
	}

	// update the topic by its id
	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
	public void updateTopicInList(@RequestBody Topic topic, @PathVariable String id) {
		topicService.updateTopicInList(topic, id);
	}

	// delete the topic by its id
	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
	public void deleteTopicById(@PathVariable String id) {
		topicService.deleteTopicById(id);
	}

}
