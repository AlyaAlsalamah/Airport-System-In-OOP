
class aircraft {

    private String airCraft;

    public aircraft() {
        this.airCraft = airCraft;
    }

    public String getAirCraft() {
        return airCraft;
    }

    public void setAirCraft(String airCraft) {
        this.airCraft = airCraft;
    }

}

public class Airport {

    private int max_air;
    private String name_air;
    private aircraft[] list;
    private int counterAir;

    private int ID;
    private double altitude;

    public Airport(int max_air, String name_air, int num) {
        this.max_air = max_air;
        this.name_air = name_air;
        list = new aircraft[num];
        counterAir++;
    }

    public Airport() {

    }

    public boolean LandingPermission(aircraft airCraft) {
        if (counterAir < list.length) {
            list[counterAir++] = airCraft;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Airport{" + "max_aircraft=" + max_air + ", name_aircraft=" + name_air + ", list Of Aircrafts=" + list
                + ", ID=" + ID + ", altitude=" + altitude + '}';
    }
}

class Helicopter extends Airport {

    private int N_fans;

    public Helicopter(int N_fans, int max_air, String name_air, int num) {
        super(0, "", 0);
        this.N_fans = N_fans;
    }

    @Override
    public String toString() {
        return super.toString() + "Helicopter{" + "N_fans=" + N_fans + '}';
    }
}

class Airplane extends Airport {

    private int N_engines;

    public Airplane(int N_engines, int max_air, String name_air, int num) {
        super(0, "", 0);
        this.N_engines = N_engines;

    }

    @Override
    public String toString() {
        return super.toString() + "Airplane{" + "N_engines=" + N_engines + '}';
    }

}

class demo {

    public static void main(String[] args) {

        Airport[] o = new Airport[3];
        o[0] = new Airport(2, "Heathrow", 2);
        o[1] = new Helicopter(1, 2, "gg", 2);
        o[2] = new Airplane(3, 4, "ff", 5);

        for (int i = 0; i < o.length; i++) {
            System.out.println(o[i]);

            if (o[i] instanceof Helicopter) {
                Helicopter w = (Helicopter) o[i];
                w.LandingPermission(airCraft);
            }
            if (o[i] instanceof Airplane) {
                Airplane w = (Airplane) o[i];
                w.LandingPermission(airCraft);
            }

        }

    }
}
