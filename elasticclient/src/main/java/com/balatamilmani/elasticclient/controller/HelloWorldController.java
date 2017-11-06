package com.balatamilmani.elasticclient.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.balatamilmani.elasticclient.model.MemberPostMessage;
import com.balatamilmani.elasticclient.repository.MemberPostMessageRepository;

@RestController
public class HelloWorldController {

	@Autowired
	MemberPostMessageRepository mpmRepository;

	@GetMapping
	public String greet() {
		return "Hello from ElasticClient";
	}

	@PostMapping("addMessage")
	public String addMessage(@RequestBody MemberPostMessage mpMessage) {
		mpmRepository.save(mpMessage);
		return "Message added";
	}

	@GetMapping("retrieveMessage/{id}")
	public MemberPostMessage retrieveMessage(@PathVariable String id) {
		MemberPostMessage mpMessage = null;
		Optional<MemberPostMessage> optional = null;
		optional = mpmRepository.findById("1");
		mpMessage = optional.get();
		return mpMessage;
	}

	@PutMapping("updateMessage")
	public String modifyMessage(@RequestBody MemberPostMessage mpMessage) {
		mpmRepository.save(mpMessage);
		return "Message modified";
	}

	@DeleteMapping("removeMessage/{id}")
	public String removeMessage(@PathVariable String id) {
		mpmRepository.deleteById(id);
		return "Message removed";
	}
}
