package phone;

public class Phone{
    private final long id;
    private final String name;

    private final Boolean hasWifi;
    private final Boolean hasGPS;
    private final Boolean hasBluetooth;

    private final double price;

    private final String manufacturer;

    public Phone(long id, String name, Boolean hasWifi,Boolean hasGPS, Boolean hasBluetooth, double price, String manufacturer) {
        this.id = id;
        this.name = name;
        this.hasBluetooth = hasBluetooth;
        this.hasWifi = hasWifi;
        this.hasGPS = hasGPS;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    public long getId() {
        return id;
    }

    public double getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }
    public String getManufacturer(){
        return manufacturer;
    }

    public Boolean getHasWifi(){
        return hasWifi;
    }

    public Boolean getHasGPS(){ 
        return hasGPS;
    }

    public Boolean getHasBluetooth(){   
        return hasBluetooth;
    }

}