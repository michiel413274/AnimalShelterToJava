package AnimalShelter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static AnimalShelter.Webshop.Products;
import static org.junit.jupiter.api.Assertions.*;

class WebshopTest {
    private Webshop webshop = new Webshop();

    @Test
    void TestAddingDogs() {
        webshop.AddProduct(new Dog("f", Gender.Female));
        webshop.AddProduct(new Dog("f", Gender.Female));
        assertEquals(2, webshop.CountTheDogs());
    }

    @Test
    void TestBuyAnItem() {
        webshop.AddProduct(new Cat("d", Gender.Female, ""));
        webshop.AddProduct(new Cat("", Gender.Female, ""));

        webshop.BuyAnItem("d");
        boolean foundItem = false;
        for(ISellable product : Products)
        {
            if(product.GetName().equals("d"))
            {
                foundItem = true;
            }
        }
        assertEquals(false, foundItem);
    }
    @Test
    void TestBuyWrongItem() {
        webshop.AddProduct(new Cat("d", Gender.Female, ""));
        webshop.AddProduct(new Cat("c", Gender.Female, ""));

        webshop.BuyAnItem("d");
        boolean foundItem = false;
        for(ISellable product : Products)
        {
            if(product.GetName().equals("c"))
            {
                foundItem = true;
            }
        }
        assertEquals(true, foundItem);
    }
}