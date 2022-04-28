/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.avalon.app.principal.controller;

import com.avalon.Avalon.Service.FileService;
import com.avalon.Avalon.Service.VolumetricoSATService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Arrays;

/**
 *
 * @author frank
 */

@Slf4j
@Controller
public class FileController {

    @Autowired
    FileService fileService;

    @Autowired
    public VolumetricoSATService volumetricoSATService;

    @GetMapping("upload")
    public String upload(Model model) {
        model.addAttribute("listVolumetricoSAT", volumetricoSATService.findAll());
        return "upload";
    }

    @PostMapping("uploadFiles")
    public String uploadFiles(@RequestParam("files") MultipartFile[] files, RedirectAttributes redirectAttributes) {

        Arrays.asList(files)
                .forEach(file -> fileService.uploadFile(file));

        redirectAttributes.addFlashAttribute("message",
                "Has subido correctamente todos los archivos.!");

        return "redirect:/modals/test";
    }

    @GetMapping("deleteVolumId")
    public String modal2(@RequestParam("volumId") long volumId, RedirectAttributes redirectAttributes) {
        volumetricoSATService.delete(volumId);
        redirectAttributes.addFlashAttribute("message",
                "Se ha eliminado correctamente!");
        return "redirect:/upload";
    }

}
