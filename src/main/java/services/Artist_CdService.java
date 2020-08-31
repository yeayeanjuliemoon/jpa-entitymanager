package services;

import entities.Artist;
import entities.Artist_Cd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.Artist_CdRepository;

import java.util.List;
import java.util.Optional;

@Service
public class Artist_CdService {

    private Artist_CdRepository artist_cdRepository;

    @Autowired
    public Artist_CdService(Artist_CdRepository artist_cdRepository) {
        this.artist_cdRepository = artist_cdRepository;
    }

    public Optional<Artist_Cd> findById(Long id) {
        return artist_cdRepository.findById(id);
    }

    public List<Artist_Cd> findAll() {
        return artist_cdRepository.findAll();
    }

    public void update() {

    }

    public void create() {

    }

    public void delete() {

    }
}
