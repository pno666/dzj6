package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SqrServicesTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqr.csv")
    public void testRightSqrNumber(int bottom, int top, int expected) {
        SqrServices service = new SqrServices();
        int actual = service.calcSqr(bottom, top);

        Assertions.assertEquals(expected, actual);
    }
}
