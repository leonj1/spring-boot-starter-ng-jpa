package com.hb.repository;

import com.hb.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jose on 6/6/15.
 */
public interface PlayerRepository extends JpaRepository<Player, Long> {
}