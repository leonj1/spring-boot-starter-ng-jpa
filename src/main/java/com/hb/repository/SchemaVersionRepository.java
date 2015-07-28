package com.hb.repository;

import com.hb.model.SchemaVersion;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jose on 7/27/15.
 */
public interface SchemaVersionRepository extends JpaRepository<SchemaVersion, Long> {
}
