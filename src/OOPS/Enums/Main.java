package OOPS.Enums;

public class Main {
    enum Week{
        //these are enum constant
        //public,static and final
        //since it is final you can't create child enums
        //enum can implement interfaces
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;

        Week() {
            System.out.println("Constructor called for "+this);
        }
        //this is not public or protected,only private or default
        //why?we don't want to create new objects
        //this is not the enum concept,that's why
        //internally :public static final Week Monday=new Week()
    }

    public static void main(String[] args) {
        Week week;
        week=Week.Friday;
        for (Week day:Week.values()){
            System.out.println(day);
        }
    }
}
