package com.avalon.Avalon.Service;

import com.avalon.Avalon.Model.ControlDeExistencias;
import com.avalon.Avalon.Repository.ControlDeExistenciasRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ControlDeExistenciasServiceImpl implements ControlDeExistenciasService{

    @Autowired
    private ControlDeExistenciasRepository controlDeExistenciasRepository;

    @Override
    public void save(ControlDeExistencias controlDeExistencias) {
        controlDeExistenciasRepository.save(controlDeExistencias);
    }
}
