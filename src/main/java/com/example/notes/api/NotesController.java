package com.example.notes.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.web.bind.annotation.*;
import com.example.notes.modal.*;
import com.example.notes.dao.DataBaseAction;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class NotesController{
    @Autowired
    DataBaseAction dataBaseAction;

    //add new notes
    @PostMapping("/addNotes")
    boolean addNotes(@RequestBody NotesInfo notes){
        notes.print();
        dataBaseAction.save(notes);
        return true;

    }
    //delete id
    @PostMapping("/deleteNotes")
    boolean deleteNotes(@RequestBody Map<String,Integer> notesId){
       System.out.println("ids"+notesId.get("id"));
       try {
           dataBaseAction.deleteById(notesId.get("id"));
           return true;
       }
       catch (EmptyResultDataAccessException exp){
           return  false;
       }
    }

//    @PostMapping("/updateNotes")


    //readall
    @PostMapping("/getNotes")
    List<NotesInfo> getNotes(@RequestBody Map<String,String> userdata){

        return dataBaseAction.findByUsername(userdata.get("username"));
    }

    @GetMapping("/")
    String basePage(){
        return "started";
    }

    @PostMapping("/updateNotes")
    boolean updateNotes(@RequestBody NotesInfo notesInfo){
        NotesInfo updateNotesInfo=dataBaseAction.findById(notesInfo.getId());
        updateNotesInfo.setBody(notesInfo.getBody());
        updateNotesInfo.setTitle(notesInfo.getTitle());
        dataBaseAction.save(updateNotesInfo);

        return true;
    }

}
