package edu.insightr.gildedrose.model;

import java.time.LocalDate;

public abstract class Item {

    protected int id;
    protected String name;
    protected int sellIn;

    protected int quality;

    protected LocalDate date;

    public Item() {
        super();
        this.id = 0;
        this.name = "Object";
        this.sellIn = 25;
        this.quality = 17;
        this.date = LocalDate.of(2018, 10, 1);
    }

    public Item(int id) {
        super();
        this.id = id;
        this.name = "Object";
        this.sellIn = 25;
        this.quality = 17;
        this.date = LocalDate.of(2018, 10, 1);
    }

    public Item(int id, String name, int sellIn, int quality) {
        super();
        this.id = id;
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
        this.date = LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public LocalDate getDate()
    {
        return this.date;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", sellIn=" + sellIn +
                ", quality=" + quality +
                '}';
    }
    public void updateQuality()
    {

    }

}