package edu.insightr.gildedrose.model;

import edu.insightr.gildedrose.model.Item;

public class Sulfuras_Hand_of_Ragnaros extends Item {

    public Sulfuras_Hand_of_Ragnaros(String name, int sellIn, int quality, int year, int month, int day) {
        super(name,sellIn,quality, year, month, day);
    }
  
  public Sulfuras_Hand_of_Ragnaros(String name)
    {
        this.name = name;
        this.quality=12;
        this.sellIn=17;
    }
  
  public Sulfuras_Hand_of_Ragnaros()
    {
        this.name = "Sulfuras, Hand of Ragnaros";
        this.quality=80;
        this.sellIn=20;
    }
  

    @Override
    public void setSellIn(int sellIn) {

    }
    //This item has not to be sold

    public void updateQuality(){
        super.updateQuality();
        
    }
    //Its quality never change


}
