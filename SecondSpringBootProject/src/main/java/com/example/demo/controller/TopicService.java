package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;

	/*
	 * private List<Topic> topics = new ArrayList<Topic>( Arrays.asList(new
	 * Topic("Spring_Core", "Spring Core", "Spring Core Description"), new
	 * Topic("Spring_MVC", "Spring MVC", "Spring MVC Description"), new
	 * Topic("Spring_Boot", "Spring Boot", "Spring Boot Description")));
	 */
	// get all the topics from list
	/* public List<Topic> getAllTopicList() { return topics; } */

	// get all the topics from db
	public List<Topic> getAllTopicList() {
		List<Topic> topics = new ArrayList<Topic>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}

	// get topics by its id
	/*
	 * public Topic getTopicByID(String id) { for (Topic obj : topics) { if
	 * (obj.getId().equalsIgnoreCase(id)) { return obj; } else {
	 * System.out.println("Id not found..."); } } return null;
	 * 
	 * }
	 */

	// get topics by id from db
	public Topic getTopicByID(String id) {
		return topicRepository.findById(id).orElse(null);
	}

	// add topics in List
	/*
	 * public void addTopicInList(Topic topic) { topics.add(topic);
	 * 
	 * }
	 */

	// add topics using db
	public void addTopicInList(Topic topic) {
		topicRepository.save(topic);

	}

	// update Topics by its id
	/*
	 * public void updateTopicInList(Topic topic, String id) {
	 * 
	 * for (int i = 0; i < topics.size(); i++) { Topic t = topics.get(i); if
	 * (t.getId().equalsIgnoreCase(id)) { topics.set(i, topic); } else {
	 * System.out.println("Id not found..."); }
	 * 
	 * }
	 * 
	 * }
	 */

	// update topics by its id using db
	public void updateTopicInList(Topic topic, String id) {

		topicRepository.save(topic);
	}

	// delete the topic by its id from list
	/*
	 * public void deleteTopicById(String id) {
	 * 
	 * for (Topic t : topics) { if (t.getId().equalsIgnoreCase(id)) {
	 * topics.remove(t); } else { System.out.println("Id not found..."); } }
	 * 
	 * }
	 */

	//delete the topic by its id from db
	public void deleteTopicById(String id) {

		topicRepository.deleteById(id);

	}

}
