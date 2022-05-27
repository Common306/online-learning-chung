package model;

public class Role {
    private int roleId;
    private String name;

    public Role() {
    }

    public Role(int id, String name) {
        this.roleId = id;
        this.name = name;
    }

    public int getId() {
        return roleId;
    }

    public void setId(int id) {
        this.roleId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}