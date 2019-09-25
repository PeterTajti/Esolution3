package com.example.demo.services;

import com.example.demo.models.User;

public interface NoteService {

  User deleteNote(Long userId, Long noteId);


}
