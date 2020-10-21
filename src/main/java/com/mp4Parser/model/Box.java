package com.mp4Parser.model;

import java.io.InputStream;

public class Box {
    protected int size;
    protected String type;
    protected int startPos;
    protected int endPos;
    protected String hdlrType = "";

    public Box(InputStream stream, int size, String type) throws Exception {
        this.size = size;
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

}
