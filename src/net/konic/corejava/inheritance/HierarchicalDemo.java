package net.konic.corejava.inheritance;

class Mobile {
 void commonFeature() {
     System.out.println("Common mobile feature");
 }
}


class Samsung extends Mobile {
 void samsungFeature() {
     System.out.println("Samsung special feature");
 }
}

class iPhone extends Mobile {
 void iPhoneFeature() {
     System.out.println("iPhone special feature");
 }
}


public class HierarchicalDemo {
 public static void main(String[] args) {

     Samsung s = new Samsung();
     s.commonFeature();
     s.samsungFeature();

     iPhone i = new iPhone();
     i.commonFeature();
     i.iPhoneFeature();
 }
}





