package com.example.notes.dao;
import com.example.notes.modal.NotesInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DataBaseAction extends JpaRepository<NotesInfo,Integer> {


    List<NotesInfo> findByUsername(String username);
    NotesInfo findById(int id);

}
