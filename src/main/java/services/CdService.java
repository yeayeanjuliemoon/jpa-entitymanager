package services;

import entities.Artist;
import entities.Cd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.CdRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CdService {

    private CdRepository cdRepository;

    @Autowired
    public CdService(CdRepository cdRepository) {
        this.cdRepository = cdRepository;
    }

    public Optional<Cd> findById(Long id) {
        return cdRepository.findById(id);
    }

    public List<Cd> findAll() {
        return cdRepository.findAll();
    }

    public void update() {

    }

    public void create() {

    }

    public void delete() {

    }
}
