package com.example.thirdassignment;

public class Detail {

    private String name;
    private String location;
    private String age;
    private String gender;
    private int imageid,deletedet;

    public Detail(String name,String location,String age,String gender,int imageid,int deletedet)
    {
        this.name=name;
        this.location=location;
        this.age=age;
        this.gender=gender;
        this.imageid=imageid;
        this.deletedet=deletedet;
    }

    public String getName()
    {
        return  name;
    }
    public void setName(String name)
    {
        this.name=name;

    }
    public String getLocation()
    {
        return  location;
    }
    public void setLocation(String location)
    {
        this.location=location;

    }
    public String getAge()
    {
        return  age;
    }
    public void setAge(String age)
    {
        this.age=age;

    }
    public String getGender()
    {
        return gender;
    }
    public void setGender(String gender)
    {
        this.gender=gender;
    }
    public int getImageid()
    {
        return imageid;
    }
    public void setImageid(int imageid)
    {
        this.imageid=imageid;
    }
    public int getDeletedet()
    {
        return deletedet;
    }
    public void setDeletedet(int deletedet)
    {
        this.deletedet=deletedet;
    }


}
