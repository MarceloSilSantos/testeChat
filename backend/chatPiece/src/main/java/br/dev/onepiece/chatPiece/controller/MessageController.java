package br.dev.onepiece.chatPiece.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.dev.onepiece.chatPiece.messageRepository.MessageRepository;
import br.dev.onepiece.chatPiece.model.Message;

@RestController
@RequestMapping ("api/messages")
@CrossOrigin(origins = "http://localhost:5173")

public class MessageController {
	
	 @Autowired
	    private MessageRepository messageRepository;

	    @GetMapping
	    public List<Message> getAllMessages() {
	        return messageRepository.findAll();
	    }

	    @PostMapping
	    public Message createMessage(@RequestBody Message message) {
	        message.setTimestamp(LocalDateTime.now());
	        return messageRepository.save(message);
	    }
	

}
