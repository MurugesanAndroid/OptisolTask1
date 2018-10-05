package com.task1.optisol.models;

import java.io.Serializable;

public class EventPics implements Serializable{
    private String created_by_id;

    private String dummyname;

    private String event_id;

    private String date;

    private String keyname;

    private String type;

    private String month_year;

    private String id;

    private String event_created_at;

    private String dimension;

    private String updated_at;

    private String month;

    private String created_at;

    private String uploaded_at;

    private String year;

    public String getCreated_by_id ()
    {
        return created_by_id;
    }

    public void setCreated_by_id (String created_by_id)
    {
        this.created_by_id = created_by_id;
    }

    public String getDummyname ()
    {
        return dummyname;
    }

    public void setDummyname (String dummyname)
    {
        this.dummyname = dummyname;
    }

    public String getEvent_id ()
    {
        return event_id;
    }

    public void setEvent_id (String event_id)
    {
        this.event_id = event_id;
    }

    public String getDate ()
    {
        return date;
    }

    public void setDate (String date)
    {
        this.date = date;
    }

    public String getKeyname ()
    {
        return keyname;
    }

    public void setKeyname (String keyname)
    {
        this.keyname = keyname;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getMonth_year ()
    {
        return month_year;
    }

    public void setMonth_year (String month_year)
    {
        this.month_year = month_year;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getEvent_created_at ()
    {
        return event_created_at;
    }

    public void setEvent_created_at (String event_created_at)
    {
        this.event_created_at = event_created_at;
    }

    public String getDimension ()
    {
        return dimension;
    }

    public void setDimension (String dimension)
    {
        this.dimension = dimension;
    }

    public String getUpdated_at ()
    {
        return updated_at;
    }

    public void setUpdated_at (String updated_at)
    {
        this.updated_at = updated_at;
    }

    public String getMonth ()
    {
        return month;
    }

    public void setMonth (String month)
    {
        this.month = month;
    }

    public String getCreated_at ()
    {
        return created_at;
    }

    public void setCreated_at (String created_at)
    {
        this.created_at = created_at;
    }

    public String getUploaded_at ()
    {
        return uploaded_at;
    }

    public void setUploaded_at (String uploaded_at)
    {
        this.uploaded_at = uploaded_at;
    }

    public String getYear ()
    {
        return year;
    }

    public void setYear (String year)
    {
        this.year = year;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [created_by_id = "+created_by_id+", dummyname = "+dummyname+", event_id = "+event_id+", date = "+date+", keyname = "+keyname+", type = "+type+", month_year = "+month_year+", id = "+id+", event_created_at = "+event_created_at+", dimension = "+dimension+", updated_at = "+updated_at+", month = "+month+", created_at = "+created_at+", uploaded_at = "+uploaded_at+", year = "+year+"]";
    }
}

