import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchTest {

    private final Search search = new Search();



    @Test
    void binarySearchTest() {
        int[] case1 = {1, 2, 3, 4};
        int[] case2 = {1, 2, 2, 3};
        int[] case3 = {1, 1, 1, 1};
        assertEquals(1, search.binarySearch(case1, 2));
        assertEquals(1, search.binarySearch(case2, 2));
        assertEquals(1, search.binarySearch(case3, 1));
    }

    @Test
    void binarySearchNullTest() {
        int[] case1 = null;
        int[] case2 = {};
        int[] case3 = {1, 2, 3, 4};
        assertEquals(-1, search.binarySearch(case1, 1));
        assertEquals(-1, search.binarySearch(case2, 1));
        assertEquals(-1, search.binarySearch(case3, 10));
    }
}