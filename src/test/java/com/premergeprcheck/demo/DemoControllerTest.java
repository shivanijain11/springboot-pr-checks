package com.premergeprcheck.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class DemoControllerTest {

    @Test
    void testHealth() {

        DemoController controller = new DemoController();

        assertEquals(
                "Application Running",
                controller.health()
        );
    }

    @Test
    void testControllerCreation() {

        DemoController controller = new DemoController();

        assertNotNull(controller);
    }



}
