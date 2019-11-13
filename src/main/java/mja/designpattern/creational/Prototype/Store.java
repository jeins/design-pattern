package mja.designpattern.creational.Prototype;

import lombok.Data;

@Data
public class Store implements StorePrototype<Store> {
    private String name;
    private String category;
    private String address;
    private String country;

    public Store() {}

    public Store(Store store) {
        if (store != null) {
            name = store.name;
            category = store.category;
            address = store.address;
            country = store.country;
        }
    }

    @Override
    public Store clone() {
        return new Store(this);
    }
}
