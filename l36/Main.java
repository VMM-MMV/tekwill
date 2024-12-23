import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("lion",5, Arrays.asList("meat","more meat"));

        List<String> favoriteFoods = new ArrayList<>();

        for(int i=0;i<lion.getFavoriteFoodsCount(); i++){
            favoriteFoods.add(lion.getFavoriteFood(i));
        }

    }
}
