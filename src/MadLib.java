public class MadLib {

    public static void main(String[] args) {
        System.out.println("Hi leif");
        MadLib myStory = new MadLib();
        randomDiscount();
        specialOfTheDay("Chocolate");
        countScoops();
    }
    public MadLib(){
        System.out.println("Hi kat");
        String classmate = "Kat";
        String city = "Boston";
        String noun = "Table";
        String adjective = "Lustrous";
        String pluralNoun = "Pillars";
        String pluralAnimal = "Monkeys";
        boolean trueOrFalse = true;
        double decimalBiggerThan1 = 1.15;
        int number1 = 9;
        int number2 = 11;
        int wholeNumberBetween1And4 = 3;
        String miltonTeacher = "Mr. K";
        String miltonDean = "Mr. Ruiz";
        char letterGrade = 'A';
        String season = "Summer";
        //define a string called story for mad lib
        String story = "This weekend I am going camping with "
                +classmate+ ". We are going to a campsite in "
                +city+ ". I packed my "+noun+ " and "
                +pluralNoun + ".  The forecast is calling for a high of "
                +decimalBiggerThan1+ " degrees fahrenheit. So it should be a "
                +adjective+" day! This year, the park rangers have seen "
                +number1+ " " +pluralAnimal + " which seems kind of dangerous. "
                +miltonTeacher+" said it's " + trueOrFalse + " that "+pluralAnimal+ " eat class "
                +wholeNumberBetween1And4+ " students in the " +season+ ". But, "
                +miltonDean+ " said it actually has only happened "
                + number2+" times. Wish us luck! If we survive, we will earn a "
                +letterGrade+ "- in P.E. class.";

//now print story to the dos window
        System.out.println(story);
    }
    public static void randomDiscount(){
        int randomInt;
        randomInt = (int) (Math.random()*31);
        System.out.println("u get " + randomInt + " off your purchase");
    }
    public static void specialOfTheDay(String flavor){
        System.out.println("Today's special is " + flavor);
    }

    public static void countScoops() {
        for (int x = 1; x<6; x=x+1){
            System.out.println(x);
        }
        for (int y = 2; y<12; y=y+3){
            System.out.println(y);
        }
    }

}
