package Docs;

import org.junit.jupiter.api.*;

public class JunitExamples {

    @BeforeAll
    static void beforeAll() {
        System.out.println("This is the before all method!");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("This is the after all method!");
    }

    @BeforeEach
    void openYandex() {
        System.out.println("        open(\"ya.ru\")");
    }

    @AfterEach
    void takeScreen() {
        System.out.println("        takeScreen();");
    }

    @Test
    void firstTest1() {
        System.out.println("                     first test()");
        Assertions.assertTrue(true);
    }

    @Test
    void secondTest() {
        System.out.println("                    second test()");
        Assertions.assertTrue(true);
    }
}
