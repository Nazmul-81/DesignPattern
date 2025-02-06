package com.csbd.behavioral.adaptive;

import org.json.JSONObject;

public class PrinterAdapter {
    private NewSystem newSystem;
    public PrinterAdapter(NewSystem newSystem){
        this.newSystem = newSystem;
    }

    public void print(){
        String jsonData = newSystem.getData();
        JSONObject json = new JSONObject(jsonData);
        String message = json.getString("message");
        new OldPrinter().print(message);
    }
}
