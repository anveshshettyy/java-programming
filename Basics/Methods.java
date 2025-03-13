package Basics;

class PlayGames {
    public void playCricket() {
        System.out.println("Playing Cricket");
    }

    public String playFootball() {
        return "Playing Football";
    }
}

public class Methods {
    public static void main(String args[]) {
        PlayGames obj = new PlayGames();
        obj.playCricket();
        String str = obj.playFootball();
        System.out.println(str);
    }
}
