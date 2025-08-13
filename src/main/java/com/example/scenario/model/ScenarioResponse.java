package com.example.scenario.model;

import java.util.List;

public class ScenarioResponse {
    private String technology;
    private String role;
    private String environment;
    private List<Scenario> scenarios;

    public ScenarioResponse(String technology, String role, String environment, List<Scenario> scenarios) {
        this.technology = technology;
        this.role = role;
        this.environment = environment;
        this.scenarios = scenarios;
    }

    // Getters and setters
    public String getTechnology() { return technology; }
    public void setTechnology(String technology) { this.technology = technology; }
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
    public String getEnvironment() { return environment; }
    public void setEnvironment(String environment) { this.environment = environment; }
    public List<Scenario> getScenarios() { return scenarios; }
    public void setScenarios(List<Scenario> scenarios) { this.scenarios = scenarios; }
}
