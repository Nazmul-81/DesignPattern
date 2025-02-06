package com.csbd.structural.adaptive;

public class AdapterMain {
    public static void main(String[] args) {
        NewSystem newSystem = new NewSystem();
        PrinterAdapter printerAdapter = new PrinterAdapter(newSystem); // input: New System -> JSON Data
        printerAdapter.print(); // output: from Old Printer
    }
}
