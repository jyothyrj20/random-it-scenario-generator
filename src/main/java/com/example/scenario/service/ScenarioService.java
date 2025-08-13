package com.example.scenario.service;

import com.example.scenario.model.Scenario;
import com.example.scenario.model.ScenarioRequest;
import com.example.scenario.model.ScenarioResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class ScenarioService {

    private final List<String> challenges = Arrays.asList(
            "Cloud service outage in primary region",
            "Unexpected API throttling",
            "Data storage nearing capacity",
            "Security breach detected",
            "Application performance degradation"
    );

    private final List<String> incidents = Arrays.asList(
            "Users cannot access application",
            "High latency for data requests",
            "Writes failing for analytics pipeline",
            "Unauthorized access attempts",
            "Slow response time for end-users"
    );

    private final List<String> troubleshootingSteps = Arrays.asList(
            "Redirect traffic to failover region",
            "Increase request rate limits",
            "Expand storage volume",
            "Update security policies and credentials",
            "Optimize queries and caching"
    );

    private final Random random = new Random();

    public ScenarioResponse generateScenarios(ScenarioRequest request) {
        List<Scenario> generated = new ArrayList<>();
        for (int i = 0; i < request.getCount(); i++) {
            String challenge = challenges.get(random.nextInt(challenges.size()));
            String incident = incidents.get(random.nextInt(incidents.size()));
            String step = troubleshootingSteps.get(random.nextInt(troubleshootingSteps.size()));
            generated.add(new Scenario(challenge, incident, step));
        }
        return new ScenarioResponse(
                request.getTechnology(),
                request.getRole(),
                request.getEnvironment(),
                generated
        );
    }
}
