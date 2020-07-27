
import java.util.Random;
public class PlayTwentyOne {

	public static void main(String[] args) {
		Random myRandom=new Random();
		int card,total=0;
		System.out.println("Card\tTotal");
		while(total<21) 
		{
			card=myRandom.nextInt(10)+1;
			total+=card;
			System.out.print(card);
			System.out.print("\t");
			System.out.println(total);
		}
		if(total==20) {
			System.out.println("You win:-)");
		}else 
		{
			System.out.println("You loss:-(");
		}
	}

}
