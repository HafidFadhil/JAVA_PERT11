/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorphisme;

/**
 *
 * @author
 * NAMA  : Hafid Fadhil
 * KELAS : TI-IC
 * NIM   : A2.1900075
 */
public class Person {
    protected String name;
    protected String address;
    /**
     * Default constructor
     */
    public Person(){
        System.out.println("Inside Person:Constructor");
        name = "";
        address = "";
    }
    /**
     * Constructor dengan dua parameter
     */
    public Person( String name, String address) {
        this.name = name;
        this.address = address;
    }
    /**
     * Method accessor
     */
    public String getName() {
        System.out.println("Person Name : " +name);
        return name;
    }
    public String getAddress() {
        return address;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String add) {
        this.address = add;
    }
}

class Student extends Person{
    public Student()
    {
        //super( "SomeName", "SomeAddress");
        //super();
        //super.name = "name";
        System.out.println("Inside Student:Constructor");
    }
    public String getName() {
        System.out.println("Student Name : " +name);
        return name;
    }
    public static void main( String[] args) {
        Student anna = new Student();
    }
}

class Employee extends Person{
    public String getName() {
        System.out.println("Employee Name:" +name);
        System.out.println("Employee Name:" +name);
        return name;
    }
    public static void main(String[] args){
        Person ref;
        Student studentObject = new Student();
        Employee employeeObject = new Employee();
        ref = studentObject; //Person menunjuk kepada object Student
        String temp = ref.getName(); //getName dari Student class dipanggil
        System.out.println(temp);
        ref = employeeObject; //Person menunjuk kepada object Employee
        temp = ref.getName(); //getName dari Employee class dipanggil
        System.out.println(temp);
        
    }
}