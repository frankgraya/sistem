/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.avalon.Avalon.Service;

import com.avalon.app.principal.model.Producto;
import com.avalon.app.principal.model.VolumetricoSAT;
import com.avalon.Avalon.Repository.VolumetricoSATRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 *
 * @author frank
 */
@Service
@Slf4j
public class VolumetricoSATServiceImpl implements VolumetricoSATService {

    @Autowired
    private VolumetricoSATRepository volumetricoSATRepository;

    @Autowired
    private ProductoService productoService;
    @Override
    public void build(VolumetricoSAT volumetricoSAT) {


    }

    @Override
    public void save(VolumetricoSAT volumetricoSAT) {
        for (Producto producto : volumetricoSAT.getProductoSet()){
            producto.setVolumetricoSAT(volumetricoSAT);
            productoService.build(producto);
        }
        volumetricoSATRepository.save(volumetricoSAT);
        log.info("Se guardo con exito!");
    }

    @Override
    public void delete(long id) {
        volumetricoSATRepository.deleteById(id);
    }

    @Override
    public VolumetricoSAT findById(long id) {
        Optional<VolumetricoSAT> optional = volumetricoSATRepository.findById(id);
        VolumetricoSAT volumetricoSAT = null;
        if (optional.isPresent()) {
            volumetricoSAT = optional.get();
        } else {
            throw new RuntimeException(" VOLUMENTRICO NO ENCONTRADO POR ID :: " + id);
        }
        return volumetricoSAT;
    }

    @Override
    public List<VolumetricoSAT> findAll() {
        return volumetricoSATRepository.findAll();
    }

    @Override
    public Set<Producto> findProductSetById(long id) {
        VolumetricoSAT volumetricoSAT = volumetricoSATRepository.getById(id);
        return volumetricoSAT.getProductoSet();
    }

}
