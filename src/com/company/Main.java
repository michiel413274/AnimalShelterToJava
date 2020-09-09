package com.company;
import AnimalShelter.*;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Reservation reservation = new Reservation();
    static Webshop webshop = new Webshop();
    static TestData data = new TestData();

    public static void main(String[] args)
    {
        MakeAChoice();
    }

    private static Gender StringToGenderEnum(String gender)
    {
        if(gender.equalsIgnoreCase("male"))
        {
            return Gender.Male;
        }
        if(gender.equalsIgnoreCase("female"))
        {
            return Gender.Female;
        }
        return null;
    }

    private static void AddAnAnimal()
    {
        boolean ExistentBadHabits = false;
        String BadHabits = "";

        println("Choose species");
        String species = sc.next();
        if(CheckForString(new String[]{"cat", "dog"}, species))
        {
            if (species.equalsIgnoreCase("cat"))
            {
                ExistentBadHabits = true;
            }
            println("Choose Name");
            String Name = sc.next();
            println("Choose Gender");
            String gender = sc.next();
            if(CheckForString(new String[]{"male", "female"}, gender))
            {
                if (ExistentBadHabits)
                {
                    println("Describe his bad habits");
                    BadHabits = sc.next();
                }
                if (species.equalsIgnoreCase("cat"))
                {
                    reservation.NewCat(Name, StringToGenderEnum(gender), BadHabits);
                }
                if (species.equalsIgnoreCase("dog"))
                {
                    reservation.NewDog(Name, StringToGenderEnum(gender));
                }
            }
            else{
                println("Try again");
            }
        }
        else{
            println("Try again");
        }

        MakeAChoice();
    }

    private static void CreateAReservation()
    {
        println("Animal list");
        for (Animal animal : reservation.GetAnimalList())
        {
            println(animal.toString());
        }
        System.out.println("Choose an animal by name");
        String Name = sc.next();
        for (Animal animal : reservation.GetAnimalList())
        {
            if(animal.GetName().equalsIgnoreCase(Name) && animal.GetReservedBy() == null)
            {
                println("What is your reservation name");
                String ReservationName = sc.next();
                animal.Reserve(ReservationName);
                animal.SetReservedBy(new Reservoir(ReservationName, LocalDateTime.now()));
            }
            else {
               println("Try Again");
            }
        }
        MakeAChoice();
    }

    private static void println(String line)
    {
        System.out.println(line);
    }

    private static boolean CheckForString(String[] elements, String ExistingString)
    {
        for (String element: elements)
        {
            if(element.equals(ExistingString))
            {
                return true;
            }
        }
        return false;
    }

    private static void MakeAChoice()
    {
        println("what do you want to do add an animal(type 1), make a reservation(type 2), buy a product(type 3) or nothing(press anything else)");
        int Choice = sc.nextInt();

        if(Choice == 1)
        {
            AddAnAnimal();
        }
        if(Choice == 2)
        {
            CreateAReservation();
        }
        if(Choice == 3)
        {
            BuyAnItem();
        }
        else
        {
            println("This program wil be stopped");
        }
    }

    private static void BuyAnItem()
    {
        println("Products that can be sold");
        for(ISellable product : webshop.GetProducts())
        {
            println(product.toString());
        }
        println("Type the name of the product");
        String Name = sc.next();
        webshop.BuyAnItem(Name);
        MakeAChoice();
    }
}
