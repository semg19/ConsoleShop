package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConsoleTest {

    @Test
    public void TestName() throws Exception {
        Console console = new Console() {
            @Override
            public void setName(String newName) {
                super.setName("TestName");
            }
        };
    }

    @Test
    public void makeCost() throws Exception {
        Console console = new Console() {
            @Override
            protected void setCost(Double newCost) {
                super.setCost(50.00);
            }
        };
    }
}