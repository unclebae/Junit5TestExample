package com.example.junit.junit_sample.calculator;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * CalculatorTest
 */
@DisplayName("계산기 테스트를 수행하는 클래스이다.")
public class CalculatorTest {

    Calculator<Integer> calculator;

    @BeforeAll
    static void setup() {
        System.out.println("@Before All: 테스트 클래스 단위로 가장 먼저 실행된다.");
    }

    @BeforeEach
    void init() {
        System.out.println("@BeforeEach: 각 테스트가 수행될 때마다 초기화를 수행한다. 보통 테스트 데이터를 초기화 한다. ");

        calculator = new Calculator<>(new DivideInt());
    }

    @DisplayName("단순 테스트")
    @Test
    void displayTest() {
        System.out.println("@Test: 테스트를 수행하기 위한 어노테이션");
    }

    @Test
    @Disabled("테스트를 건너 뜁니다.")
    void ignoreTest() {
        System.out.println("로그가 찍히는지 확인해보세요. ");
    }

    @DisplayName("AssertTrue Test")
    @Test
    void normalDivideTest() {
        assertTrue(calculator.calculate(10, 10) == 1, () -> "divided done");
    }

    @DisplayName("AssertAll Test")
    @Test
    void normalDivideTest2() {
        assertAll("AssertAll description", () -> assertEquals(calculator.calculate(10, 10), 1),
                () -> assertEquals(calculator.calculate(10, 5), 2), () -> assertEquals(calculator.calculate(10, 2), 5));
    }

    @DisplayName("Assumption Test, assumeTrue(), assumeFalse(), assumingThat()")
    @Test
    void assumptionTest() {
        assumeTrue(10 > 0);
        assumeFalse(10 < 0);
        assumingThat(calculator != null, () -> assertEquals(calculator.calculate(10, 10), 1));
    }

    @DisplayName("Exception Test")
    @Test
    void parameterErrorTest() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> calculator.calculate(10, 0));

        assertEquals(exception.getMessage(), "RValue can't be zero");
    }

    @AfterEach
    void tearDown() {
        System.out.println("@AfterEach: 는 각 테스트가 끝날때 수행된다. 테스트 자원을 정리할때 보통 이용합니다.");
    }

    @AfterAll
    static void done() {
        System.out.println("@AfterAll: 는 전체 테스트가 마무리되고 나서 수행이 된다.");
    }

}