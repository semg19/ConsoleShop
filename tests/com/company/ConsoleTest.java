package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConsoleTest {

    private String test;

    @Test
    public void testName() throws Exception {
         Console console = new Console() {
            @Override
            public void setName(String newName) {
                super.setName("TestName");
                assertEquals("TestName", getName());
            }
        };
    }

    @Test
    public void undefinedName() throws Exception {
        Console console = new Console() {
            @Override
            public void setName(String newName) {
                super.setName(test);
                assertEquals(test, getName());
            }
        };
    }

    @Test
    public void makeCost() throws Exception {
        Console console = new Console() {
            @Override
            protected void setCost(Double newCost) {
                super.setCost(50.00);
                assertSame(50.00, getCost());
            }
        };
    }


}