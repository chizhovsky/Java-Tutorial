package oop;

public class Animal {
    private String name;
    public void setName(String newName){
        name = newName;
    }
    public String getName(){
        return name;
    }
    public String voice(){
        return "Mooo";
    }
}
