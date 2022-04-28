/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.avalon.Avalon.Service;

import com.avalon.app.principal.model.VolumetricoSAT;
import com.avalon.Avalon.Repository.VolumetricoSATRepository;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

import com.avalon.Avalon.Util.JSONUtil;
import lombok.extern.slf4j.Slf4j;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author frank
 */
@Slf4j
@Service
public class UploadService {
    @Autowired
    private VolumetricoSATService volumetricoSATService;

    public void save(MultipartFile file) {
        if (!file.isEmpty()) {
            VolumetricoSAT volumetricoSAT = JSONUtil.convertJsonToJava(file, VolumetricoSAT.class);
            volumetricoSATService.save(volumetricoSAT);
        } else {
            throw new FileStorageException("Archivo vacio!");
        }
    }
}
