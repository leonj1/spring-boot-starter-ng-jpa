package com.ditchedagain.repository;

import com.ditchedagain.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jose on 6/6/15.
 */
public interface PlayerRepository extends JpaRepository<Player, Long> {
}
