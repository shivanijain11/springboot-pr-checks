package com.premergeprcheck.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringbootPrChecksApplicationTest {

    @Test
    void testHealth() {

        DemoController controller = new DemoController();

        assertEquals(
                "Application Running",
                controller.health()
        );
    }

}
