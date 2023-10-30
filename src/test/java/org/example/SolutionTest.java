package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("provideTestArguments")
    void solution(int[] a, int expected) {
        int result = Solution.solution(a);
        Assertions.assertEquals(expected, result);
    }

    private static Stream<Arguments> provideTestArguments() {
        return Stream.of(
                Arguments.of(new int[]{10, -10, -1, -1, 10}, 1),
                Arguments.of(new int[]{-1, -1, -1, 1, 1, 1, 1}, 3),
                Arguments.of(new int[]{5, -2, -3, 1}, 0),
                Arguments.of(new int[]{10, -9, -1, -1, -1, 20}, 1),
                Arguments.of(new int[]{6, -3, -3, -2, -2, -2, 5}, 2),
                Arguments.of(new int[]{6, -2, -2, -2, -3, -3, 5}, 2),
                Arguments.of(new int[]{6, -2, -2, -3, -3, -2, 5}, 2),
                Arguments.of(new int[]{6, -2, -2, -3, -2, -3, 5}, 2)
        );
    }
}