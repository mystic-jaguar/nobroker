package com.nobroker.controller;

import com.nobroker.entity.OwnerPlan;
import com.nobroker.service.OwnerPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/owner-plans")
public class OwnerPlanController {

    @Autowired
    private OwnerPlanService ownerPlanService;

    //http://localhost:8080/api/owner-plans/subscribe/{userId}/{duration}
    @PostMapping("/subscribe/{userId}/{duration}")
    public OwnerPlan subscribeOwnerPlan(@PathVariable long userId, @PathVariable int duration){
        return ownerPlanService.subscribeOwnerPlan(userId, duration);
    }

    @GetMapping("{ownerPlanId}")
    public OwnerPlan getOwnerPlan(@PathVariable long ownerPlanId){
        return ownerPlanService.getOwnerPlan(ownerPlanId);
    }
}
