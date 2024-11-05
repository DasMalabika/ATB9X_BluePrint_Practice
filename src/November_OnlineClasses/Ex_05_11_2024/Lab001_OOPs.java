package November_OnlineClasses.Ex_05_11_2024;

public class Lab001_OOPs {
    public static void main(String[] args) {
        //Object1
        Lab002_Dog D1 = new Lab002_Dog();
        D1.name = "Oreo";
        System.out.println("Dog Name - "+D1.name);
        D1.age = 1;
        System.out.println("Dog Age - "+D1.age);
        D1.bread = "German Shepherd";
        System.out.println("Dog Bread - "+D1.bread);
        D1.friendly();
        D1.eat("Nonveg");

        //Object2
        Lab002_Dog D2 = new Lab002_Dog();
        D2.name = "MoMo";
        System.out.println("Dog Name - "+D2.name);
        D2.age = 1;
        System.out.println("Dog Age - "+D2.age);
        D2.bread = "Golden Retriever";
        System.out.println("Dog Bread - "+D2.bread);
        D2.friendly();
        D2.eat("Only Dog Food");

        //Object3
        Lab002_Dog D3 = new Lab002_Dog();
        D3.name = "Bubble";
        System.out.println("Dog Name - "+D3.name);
        D3.age = 2;
        System.out.println("Dog Age - "+D3.age);
        D3.bread = "Golden Retriever";
        System.out.println("Dog Bread - "+D3.bread);
        D3.friendly();
        D3.eat("Only Veg");

        //Object4
        Lab002_Dog D4 = new Lab002_Dog();
        D4.name = "Jenny";
        System.out.println("Dog Name - "+D4.name);
        D4.age = 4;
        System.out.println("Dog Age - "+D4.age);
        D4.bread = "Labrador Retriever";
        System.out.println("Dog Bread - "+D4.bread);
        D4.friendly();
        D4.eat("Any Food");

        //Object5
        Lab002_Dog D5 = new Lab002_Dog();
        D5.name = "Junior";
        System.out.println("Dog Name - "+D5.name);
        D5.age = 3;
        System.out.println("Dog Age - "+D5.age);
        D5.bread = "Beagle";
        System.out.println("Dog Bread - "+D5.bread);
        D5.friendly();
        D5.eat("Only Dog Food");


    }
}
