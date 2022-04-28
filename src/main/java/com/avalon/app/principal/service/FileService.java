/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.avalon.Avalon.Service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author frank
 */
@Slf4j
@Service
public class FileService {

    @Value("${app.upload.dir:${user.home}}")
    public String uploadDir;

    @Autowired
    UploadService uploadService;

    public void uploadFile(MultipartFile file) {
        try {
            log.warn("Cargando " + file.getOriginalFilename() + " ...");
            uploadService.save(file);
        } catch (Exception e) {
            e.printStackTrace();
            throw new FileStorageException("No se pudo almacenar el archivo " + file.getOriginalFilename()
                    + ". ¡Inténtalo de nuevo!");
        }
    }

}
