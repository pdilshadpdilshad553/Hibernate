package com.sample;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {

    @Id
    private int pid;
    private String pname;

    @ManyToMany(mappedBy = "projects")
    private List<Developer> developers;

    // Getters and Setters
    public int getPid() { return pid; }
    public void setPid(int pid) { this.pid = pid; }

    public String getPname() { return pname; }
    public void setPname(String pname) { this.pname = pname; }

    public List<Developer> getDevelopers() { return developers; }
    public void setDevelopers(List<Developer> developers) { this.developers = developers; }

    // Constructor
    public Project() {}

    public Project(int pid, String pname, List<Developer> developers) {
        this.pid = pid;
        this.pname = pname;
        this.developers = developers;
    }
}