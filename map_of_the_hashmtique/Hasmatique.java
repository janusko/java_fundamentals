import java.util.HashMap;

public class Hasmatique {

    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("The River", "Once you're in the zone. The river flows down like a full stone. Water is your bed. The ripples cushion your head");
        trackList.put("Beginner's Luck", "Beginner's luck. Is on your side. You've got dollar. Signs inside. Your eyes");
        trackList.put("Superbug", "Superbug coming up. Feels like he'll never stop. Shoulda used phages");
        trackList.put("KGLW", "When the claws come out, cage me too. I'm an animal too, woo!");

        String value = trackList.get("The River");

        for(String track : trackList.keySet()) {
            System.out.println(String.format("Tracks: " + track + ": Lyrics: " + trackList.get(track)));
        }
    }
}