package Exp;

public class ExpFactory extends Moxie {

    public enum Exptype {
            MOXIE,
            ROXY
        }
    public static Moxie createExp(Exptype TypeE) {
        switch (TypeE) {
            case MOXIE:
                return new Moxie();

            case ROXY:
                return new Roxy();

        }


        return null;
    }


}
