package com.task1.optisol.models;

import java.io.Serializable;
import java.util.ArrayList;

public class Model implements Serializable {
    private String message;

    private ArrayList<Data> data;

    public ArrayList<Data> getData() {
        return data;
    }

    public void setData(ArrayList<Data> data) {
        this.data = data;
    }

    public String getMessage ()
    {
        return message;
    }

    public void setMessage (String message)
    {
        this.message = message;
    }


    @Override
    public String toString()
    {
        return "ClassPojo [message = "+message+", data = "+data+"]";
    }
}

