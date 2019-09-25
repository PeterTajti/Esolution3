package com.example.demo.services;

import com.example.demo.models.User;
import com.example.demo.repositories.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoteServiceImpl implements NoteService {

    private UserService userService;
    private NoteRepository noteRepository;

    public NoteServiceImpl(UserService userService, NoteRepository noteRepository) {
        this.userService = userService;
        this.noteRepository = noteRepository;
    }

    @Override
    public User deleteNote(Long userId, Long noteId) {
        noteRepository.deleteById(noteId);
        return userService.findUserByUserId(userId);
    }
}
