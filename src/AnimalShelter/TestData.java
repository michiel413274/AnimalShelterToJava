package AnimalShelter;

public class TestData {
    Webshop webshop = new Webshop();

    public TestData() {
        Food food = new Food("Cat", 3.5);
        Food food1 = new Food("Cat", 3.5);
        Food food2 = new Food("Cat", 3.5);
        Food food3 = new Food("Cat", 3.5);
        Food food4 = new Food("Dog", 3.5);
        Animal animal = new Dog("Bob", Gender.Male);
        Animal animal1 = new Dog("Notbob", Gender.Female);
        Animal animal2 = new Cat("Stripes", Gender.Female, "Very stripey");
        Animal animal3 = new Cat("Circles", Gender.Female, "");
        Animal animal4 = new Cat("Circles", Gender.Male, "Bold");
        webshop.AddProduct(food);
        webshop.AddProduct(food1);
        webshop.AddProduct(food2);
        webshop.AddProduct(food3);
        webshop.AddProduct(food4);
        webshop.AddProduct(animal);
        webshop.AddProduct(animal1);
        webshop.AddProduct(animal2);
        webshop.AddProduct(animal3);
        webshop.AddProduct(animal4);
    }
}
