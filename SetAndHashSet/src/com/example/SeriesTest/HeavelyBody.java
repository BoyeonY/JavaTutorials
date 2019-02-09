package com.example.SeriesTest;

import java.util.HashSet;
import java.util.Set;

public class HeavelyBody {
    private final String name;
    private final double orbintralPeriod;
    private final Set<HeavelyBody> satellties;
    private final int bodyType;

    public static final int STAR =1;
    public static final int PLANET =2;
    public static final int DWRF_PLANET =3;
    public static final int COMET =5;
    public static final int ASTEROIR = 6;

    public enum BodyTypes{
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID
    }

    public HeavelyBody(String name, double orbintralPeriod, BodyTypes bodyTypes) {
        this.name = name;
        this.orbintralPeriod = orbintralPeriod;
        this.satellties = new HashSet<>();
        this.bodyType = bodyType;

    }

    public BodyTypes getBodyType(){
        return bodyType;
    }



    public String getName() {
        return name;
    }

    public double getOrbintralPeriod() {
        return orbintralPeriod;
    }

    public boolean addMoon(HeavelyBody moon){
        return this.satellties.add(moon);
        }

    public Set<HeavelyBody> getstatellites(){
        return new HashSet<>(this.satellties);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        System.out.println("obj.getClass() is" +obj.getClass());
        System.out.println("this.getClass() is" + this.getClass());
        if(obj ==null ||(obj.getClass() != this.getClass())){
            return false;
        }
        String objName = ((HeavelyBody) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        System.out.println("HashCode called");
        return this.name.hashCode()+ 57;
    }


}
