package re;


    class Drumkit {
        boolean tophat = true;
        boolean snare = true;

        void playtophat() {
            System.out.println("ding ding da-ding");
        }

        void playsnare() {
            System.out.println("bang bang ba-bang");
        }
    }

    public class DrumKitTestDrive {
    public static void main(String[] args) {
        Drumkit d = new Drumkit();
        d.snare = false;
        if (d.snare == true){
            d.playsnare();
        }
        d.playsnare();
        d.playtophat();
    }
}
