/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author Lenovo X1
 */
public class Person {
 
    //Atributes
    
    private String name;
    private String lasName;
    private String id;
    private String phone;
    private int age;

    public Person(String name, String lasName, String id, String phone, int age) {
        this.name = name;
        this.lasName = lasName;
        this.id = id;
        this.phone = phone;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLasName() {
        return lasName;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person\n" 
                + "\n, name=" +getName() 
                + "\n, lasName=" + getLasName()
                + "\n, id=" + getId()
                + "\n, phone=" + getPhone()
                + "\n, age=" + getAge();
                
    }
    
}  
    
    
    
   

