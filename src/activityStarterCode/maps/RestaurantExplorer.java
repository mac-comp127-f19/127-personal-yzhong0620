package activityStarterCode.maps;
import java.util.Map;
import java.util.HashMap;

public class RestaurantExplorer {
    public static void main(String [] args) {
        // Step 1. Create a new empty HashMap.
        // The keys should be the names of the restaurant.
        // The values should be the restaurant objects.

        Map<String,Restaurant> restMap = new HashMap<>();

        // Step 2. Add five restaurants to the map (hint: use put()).

        Restaurant Shish = new Restaurant("Shish","med",5);
        Restaurant Thai = new Restaurant("Thai","thai",1);
        Restaurant Chipotle = new Restaurant("Chipotle","mex",3);
        Restaurant jj = new Restaurant("Jimmy Johns","fast",4);
        Restaurant Wendy = new Restaurant("Wendy's","fast",4);

        restMap.put("Shish",Shish);
        restMap.put("Thai",Thai);
        restMap.put("Chipotle",Chipotle);
        restMap.put("Jimmy Johns",jj);
        restMap.put("Wendy's",Wendy);

        // Step 3. Print the names of each restaurant (hint: use keySet()).

        System.out.println(restMap.keySet());

        // Step 4. Remove one of the restaurants by name. Check to make sure
        // it no longer exists and print out the result (hint: use containsKey()).

        restMap.remove("Chipotle");
        System.out.println(restMap.containsKey("Chipotle"));

        // Step 5. Print the restaurant objects (hint: use values())

        System.out.println(restMap.values());

        // Step 6. Print the restaurant names and objects (hint: use entrySet()).

        System.out.println(restMap.entrySet());
    }
}
