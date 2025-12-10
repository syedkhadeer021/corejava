package net.konic.corejava.inheritance;
class Shop {
    void shopInfo() {
        System.out.println("This is a shop");
    }
}

class GroceryShop extends Shop {
    void groceryInfo() {
        System.out.println("This is a grocery shop");
    }
}

class OnlineGrocery extends GroceryShop {
    void onlineInfo() {
        System.out.println("This is an online grocery service");
    }
}

public class MultilevelShopDemo {
    public static void main(String[] args) {
        
        OnlineGrocery og = new OnlineGrocery();
        og.shopInfo();
        og.groceryInfo();
        og.onlineInfo();
    }
}
