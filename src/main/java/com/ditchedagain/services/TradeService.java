package com.ditchedagain.services;

import com.ditchedagain.model.Trade;
import com.ditchedagain.repository.TradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * Created by jose on 8/27/15.
 */
@Component
public class TradeService {
    @Autowired
    private TradeRepository repo;

    public TradeService() {
    }

    public Trade addTrade(Trade trade) {
        trade.setId(null);
        return repo.saveAndFlush(trade);
    }

    public void deleteTrade(Long id) {
        repo.delete(id);
    }

    public Collection<Trade> listTrades() {
        return repo.findAll();
    }
}
