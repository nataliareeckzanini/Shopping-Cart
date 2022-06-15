// Student: Natalia Reeck Zanini

import java.text.NumberFormat;
public class Item {

   private String name;
   private double price;
   private int bulkQuantity;
   private double bulkPrice;

   public Item(String name, double price, int bulkQuantity, double bulkPrice) {
       this.name = name;
       this.price = price;
       this.bulkQuantity = bulkQuantity;
       this.bulkPrice = bulkPrice;

   }

   public Item(String name, double price) {
       if (price < 0) {
           throw new IllegalArgumentException();
       }

       this.name = name;
       this.price = price;

   }


   public double priceFor(int quantity) {
       double actual = 0;
       if (quantity < 0) {
           throw new IllegalArgumentException();
       } else {
           if (bulkQuantity!=0) {
               actual = (quantity / bulkQuantity) * bulkPrice
                       + (quantity % bulkQuantity) * price;
           } else {
               actual = quantity * price;
           }
       }

       return actual;

   }

   public boolean equals(Item ietm) {
       if(this.name.equals(ietm.name)){
           return true;
       }
       return false;
   }

   @Override
public String toString() {
       NumberFormat format = NumberFormat.getCurrencyInstance();

       format.setMinimumFractionDigits(2);
       format.setMaximumFractionDigits(2);
       String str = "";
       str = name + ", " + format.format(price);
       if (bulkPrice != 0) {
           str += " ( " + bulkQuantity + " for " + format.format(bulkPrice)
                   + " )";
       }
       return str;
   }
}

