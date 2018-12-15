
package edu.insightr.gildedrose.model;

import java.util.LinkedList;
import java.util.List;

public class Inventory {

    private Item[] items;

    private int[] tabProportion;

    public Item[] getItems() {
        return items;
    }

    public int[] getProportion()
    {
        return this.tabProportion;
    }

    public void setItems(Item[] items)
    {
        this.items = items;
    }

    public Inventory(Item[] items) {
        super();
        this.items = items;
    }

    public Inventory() {
        super();
        items = new Item[]{
                new Aged_Brie(),
                new Backstage_passes_to_a_TAFKAL80ETC_concert(),
                new Conjured_Mana_Cake(),
                new Dexterity_Vest(),
                new Elixir_of_the_Mongoose(),
                new Sulfuras_Hand_of_Ragnaros(),
                //new Aged_Brie("new Aged Brie", 14, 50)
        };
        this.tabProportion = new int[6];
    }

    public void printInventory() {
        System.out.println("***************");
        for (Item item : items) {
            System.out.println(item);
        }
        System.out.println("***************");
        System.out.println("\n");
    }

    public void updateQuality() {

        this.updateSellin();

        for(int i = 0; i < items.length; i++) {

            items[i].updateQuality();

        }
    }



    public void updateSellin()
    {
        for(int i = 0; i < items.length; i++)
        {
            if(items[i].getSellIn()>0) items[i].setSellIn(items[i].getSellIn() - 1);
        }
    }



    public void proportion(Item[] tab)
    {
        String[] type = { "Aged_Brie", "Backstage_passes_to_a_TAFKAL80ETC_concert",
                "Conjured_Mana_Cake", "Dexterity_Vest", "Elixir_of_the_Mongoose", "Sulfuras_Hand_of_Ragnaros"};

        for(int i = 0; i < tabProportion.length; i++)
        {
            this.tabProportion[i]=0;
        }
        for(int i = 0; i < this.tabProportion.length; i++)
        {
            for(int j = 0; j < tab.length; j++)
            {
                if(String.valueOf(tab[j].getClass()).split("\\.")[4].compareTo(type[i])==0)
                {
                    this.tabProportion[i]++;
                }
            }
        }
    }

    public LinkedList<Integer> presence()
    {
        LinkedList<Integer> count = new LinkedList<>();

        for(int i = 0; i < this.items.length; i++)
        {
            boolean pres = false;
            for(int j = 0; i < count.size(); i++)
            {
                if(this.items[i].sellIn == count.get(i))
                {
                    pres = true;
                    break;
                }
            }
            if(pres== false) {
                count.add(this.items[i].sellIn);
            }
        }
        return count;
    }

    public int[][] getSellInOfAllItem()
    {
        LinkedList<Integer> count = presence();
        int[][] mat = new int[count.size()][2];
        for(int i = 0; i<1; i++)
        {
            for(int j = 0; j < mat[i].length; j++)
            {
                mat[i][j] = count.get(i);
            }
        }

        for(int i = 0; i < this.items.length; i++)
        {
            for(int j = 0; j < mat[i].length; j++)
            {

            }
        }


        return mat;
    }


    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        for (int i = 0; i < 10; i++) {
            inventory.updateQuality();
            inventory.printInventory();
        }
    }
}

