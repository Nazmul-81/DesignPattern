package com.csbd.structural.adaptive;


import jdk.nashorn.internal.ir.debug.JSONWriter;
import org.json.JSONObject;

public class NewSystem {
    public String getData(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("message", "Data from new System");
        return jsonObject.toString();
    }
}
