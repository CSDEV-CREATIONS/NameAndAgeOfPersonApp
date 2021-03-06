package com.CSDEV_CREATIONS;

public class Person {

    public String firstName;
    public String lastName;
    public int age;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setAge(int age) {
        if(age < 0 || age > 100) {
            age = 0;

        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return this.age;
    }

    public boolean isTeen() {
        if (age > 12 && age < 20) {
            return true;
        } else {
            return false;
        }
    }

    public String getFullName() {
        if(firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        } else if (lastName.isEmpty()) {
            return firstName;
        } else if (firstName.isEmpty()) {
            return lastName;
        } else {
            return firstName + ""  + lastName;
        }
    }



}
