package com.hymnbook.repository;

import com.hymnbook.model.HymnBook;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HymnBookRepository extends MongoRepository<HymnBook, String> {

}
