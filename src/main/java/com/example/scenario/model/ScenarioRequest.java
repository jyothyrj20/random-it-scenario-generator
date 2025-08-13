package com.example.scenario.model;

public class ScenarioRequest {
    private String technology;
    private String role;
    private String environment;
    private int count = 1; // default 1 scenario

    // Getters and setters
    public String getTechnology() { return technology; }
    public void setTechnology(String technology) { this.technology = technology; }
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
    public String getEnvironment() { return environment; }
    public void setEnvironment(String environment) { this.environment = environment; }
    public int getCount() { return count; }
    public void setCount(int count) { this.count = count; }
}
