package com.harsh.journalApp.repository;

import com.harsh.journalApp.entities.JournalEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepository extends MongoRepository<JournalEntry, String> {
}
