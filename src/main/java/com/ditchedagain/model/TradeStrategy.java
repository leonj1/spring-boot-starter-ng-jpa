package com.ditchedagain.model;

import com.ditchedagain.enums.TradeStrategyStatus;
import com.ditchedagain.enums.Visibility;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.Date;

/**
 * Created by jose on 8/27/15.
 */
@Entity
@EqualsAndHashCode(exclude={"strategyName", "rating", "creator", "createDate", "tradeStrategyStatus", "visibility"})
public @Data class TradeStrategy {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column
    private String strategyName;
    @Column
    private boolean rating;
    @ManyToOne
    private User creator;
    @Column
    private Date createDate;
    @Column
    private TradeStrategyStatus tradeStrategyStatus;
    @Column
    private Visibility visibility;
    @OneToMany
    private Collection<Trade> trades;
}
