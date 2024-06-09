package com.hymnbook.repository;

import com.hymnbook.model.HymnBook;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HymnBookRepository extends CrudRepository<HymnBook, String> {

}
