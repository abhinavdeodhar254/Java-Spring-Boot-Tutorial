package com.javabrains.javabrains_spring_boot_tutorial.topic;

public class Topics {
    private String id;
    private String Name;
    private String Desc;

    public Topics(String id, String Name, String Desc){
        this.id=id;
        this.Name=Name;
        this.Desc=Desc;
    }

    public Topics(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }
}
