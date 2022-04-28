/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.avalon.Avalon.Service;

import com.avalon.app.principal.model.Producto;
import com.avalon.app.principal.model.VolumetricoSAT;

import java.util.List;
import java.util.Set;

/**
 *
 * @author frank
 */
public interface VolumetricoSATService {

    void build(VolumetricoSAT volumetricoSAT);

    void save(VolumetricoSAT volumetricoSAT);

    void delete(long id);

    VolumetricoSAT findById(long id);

    List<VolumetricoSAT> findAll();

    Set<Producto> findProductSetById(long id);

}
