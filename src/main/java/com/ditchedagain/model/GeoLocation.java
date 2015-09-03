package com.ditchedagain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Created by jose on 8/27/15.
 */
@Entity
@EqualsAndHashCode(exclude={"latitude", "longitude", "continent", "city", "state", "timezone", "countryCode", "internetServiceProvider"})
public @Data class GeoLocation {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column
    private String latitude;
    @Column
    private String longitude;
    @Column
    private String continent;
    @Column
    private String city;
    @Column
    private String state;
    @Column
    private String timezone;
    @Column
    private String countryCode;
    @Column
    private String internetServiceProvider;
    @OneToOne
    private GeoLocation geoLocation;
}
