package mja.designpattern.creational.Prototype;

import java.util.ArrayList;
import java.util.List;

public class MyStores {
    private List<Store> stores;

    public MyStores() {
        stores = new ArrayList<>();
    }

    public void addNewStore(Store store) {
        stores.add(store);
    }

    public void printStoresInformation() {
        stores.forEach(store -> {
            System.out.println(store.getName() + "\n" + store.getCategory() + "\n" + store.getAddress() + "\n" + store.getCountry());
            System.out.println("\n");
        });
    }
}
