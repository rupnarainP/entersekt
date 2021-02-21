package com.entersekt.entersekt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.ServletContext;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class EntersektService {
    @Autowired
    ServletContext context;

    public String getDirectories(){
        String absolutePath = context.getRealPath("resources");
        return absolutePath;
    }

//    public static Set listFilesUsingFilesList(String dir) throws IOException {
//        try (Stream stream = Files.list(Paths.get(dir))) {
//            return stream
//                    .filter(file -> !Files.isDirectory(file))
//                    .map(Path::getFileName)
//                    .map(Path::toString)
//                    .collect(Collectors.toSet());
//        }
//    }

    public Set<String> getFilesInDirectory(String dir){
        String absolutePath = context.getRealPath("resources");
        Set<String> filesInPath = context.getResourcePaths("/" + dir);
        return filesInPath;
    }

}
