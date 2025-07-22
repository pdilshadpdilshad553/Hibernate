package com.sample;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Developer {

    @Id
    private int did;
    private String dname;

    @ManyToMany
    private List<Project> projects;

    // Getters and Setters
    public int getDid() { return did; }
    public void setDid(int did) { this.did = did; }

    public String getDname() { return dname; }
    public void setDname(String dname) { this.dname = dname; }

    public List<Project> getProjects() { return projects; }
    public void setProjects(List<Project> projects) { this.projects = projects; }

    // Constructor
    public Developer() {}

    public Developer(int did, String dname, List<Project> projects) {
        this.did = did;
        this.dname = dname;
        this.projects = projects;
    }
}
