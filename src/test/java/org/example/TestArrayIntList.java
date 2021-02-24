    package org.example;

    import org.junit.jupiter.api.DisplayName;
    import org.junit.jupiter.api.RepeatedTest;
    import org.junit.jupiter.api.RepetitionInfo;

    import static org.junit.jupiter.api.Assertions.assertEquals;
    import static org.junit.jupiter.api.Assertions.assertTrue;

    import java.util.function.BooleanSupplier;

    /**
     * Unit test for simple App.
     */
    public class TestArrayIntList {
        @DisplayName("Repeated test")
        @RepeatedTest(value = 5)
        void repeatedTestWithInfo(RepetitionInfo repetitionInfo) {
            assertTrue (repetitionInfo.getCurrentRepetition() <= repetitionInfo.getTotalRepetitions());
            assertEquals(5, repetitionInfo.getTotalRepetitions());

        }
    }
