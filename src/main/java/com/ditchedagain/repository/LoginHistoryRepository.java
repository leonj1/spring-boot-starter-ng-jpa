package com.ditchedagain.repository;

import com.ditchedagain.model.LoginHistory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jose on 8/27/15.
 */
public interface LoginHistoryRepository extends JpaRepository<LoginHistory, Long> {
}
