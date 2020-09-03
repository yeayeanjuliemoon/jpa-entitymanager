package cds.services;

import cds.entities.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cds.repositories.ArtistRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ArtistService {

    private ArtistRepository artistRepository;

    @Autowired
    public ArtistService(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    public Optional<Artist> findById(Long id) {
        return artistRepository.findById(id);
    }

    public List<Artist> findAll() {
        return artistRepository.findAll();
    }

    public void update(Artist artist) {
        Optional<Artist> artist2 = artistRepository.findById(artist.getId());
        if(artist2.isPresent()) {
            artistRepository.save(artist);
        }
    }

    public void create(Artist artist) {
        Optional<Artist> artist2 = artistRepository.findById(artist.getId());
        if(!artist2.isPresent()) {
            artistRepository.save(artist);
        }
    }

    public void delete(Long id) {
        artistRepository.deleteById(id);
    }

}
