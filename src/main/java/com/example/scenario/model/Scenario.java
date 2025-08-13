package com.example.scenario.model;

public class Scenario {
    private String challenge;
    private String incident;
    private String troubleshootingStep;

    public Scenario() {}

    public Scenario(String challenge, String incident, String troubleshootingStep) {
        this.challenge = challenge;
        this.incident = incident;
        this.troubleshootingStep = troubleshootingStep;
    }

    // Getters and setters
    public String getChallenge() { return challenge; }
    public void setChallenge(String challenge) { this.challenge = challenge; }
    public String getIncident() { return incident; }
    public void setIncident(String incident) { this.incident = incident; }
    public String getTroubleshootingStep() { return troubleshootingStep; }
    public void setTroubleshootingStep(String troubleshootingStep) { this.troubleshootingStep = troubleshootingStep; }
}
