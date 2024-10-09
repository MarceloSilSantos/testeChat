package br.dev.onepiece.chatPiece.messageRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.onepiece.chatPiece.model.Message;

public interface MessageRepository extends JpaRepository <Message, Long> {

}
