package com.avalon.Avalon.Service;

import com.avalon.Avalon.Model.Volumen;

import java.util.List;

public interface VolumenService {
    void save(Volumen volumen);

    public Volumen findById(long id);

    public List<Volumen> findAll();
}
