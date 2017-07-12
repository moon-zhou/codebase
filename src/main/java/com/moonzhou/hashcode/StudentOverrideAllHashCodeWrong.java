package com.moonzhou.hashcode;

public class StudentOverrideAllHashCodeWrong {
    private int age;
    private String name;
    private static int index = 5;

    public StudentOverrideAllHashCodeWrong() {
    }

    public StudentOverrideAllHashCodeWrong(int age, String name) {
        super();

        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (age + index++);
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        System.out.println("result :" + result);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        StudentOverrideAllHashCodeWrong other = (StudentOverrideAllHashCodeWrong) obj;
        if (age != other.age)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
}
