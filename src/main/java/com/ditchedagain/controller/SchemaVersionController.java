package com.ditchedagain.controller;

import com.ditchedagain.model.SchemaVersion;
import com.ditchedagain.repository.SchemaVersionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by jose on 7/27/15.
 */
@RestController
@RequestMapping("/schemaversions")
public class SchemaVersionController {
    @Autowired
    private SchemaVersionRepository repo;

    @RequestMapping(method = RequestMethod.GET)
    public List<SchemaVersion> getSchemaVersions() {
        return repo.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public SchemaVersion addSchemaVersion(@RequestBody SchemaVersion schemaVersion) {
        schemaVersion.setId(null);
        return repo.saveAndFlush(schemaVersion);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public SchemaVersion updateSchemaVersion(@RequestBody SchemaVersion schemaVersion, @PathVariable Long id) {
        schemaVersion.setId(id);
        return repo.saveAndFlush(schemaVersion);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteSchemaVersion(@PathVariable Long id) {
        repo.delete(id);
    }
}
