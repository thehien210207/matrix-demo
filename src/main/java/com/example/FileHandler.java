package com.example;

import java.io.File;

public class FileHandler {
    public String getFilePath(String fileName) {

        return "data" + File.separator + fileName;
    }
}