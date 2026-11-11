package com.example;

import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.*;

public class FileHandlerTest {
    @Test
    public void testGetFilePath() {
        FileHandler handler = new FileHandler();
        String expected = "data" + File.separator + "file.txt";
        assertEquals(expected, handler.getFilePath("file.txt"));
    }
}