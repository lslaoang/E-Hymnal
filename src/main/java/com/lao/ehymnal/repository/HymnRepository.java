package com.lao.ehymnal.repository;

import com.lao.ehymnal.model.Hymn;
import org.springframework.stereotype.Repository;

@Repository
public interface HymnRepository extends CrudService<Hymn, String> {
}
