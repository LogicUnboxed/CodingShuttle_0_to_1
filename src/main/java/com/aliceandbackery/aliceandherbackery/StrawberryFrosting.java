package com.aliceandbackery.aliceandherbackery;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;
@Component
@ConditionalOnProperty(name = "deploy.frosting",havingValue = "strawberryfrosting")
public class StrawberryFrosting implements Frosting{
    @Override
    public String getFrostingType() {
        return "Strawberry Frosting";
    }
}
