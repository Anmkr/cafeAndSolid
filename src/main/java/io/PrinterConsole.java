package io;

public class PrinterConsole implements IPrinter {
    public void println(String line) {
        System.out.println(line);
    }

    public void print(String line) {
        System.out.print(line);

    }
}


