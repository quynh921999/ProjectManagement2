/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmanagement;

/**
 *
 * @author quynh
 */
public class User {
    private int id;
    private String username;
    private String password;
    private String fullname;
    private String division;
    public User(int id, String username, String password, String name){
        this.id = id;
        this.username = username;
        this.password = password;
        this.fullname = name;
    }
    public User(String fullname, String division, String username){
        this.fullname = fullname;
        this.division = division;
        this.username = username;
    }
    public User(String fullname, String divi, int id){
        this.fullname = fullname;
        this.division = divi;
        this.id = id;
    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the name
     */
    public String getName() {
        return fullname;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.fullname = name;
    }

    /**
     * @return the division
     */
    public String getDivision() {
        return division;
    }

    /**
     * @param division the division to set
     */
    public void setDivision(String division) {
        this.division = division;
    }
    
    
}
