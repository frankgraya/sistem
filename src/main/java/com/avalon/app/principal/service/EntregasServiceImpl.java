package com.avalon.Avalon.Service;

import com.avalon.Avalon.Model.Entregas;
import com.avalon.Avalon.Repository.EntregasRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EntregasServiceImpl implements EntregasService {

    @Autowired
    private EntregasRepository entregasRepository;
    @Autowired
    private VolumenService volumenService;

    @Override
    public void save(Entregas entregas) {
        volumenService.save(entregas.getSumaVolumenEntregadoMes());
        entregasRepository.save(entregas);
        log.info("Se guardo con exito!");
    }

}
