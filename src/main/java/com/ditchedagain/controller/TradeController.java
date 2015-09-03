package com.ditchedagain.controller;

import com.ditchedagain.model.Trade;
import com.ditchedagain.services.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;

/**
 * Created by jose on 8/27/15.
 */
@Controller
@RequestMapping("/trade")
public class TradeController {
    @Autowired
    private TradeService tradeService;

    @RequestMapping(method = RequestMethod.POST)
    public Trade addTrade(@RequestBody Trade trade) {
        return tradeService.addTrade(trade);
    }

    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    public void deleteTrade(@PathVariable Long id) {
        tradeService.deleteTrade(id);
    }

    @RequestMapping(value="/all", method = RequestMethod.GET)
    public Collection<Trade> getTrades() {
        return tradeService.listTrades();
    }
}
