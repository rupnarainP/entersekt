package com.entersekt.entersekt.controller;

import com.entersekt.entersekt.service.EntersektService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping(path="/entersekt")
public class EntersektController {
    @Autowired
    EntersektService entersektService;

    @GetMapping(path="/directories")
    public String getPath() {

        return entersektService.getDirectories();
    }

    @GetMapping(path="/files")
    public Set<String> getPath(@RequestParam String directory) {

        return entersektService.getFilesInDirectory(directory);
    }
}
