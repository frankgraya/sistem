package com.avalon.Avalon.Service;

import com.avalon.app.principal.model.Producto;
import com.avalon.Avalon.Repository.ProductoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProductoServiceImpl implements ProductoService{

    @Autowired
    private ProductoRepository productoRepository;
    @Autowired
    private ReporteDeVolumenMensualService reporteDeVolumenMensualService;

    @Override
    public void build(Producto producto) {
        reporteDeVolumenMensualService.save(producto.getReporteDeVolumenMensual());
    }

    @Override
    public void save(Producto producto) {
        productoRepository.save(producto);
    }
}
