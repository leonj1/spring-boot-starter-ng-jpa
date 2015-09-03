package com.ditchedagain.model;

import com.ditchedagain.enums.TradeAction;
import com.ditchedagain.enums.Visibility;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

/**
 * Created by jose on 8/27/15.
 */
@Entity
@EqualsAndHashCode(exclude={"ticker", "tradeAction", "reason", "tradeStrategy", "createDate", "tradeDate", "owner", "visibility"})
public @Data class Trade {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column
    private String ticker;
    @Column
    private TradeAction tradeAction;
    @Column
    private String reason;
    @ManyToOne
    private TradeStrategy tradeStrategy;
    @Column
    private Date createDate;
    @Column
    private Date tradeDate;
    @ManyToOne
    private User owner;
    @Column
    private Visibility visibility;
}
