import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindDups {
    public ArrayList<Integer> findDups(ArrayList<Integer> a) {
        if (a == null) {
            return new ArrayList<>();
        }

        Map<Integer, Integer> elemsCount = new HashMap<>();
        for(Integer i : a){
            elemsCount.merge(i, 1, Integer::sum);
        }
        elemsCount.values().removeIf(v -> v == 1);
        return new ArrayList<>(elemsCount.keySet());
    }
}
