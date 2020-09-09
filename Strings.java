import java.util.Scanner;
public class Strings{
	public static void main(String[] args){
		String bue ="buenas";
		String tar="tardes";
		System.out.println(bue.concat(" "+tar));
		String tweet="lee esto";
		System.out.println(tweet.length());
		System.out.println(tweet.equals("lee esto"));
		System.out.println(tweet.indexOf("esto"));
		System.out.println(tweet.indexOf("e"));
		System.out.println(tweet.charAt(4));
		System.out.println(tweet.substring(0, 3));
		Scanner entrada=new Scanner(System.in);
		String x=entrada.next();
		String x2=x.toUpperCase();
		System.out.println(x2 +" " + "a ti");
	}
}
