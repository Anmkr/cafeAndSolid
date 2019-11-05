package io;

import java.io.IOException;

public interface IReader {

    int readNumber() throws IOException;

    String readLn() throws IOException;
}