package com.ehymnal.repository;

import com.ehymnal.model.Hymn;
import org.springframework.stereotype.Repository;

@Repository
public interface HymnRepository extends CrudService<Hymn, String> {
}
