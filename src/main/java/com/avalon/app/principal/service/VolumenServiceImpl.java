package com.avalon.Avalon.Service;

import com.avalon.Avalon.Model.Volumen;
import com.avalon.Avalon.Repository.VolumenRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class VolumenServiceImpl implements VolumenService{

    @Autowired
    private VolumenRepository volumenRepository;

    @Override
    public void save(Volumen volumen) {
        volumenRepository.save(volumen);
    }

    @Override
    public Volumen findById(long id) {
        Optional<Volumen> optional = volumenRepository.findById(id);
        Volumen volumen = null;
        if (optional.isPresent()) {
            volumen = optional.get();
        } else {
            throw new RuntimeException(" Volumen no encontrado por id :: " + id);
        }
        return volumen;
    }

    @Override
    public List<Volumen> findAll() {
        return  volumenRepository.findAll();
    }
}
