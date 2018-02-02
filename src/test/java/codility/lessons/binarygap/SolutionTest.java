package codility.lessons.binarygap;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SolutionTest {

    Solution underTest = new Solution();

    @Test
    public void test_1_shouldReturn_0() {
        int result = underTest.solution(1);
        assertThat(result, is(0));
    }

    @Test
    public void test_5_shouldReturn_1() {
        int result = underTest.solution(5);
        assertThat(result, is(1));
    }

    @Test
    public void test_9_shouldReturn_2() {
        int result = underTest.solution(9);
        assertThat(result, is(2));
    }

    @Test
    public void test_10_shouldReturn_1() {
        int result = underTest.solution(10);
        assertThat(result, is(1));
    }

    @Test
    public void test_2_shouldReturn_0() {
        int result = underTest.solution(2);
        assertThat(result, is(0));
    }

    @Test
    public void test_4_shouldReturn_0() {
        int result = underTest.solution(4);
        assertThat(result, is(0));
    }

    @Test
    public void test_2147483647_shouldReturn_0() {
        int result = underTest.solution(2147483647);
        assertThat(result, is(0));
    }

    @Test
    public void test_132_shouldReturn_4() {
        int result = underTest.solution(132);
        assertThat(result, is(4));
    }

    //2147483647
}