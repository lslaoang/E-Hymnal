package com.lao.ehymnal.repository;

import com.lao.ehymnal.model.Hymn;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HymnRepository extends CrudRepository<Hymn, String> {
}
