package OOPS.Principles.Polymorphism;

public class Theory {
    /*
    poly->many
    morphism->ways to represent
     */
    //polymorphism:act of representing the same thing in multiple ways
    /*
    types of polymorphism:
    1)compile time polymorphism/static polymorphism
    ->it can be achieved via method overloading e.g:multiple constructors
    2)run time polymorphism/dynamic polymorphism
    ->achieved by method overriding
    Parent obj=new Child();
    here,which method will be called depends on type of child
    this is known as upcasting
    How java determines this?
    dynamic method dispatch
     */
    //we can use final keyword to prevent overriding because you cannot override the methods which are final
    //->we can do early binding by putting final keyword otherwise late binding will happen
    //it can also be used to prevent inheritance
    //->when we declare class to final it declares it methods final too
    //static methods can't be overridden because it doesn't depend on objects
}
