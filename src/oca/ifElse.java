package oca;

public class ifElse {
    public static void main(String[] args) {
        String today = "monday";
        int time = 14;
        if (today == "monday")
            System.out.println("go to work");
        if (time > 17)
            System.out.println("watch tv");

        else
            System.out.println("keep working");
//        else if(today=="tuesday"){
//            System.out.println("go to taco bell");
//        }
//        else if(today=="wednesday"){
//            System.out.println("go to school");
//        }
        //else
        {
            System.out.println("go to beach");

        }

    }
}
