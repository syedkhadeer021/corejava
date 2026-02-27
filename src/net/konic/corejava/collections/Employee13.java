package net.konic.corejava.collections;

public class Employee13 {

    private int id;
    private String name;
    private String dept;

    // getters & setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    // uniqueness based on id
    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Employee13 e = (Employee13) obj;
        return this.id == e.id;
    }

    @Override
    public String toString() {
        return id + "-" + name + "-" + dept;
    }
}
