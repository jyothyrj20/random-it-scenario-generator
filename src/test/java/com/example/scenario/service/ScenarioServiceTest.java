package com.example.scenario;

import com.example.scenario.model.ScenarioRequest;
import com.example.scenario.model.ScenarioResponse;
import com.example.scenario.service.ScenarioService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ScenarioServiceTest {

    private final ScenarioService service = new ScenarioService();

    @Test
    void testSingleScenario() {
        ScenarioRequest request = new ScenarioRequest();
        request.setTechnology("Cloud Computing");
        request.setRole("Software Engineer");
        request.setEnvironment("Cloud Infrastructure");
        request.setCount(1);

        ScenarioResponse response = service.generateScenarios(request);
        assertNotNull(response.getScenarios());
        assertEquals(1, response.getScenarios().size());
    }

    @Test
    void testMultipleScenarios() {
        ScenarioRequest request = new ScenarioRequest();
        request.setTechnology("DevOps");
        request.setRole("System Administrator");
        request.setEnvironment("On-Prem Data Center");
        request.setCount(3);

        ScenarioResponse response = service.generateScenarios(request);
        assertNotNull(response.getScenarios());
        assertEquals(3, response.getScenarios().size());
    }
}
