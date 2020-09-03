package cds.services;

import cds.entities.Cd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cds.repositories.CdRepository;

import javax.swing.text.html.Option;
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

    public void update(Cd cd) {
        Optional<Cd> optionalCd = cdRepository.findById(cd.getId());
        if(optionalCd.isPresent()) {
            cdRepository.save(cd);
        }
    }

    public void create(Cd cd) {
        Optional<Cd> optionalCd = cdRepository.findById(cd.getId());
        if(!optionalCd.isPresent()) {
            cdRepository.save(cd);
        }
    }

    public void delete(Long id) {
        cdRepository.deleteById(id);
    }
}
