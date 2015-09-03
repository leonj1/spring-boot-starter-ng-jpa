package com.ditchedagain.repository;

import com.ditchedagain.model.GeoLocation;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jose on 8/27/15.
 */
public interface GeoLocationRepository extends JpaRepository<GeoLocation, Long> {
}
