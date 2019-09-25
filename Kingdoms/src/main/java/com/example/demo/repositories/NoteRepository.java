package com.example.demo.repositories;

import com.example.demo.models.Note;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends CrudRepository <Note, Long> {



}
