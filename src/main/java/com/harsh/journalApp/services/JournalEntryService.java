package com.harsh.journalApp.services;

import com.harsh.journalApp.entities.JournalEntry;
import com.harsh.journalApp.repository.JournalEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JournalEntryService {

    @Autowired
    private JournalEntryRepository journalEntryRepository;  // dependency injection

    public void saveEntry(JournalEntry myEntry){ // method that saves an entry in the db using the mongo repository
        journalEntryRepository.save(myEntry);
    }

    public List<JournalEntry> getAll(){
        return journalEntryRepository.findAll();
    }
}
