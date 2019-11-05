package io;

import java.io.BufferedReader;
import java.io.IOException;

public class ReaderConsole implements IReader {
    private BufferedReader reader;
    public int readNumber() throws IOException {
        return Integer.parseInt(reader.readLine());
    }

    public String readLn() throws IOException {
        return reader.readLine();
    }
}


