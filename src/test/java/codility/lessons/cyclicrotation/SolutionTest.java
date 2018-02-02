package codility.lessons.cyclicrotation;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SolutionTest {

    private Solution underTest = new Solution();

    @Test
    public void test_empty() {
        int[] a = new int[]{};
        int[] result = underTest.solution(a, 0);
        assertThat(result, is(a));
    }

    @Test
    public void test_empty_with_1() {
        int[] a = new int[]{};
        int[] result = underTest.solution(a, 1);
        assertThat(result, is(a));
    }

    @Test
    public void test_1_long_with_0() {
        int[] a = new int[]{1};
        int[] result = underTest.solution(a, 0);
        assertThat(result, is(a));
    }

    @Test
    public void test_1_long_with_1() {
        int[] a = new int[]{1};
        int[] result = underTest.solution(a, 1);
        assertThat(result, is(a));
    }

    @Test
    public void test_same_values() {
        int[] a = new int[]{1, 1};
        int[] result = underTest.solution(a, 1);
        assertThat(result, is(a));
    }

    @Test
    public void test_different_values() {
        int[] a = new int[]{1, 2};
        int[] result = underTest.solution(a, 1);
        assertThat(result, is(new int[]{2, 1}));
    }

    @Test
    public void test_different_values_with_big_K() {
        int[] a = new int[]{1, 2, 3};
        int[] result = underTest.solution(a, 100);
        assertThat(result, is(new int[]{3, 1, 2}));
    }
}