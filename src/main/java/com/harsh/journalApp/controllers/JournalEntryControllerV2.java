package com.harsh.journalApp.controllers;

import com.harsh.journalApp.entities.JournalEntry;
import com.harsh.journalApp.services.JournalEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
class JournalEntryControllerV2 {

    @Autowired
    private JournalEntryService journalEntryService;

    @GetMapping
    public List<JournalEntry> getAll(){
        return null;
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry){
        journalEntryService.saveEntry(myEntry);
        return true;
    }

    @GetMapping("/id/{myId}")
    public JournalEntry getJournalById(@PathVariable Long myId){
        return null;
    }

    @DeleteMapping("/id/{myId}")
    public JournalEntry deleteJournalById(@PathVariable Long myId){
        return null;
    }

    @PutMapping("/id/{myId}")
    public JournalEntry updateJournalById(@PathVariable Long myId, @RequestBody JournalEntry myEntry){
        return null;
    }
}
