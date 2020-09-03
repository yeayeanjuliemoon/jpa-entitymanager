package cds.controllers;
import cds.entities.Artist;
import cds.services.ArtistService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class ArtistController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ArtistController.class);
    private ArtistService artistService;

    @Autowired
    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }

    @GetMapping("/artists/artist")
    public Artist findById(@RequestParam Long id) {
        return artistService.findById(id).get();
    }

    @GetMapping("/artists")
    public List<Artist> findAll() {
        return artistService.findAll();
    }

    @PutMapping("/artists")
    public void update(@RequestBody Artist artist) {
        artistService.update(artist);
    }

    @PostMapping("/artists")
    public void create(@RequestBody Artist artist) {
        artistService.create(artist);
    }

    @DeleteMapping("/artists")
    public void delete(@RequestBody Long id) {
        artistService.delete(id);
    }
}
