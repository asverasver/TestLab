package tests;

import org.junit.jupiter.api.Test;
import utilities.GFG;

import static org.junit.Assert.assertArrayEquals;

public class GFGTest {

    @Test
    public void testCase1() {
        char[] test_array = "".toCharArray();
        char[] expected_array = "".toCharArray();
        GFG.reverse(test_array);
        assertArrayEquals(expected_array, test_array);
    }

    @Test
    public void testCase2() {
        char[] test_array = "!a".toCharArray();
        char[] expected_array = "!a".toCharArray();
        GFG.reverse(test_array);
        assertArrayEquals(expected_array, test_array);
    }

    @Test
    public void testCase3() {
        char[] test_array = "c;".toCharArray();
        char[] expected_array = "c;".toCharArray();
        GFG.reverse(test_array);
        assertArrayEquals(expected_array, test_array);
    }

    @Test
    public void testCase4() {
        char[] test_array = "tm".toCharArray();
        char[] expected_array = "mt".toCharArray();
        GFG.reverse(test_array);
        assertArrayEquals(expected_array, test_array);
    }
}