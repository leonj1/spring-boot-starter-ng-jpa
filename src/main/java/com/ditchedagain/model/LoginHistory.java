package com.ditchedagain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Date;

/**
 * We want to track where people are loging in from.
 * GeoLocation can be retrieved by converting IP Address at: https://www.telize.com/geoip/46.19.37.108
 * Created by jose on 8/27/15.
 */
@Entity
@EqualsAndHashCode(exclude={"userId", "loginDate", "geoLocation"})
public @Data class LoginHistory {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column
    private Long userId;
    @Column
    private Date loginDate;
    @OneToOne
    private GeoLocation geoLocation;
}
