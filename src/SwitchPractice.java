import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public abstract class SwitchPractice {
	public abstract int data();
public static void main(String[] args) {
	
	String month = 8+"";
	String day = null;
	
	switch(month ){
	case ""+1: day = "janauary";
	System.out.println("first");
	System.err.println("second ");
	System.out.println("third");
	break;
	case 2+"": day = "decenber";
	System.out.println("first");
	System.err.println("second ");
	System.out.println("third");
	break;
	case 3+"": day = "removable";
	System.out.println("first");
	System.err.println("second ");
	System.out.println("third");
	break;
	case 8+"": day = "ghanta";
	System.out.println("first");
	System.err.println("second ");
	System.out.println("third");
	}
	System.out.println(day);
	
	
	Set cc = new TreeSet<>();
	cc.add("alla11");
	cc.add("alla44");
	cc.add("alla22");
	cc.add("alla66");
	cc.add("alla33");
	
	cc.add("alla55");
	
	
	System.out.println(cc);
	
	
}
}
