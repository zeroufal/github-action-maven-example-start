import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class DeepThoughtTest {

    @Test
    @DisplayName("Test the answer to everything")
    void testAnswerToTheUltimateQuestionOfLifeTheUniverseAndEverythingValid() {
        DeepThought superComputer = new DeepThought();
        assertEquals( 42 , superComputer.answerToTheUltimateQuestionOfLifeTheUniverseAndEverything());
    }
}