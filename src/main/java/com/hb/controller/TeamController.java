package com.hb.controller;

import com.hb.model.Team;
import com.hb.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by jose on 6/6/15.
 */
@Controller
@RequestMapping("/team")
public class TeamController {
    @Autowired
    private TeamRepository repo;

    @RequestMapping(method = RequestMethod.GET)
    public List<Team> findTeams() {
        return repo.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Team addItem(@RequestBody Team team) {
        team.setId(null);
        return repo.saveAndFlush(team);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Team updateItem(@RequestBody Team updatedTeam, @PathVariable Long id) {
        updatedTeam.setId(id);
        return repo.saveAndFlush(updatedTeam);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteItem(@PathVariable Long id) {
        repo.delete(id);
    }
}