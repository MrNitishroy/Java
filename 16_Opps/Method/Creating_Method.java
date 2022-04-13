class Creating_Method{
    
    public void eat()
    {
        System.out.println("I am Eating");
    }
    public static void main(String[] args) {
        Creating_Method Dog=new Creating_Method();
        Dog.eat();
        Dog.run();
        Birds Pr=new Birds();
        Pr.fly();
    }

    public void run()
    {
        System.out.println("I am Runninf");
    }
}

class Birds{
    public void fly()
    {
        System.out.println("I am flying");
    }
}