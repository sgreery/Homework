public class Conditionals {
    public static void main(String[] args) {
        String question = "Is Jayson Tatum a top 3 player";
        System.out.println(question);
        Conditionals MagicEightBall = new Conditionals();
    }
    public Conditionals(){
        int randomInt = (int) (Math.random()*10)+1;
        if(randomInt==1){
            System.out.println("Without a doubt");
        }
        else if (randomInt==2) {
            System.out.println("Better not tell you now");
        }
        else if (randomInt==3) {
            System.out.println("Very doubtful");
        }
        else if (randomInt==4) {
            System.out.println("As I see it, yes");
        }
        else if (randomInt==5) {
            System.out.println("Better tell you now");
        }
        else if (randomInt==6) {
            System.out.println("Will not tell you now");
        }
        else if (randomInt==7) {
            System.out.println("Maybe, maybe not");
        }
        else if (randomInt==8) {
            System.out.println("I don't know");
        }
        else if (randomInt==9) {
            System.out.println("You tell me");
        }
        else if (randomInt==10) {
            System.out.println("nuh uh");
        }
    }
}
