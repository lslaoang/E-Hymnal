package com.lao.hymnbook.repository;

import com.lao.hymnbook.model.HymnBook;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HymnBookRepository extends CrudRepository<HymnBook, String> {

}
