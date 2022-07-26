package ru.netology.sqr.numSqrt.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.numSqrt.services.SQRService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/sqrt.csv")
    public void inLimits(int bottomLimit, int topLimit, int expected) {
        SQRService service = new SQRService();

        //int bottomLimit = 1;
        //int topLimit = 1000;
        //int expected = 22;

        int actual = service.calcNumberSquareRoots(bottomLimit, topLimit);

        assertEquals (expected, actual);
    }
}
