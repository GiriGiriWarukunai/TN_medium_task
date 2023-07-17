import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindDupsTest {

    private final FindDups findDups = new FindDups();

    @Test
    void findDupsTest() {
        ArrayList<Integer> case1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> case2 = new ArrayList<>(Arrays.asList(1, 1, 1, 1));
        ArrayList<Integer> case3 = new ArrayList<>(Arrays.asList(1, 2, 1, 1, 2));
        ArrayList<Integer> case4 = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 3, 1, 4));

        assertEquals(Arrays.asList(), findDups.findDups(case1));
        assertEquals(Arrays.asList(1), findDups.findDups(case2));
        assertEquals(Arrays.asList(1, 2), findDups.findDups(case3));
        assertEquals(Arrays.asList(1, 2, 3), findDups.findDups(case4));
    }

}