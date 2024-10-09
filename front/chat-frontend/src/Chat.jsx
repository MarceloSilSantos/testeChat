import React, { useState, useEffect } from 'react';
import axios from 'axios';

const Chat = () => {
    const API_URL = 'http://localhost:8080/api/messages'; // URL da sua API

// Função para obter mensagens
const fetchMessages = async () => {
    try {
        const response = await axios.get(API_URL);
        console.log('Messages:', response.data);
        return response.data;
    } catch (error) {
        console.error('Error fetching messages:', error);
    }
};

// Função para criar uma nova mensagem
const createMessage = async (messageContent) => {
    try {
        const message = { content: messageContent };
        const response = await axios.post(API_URL, message);
        console.log('Message created:', response.data);
        return response.data;
    } catch (error) {
        console.error('Error creating message:', error);
    }
};
    };

    return (
        <div>
            <div>
                {messages.map(msg => (
                    <div key={msg.id}>
                        <strong>{msg.user}</strong>: {msg.content}
                    </div>
                ))}
            </div>
            <input
                type="text"
                value={user}
                onChange={e => setUser(e.target.value)}
                placeholder="Seu nome"
            />
            <input
                type="text"
                value={content}
                onChange={e => setContent(e.target.value)}
                placeholder="Mensagem"
            />
            <button onClick={sendMessage}>Enviar</button>
        </div>
    );


export default Chat;
