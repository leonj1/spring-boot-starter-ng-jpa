package com.ditchedagain.repository;

import com.ditchedagain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jose on 8/27/15.
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
