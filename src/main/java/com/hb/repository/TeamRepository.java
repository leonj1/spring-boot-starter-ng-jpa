package com.hb.repository;

import com.hb.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jose on 6/6/15.
 */
public interface TeamRepository extends JpaRepository<Team, Long> {
}
