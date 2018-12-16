package edu.insightr.gildedrose.model;

public class Dexterity_Vest extends Item {

    public Dexterity_Vest(String name, int sellIn, int quality) {
        super(name,sellIn,quality);
    }
  
    public Dexterity_Vest(String name)
    {
        super();
        this.name = name;
        this.quality=12;
        this.sellIn=17;
    }
  
  public Dexterity_Vest()
    {
        this.name = "+5 Dexterity Vest";
        this.quality=25;
        this.sellIn=0;

    }
  

    

    public void updateQuality(){
        super.updateQuality();
        if(this.quality > 0){

            if (this.sellIn == 0 ){
                this.quality = this.quality - 2;
            }
        }
       
    }

}
