package com.task1.optisol.models;

import java.io.Serializable;
import java.util.ArrayList;

public class Data implements Serializable {
    private String event_created_at;

    private String id;

    private ArrayList<EventPics> EventPics;

    public ArrayList<EventPics> getEventPics() {
        return EventPics;
    }

    public void setEventPics(ArrayList<EventPics> eventPics) {
        EventPics = eventPics;
    }

    private String created_by_id;

    private String baby_id;

    private String updated_at;

    private String created_at;

    private String date;

    private String event_name;

    public String getEvent_created_at ()
    {
        return event_created_at;
    }

    public void setEvent_created_at (String event_created_at)
    {
        this.event_created_at = event_created_at;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getCreated_by_id ()
    {
        return created_by_id;
    }

    public void setCreated_by_id (String created_by_id)
    {
        this.created_by_id = created_by_id;
    }

    public String getBaby_id ()
    {
        return baby_id;
    }

    public void setBaby_id (String baby_id)
    {
        this.baby_id = baby_id;
    }

    public String getUpdated_at ()
    {
        return updated_at;
    }

    public void setUpdated_at (String updated_at)
    {
        this.updated_at = updated_at;
    }

    public String getCreated_at ()
    {
        return created_at;
    }

    public void setCreated_at (String created_at)
    {
        this.created_at = created_at;
    }

    public String getDate ()
    {
        return date;
    }

    public void setDate (String date)
    {
        this.date = date;
    }

    public String getEvent_name ()
    {
        return event_name;
    }

    public void setEvent_name (String event_name)
    {
        this.event_name = event_name;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [event_created_at = "+event_created_at+", id = "+id+", EventPics = "+EventPics+", created_by_id = "+created_by_id+", baby_id = "+baby_id+", updated_at = "+updated_at+", created_at = "+created_at+", date = "+date+", event_name = "+event_name+"]";
    }
}

