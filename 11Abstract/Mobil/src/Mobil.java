public abstract class Mobil {
protected String merk;

public Mobil(String merk) {
    this.merk = merk;
}

public abstract void nyalakanMesin();
public abstract void berkendara();
public abstract void berhenti();
public abstract void tampilkanInfo();
}