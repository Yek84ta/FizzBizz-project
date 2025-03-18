import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Rules {
    private final Map<Integer, String> gameStruct = new HashMap<>();
    String finalResult = "";

    public void Rules(){

    }

    public void setStruct(int num, String string) {
        gameStruct.put(num, string);
    }

    public Map<Integer, String> getGameStruct() {
        return gameStruct;
    }

    public void FinalResult(int start, int end) {
        while (start <= end) {
            finalResult = ""; // ریست کردن finalResult در هر تکرار
            Set<Integer> dividers = getGameStruct().keySet();
            for (int divider : dividers) {
                if (start % divider == 0) {
                    finalResult += getGameStruct().get(divider);
                }
            }
            if (finalResult.equals("")) {
                System.out.println(start);
            } else {
                System.out.println(finalResult);
            }
            start++;
        }
    }
}