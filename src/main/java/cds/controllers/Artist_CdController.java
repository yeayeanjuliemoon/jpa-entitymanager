package cds.controllers;

import cds.entities.Artist_Cd;
import cds.services.Artist_CdService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class Artist_CdController {

    public static final Logger LOGGER = LoggerFactory.getLogger(Artist_CdController.class);
    private Artist_CdService artist_cdService;

    @Autowired
    public Artist_CdController(Artist_CdService artist_cdService) {
        this.artist_cdService = artist_cdService;
    }

    @GetMapping("/artistCds/artistCd")
    public Artist_Cd findById(@RequestParam Long id) {
        return artist_cdService.findById(id).get();
    }

    @GetMapping("/artistCds")
    public List<Artist_Cd> findAll() {
        return artist_cdService.findAll();
    }

    @PutMapping("/artistCds")
    public void update(@RequestBody Artist_Cd artist_cd) {
        artist_cdService.update(artist_cd);
    }

    @PostMapping("/artistCds")
    public void create(@RequestBody Artist_Cd artist_cd) {
        artist_cdService.create(artist_cd);
    }

    @DeleteMapping("/artistCds")
    public void delete(@RequestBody Long id) {
        artist_cdService.delete(id);
    }
}
