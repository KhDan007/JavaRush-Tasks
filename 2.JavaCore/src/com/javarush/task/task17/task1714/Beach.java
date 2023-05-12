package com.javarush.task.task17.task1714;

/* 
Comparable
*/

public class Beach implements Comparable<Beach> {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    @Override
    synchronized public int compareTo(Beach o) {
        int thisCount = 0;
        int otherBeachCount = 0;

        if (this.distance < o.distance) thisCount++;
        else if (this.distance > o.distance) otherBeachCount++;
        if (this.quality > o.quality) thisCount++;
        else if (this.quality < o.quality) otherBeachCount++;

        return Integer.compare(thisCount, otherBeachCount);
    }

    synchronized public String getName() {
        return name;
    }

    synchronized public void setName(String name) {
        this.name = name;
    }

    synchronized public float getDistance() {
        return distance;
    }

    synchronized public void setDistance(float distance) {
        this.distance = distance;
    }

    synchronized public int getQuality() {
        return quality;
    }

    synchronized public void setQuality(int quality) {
        this.quality = quality;
    }

    public static void main(String[] args) {
        Beach beach1 = new Beach("Bro1", 15.5f, 10);
        Beach beach2 = new Beach("Bro5", 10.8f, 20);
        System.out.println(beach1.compareTo(beach2));
    }
}
