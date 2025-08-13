package com.example.scenario.controller;

import com.example.scenario.model.ScenarioRequest;
import com.example.scenario.model.ScenarioResponse;
import com.example.scenario.service.ScenarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/scenario")
public class ScenarioController {

    @Autowired
    private ScenarioService scenarioService;

    @PostMapping
    public ScenarioResponse generateScenario(@RequestBody ScenarioRequest request) {
        return scenarioService.generateScenarios(request);
    }
}
