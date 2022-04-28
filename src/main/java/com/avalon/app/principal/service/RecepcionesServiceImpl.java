package com.avalon.Avalon.Service;


import com.avalon.Avalon.Model.Recepciones;
import com.avalon.Avalon.Repository.RecepcionesRespository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RecepcionesServiceImpl implements RecepcionesService {

    @Autowired
    private RecepcionesRespository recepcionesRespository;

    @Autowired
    private VolumenService volumenService;

    @Override
    public void save(Recepciones recepciones) {
        volumenService.save(recepciones.getSumaVolumenRecepcionMes());
        recepcionesRespository.save(recepciones);
        log.info("Se guardo con exito!");
    }
}
