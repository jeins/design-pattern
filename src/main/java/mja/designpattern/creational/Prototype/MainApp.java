package mja.designpattern.creational.Prototype;

/**
 * Prototype
 * Specify the kinds of objects to create using a prototypical instance,
 * and create new objects by copying this prototype.
 */
public class MainApp {
    public static void main(String[] args) {
        MyStores myStores = new MyStores();

        Store firstClothesStore = new Store();
        firstClothesStore.setName("Toko BajuKu");
        firstClothesStore.setCategory("Toko Baju Anak & Dewasa");
        firstClothesStore.setAddress("Jl. Pramuka Raya II, 107412 Jakarta Utara");
        firstClothesStore.setCountry("Indonesia");
        myStores.addNewStore(firstClothesStore);

        Store secondClothesStore = firstClothesStore.clone();
        secondClothesStore.setAddress("Jl. Kali Malang 16, 102312 Jakarta Timur");
        myStores.addNewStore(secondClothesStore);

        Store thirdClothesStore = firstClothesStore.clone();
        thirdClothesStore.setCategory("Toko Baju Bayi");
        thirdClothesStore.setAddress("Jl. Ir. H. Juanda No.13, Paledang, Kota Bogor");
        myStores.addNewStore(thirdClothesStore);

        myStores.printStoresInformation();
    }
}
