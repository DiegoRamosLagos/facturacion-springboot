package com.think.datajpa.models.service;

import java.io.IOException;
import java.net.MalformedURLException;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

/**
 * IUploadFileService
 */
public interface IUploadFileService {

    public Resource load(String filename) throws MalformedURLException; // mostar la imagen

    public String copy(MultipartFile file) throws IOException; // copiar imagen con URI

    public boolean delete(String filename);

    public void deleteAll();

    public void init() throws IOException;
}