import java.util.*

fun main(args:Array<String>){

    var num:Int;
    var scanner  =Scanner(System.`in`);
    var a:Int =1
    var input:String;

    println("Choose the correct number")
    println("Rules:");
    println("1)You have 3 chances in a single game to choose the correct number")
    println("2)The number is between 1 to 10");
    println("You can restart the game once you lose");

do {
    while (a <= 3) {
        println("Chance " + a);
        println("Guess a number from 1 to 10:");
        num = scanner.nextInt();
        var random = Random();
        if (num == random.nextInt(10)) {
            println("You win")
            break;
        } else {
            println("You lose")
        }
        a++;
    }
    println("Press 'y' to play again and any other key to terminate");
    input = scanner.next();
    a=1;
}while(input=="y");

}