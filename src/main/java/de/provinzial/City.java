package de.provinzial;

public class City {

    private String name;

    private int population;

    private double longitude;

    private double latitude;

    public City() {
    }

    public City(String name, int population, double longitude, double latitude) {
        this.name = name;
        this.population = population;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                '}';
    }
}
