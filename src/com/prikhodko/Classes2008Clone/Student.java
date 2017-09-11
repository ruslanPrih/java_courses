package com.prikhodko.Classes2008Clone;

import java.util.Date;

public class Student implements Cloneable {
    private int age;
    private String name;
    private Date birthday;
    private Adress adress;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public Student(int age, String name, Date birthday, Adress adress) {

        this.age = age;
        this.name = name;
        this.birthday = birthday;
        this.adress = adress;
    }

    public Student(int age, String name, Date birthday) {

        this.age = age;
        this.name = name;
        this.birthday = birthday;
    }

    public Adress getAdress() {
        return adress;
    }

    public Student(Student student) {
        age = (student == null) ? 0 : student.getAge();
        birthday = new Date(student.getBirthday().getTime());
        adress = (student == null) ? null : student.getAdress();
        name = (student == null) ? null : student.getName();

    }

    @Override
    protected Student clone() {
        try {
            /*
            Student clone = (Student) super.clone();
            clone.birthday = (Date) birthday.clone();
            return clone;
*/
            return (Student) super.clone();//поверхностное клонирование
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", adress=" + adress +
                '}';
    }
}
