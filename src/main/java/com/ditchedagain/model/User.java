package com.ditchedagain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

/**
 * Created by jose on 8/27/15.
 */
@Entity
@EqualsAndHashCode(exclude={"firstName", "lastName", "email", "password", "phoneNumber", "phoneNumberValidated", "twoFactorAuthenticationEnabled"})
public @Data class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String email;
    @Column
    private String password;
    @Column
    private String phoneNumber;
    @Column
    private boolean phoneNumberValidated;
    @Column
    private boolean twoFactorAuthenticationEnabled;
    @OneToMany
    private Collection<Trade> trades;
    @OneToMany
    private Collection<TradeStrategy> tradeStrategy;
}
