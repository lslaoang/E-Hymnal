package com.lao.ehymnal.repository;

import com.lao.ehymnal.model.Hymn;
import org.springframework.data.repository.CrudRepository;

public interface HymnRepository extends CrudRepository<Hymn, String> {
}
