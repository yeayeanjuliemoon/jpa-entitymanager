package cds.controllers;

import cds.entities.Cd;
import cds.services.CdService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CdController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CdController.class);
    private CdService cdService;

    @Autowired
    public CdController(CdService cdService) {
        this.cdService = cdService;
    }

    @GetMapping("/cds/cd")
    public Cd findById(@RequestParam Long id) {
        return cdService.findById(id).get();
    }

    @GetMapping("/cds")
    public List<Cd> findAll() {
        return cdService.findAll();
    }

    @PutMapping("/cds")
    public void update(@RequestBody Cd cd) {
        cdService.update(cd);
    }

    @PostMapping("/cds")
    public void create(@RequestBody Cd cd) {
        cdService.create(cd);
    }

    @DeleteMapping("/cds")
    public void delete(@RequestBody Long id) {
        cdService.delete(id);
    }
}
