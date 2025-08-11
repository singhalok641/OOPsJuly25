package org.example.ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ConfigLoader {
    public String readFirstLine(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));

        return br.readLine();
    }
}
