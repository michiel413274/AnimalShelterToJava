package AnimalShelter;

import java.util.ArrayList;
import java.util.List;

public class Webshop {
    public static List<ISellable> Products = new ArrayList<>();

    public List<ISellable> GetProducts()
    {
        return Products;
    }
    public int CountTheDogs()
    {
        int CountDogs = 0;
        for(ISellable product : Products)
        {
            if(product instanceof Dog)
            {
                CountDogs++;
            }
        }
        return CountDogs;
    }

    public void AddProduct(ISellable product)
    {
        product.SetPrice();
        Products.add(product);
    }

    public void BuyAnItem(String Name)
    {
        ISellable product = null;
        for(ISellable item : Products)
        {
            if(item.GetName().equals(Name))
            {
                product = item;
                break;
            }
        }
        Products.remove(product);
    }


}
