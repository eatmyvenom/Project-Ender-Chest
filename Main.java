import java.util.*;
public class Main {
	static Encoder en=new Encoder();
	static int[][] stor=new int[2][0x400];
	public static void main(String[] args) {
		System.out.print("Input formt: W to withdraw, D to deposit. Then follow with the item name and amount.\n\nExample of format:D;redstone dust;26\n");//not system, just coded to make it function, also code commands
		for (int i=0;i<20;i++) {
			System.out.print("*");
		}
		System.out.print("\n");
		while (true) {
			/*
			 * each instance of the interfaces as well as normal system processes
			 */
		}
	}
	public static void withdraw(String item,int amount) {
		int code=en.getCode(item);
		//stor[code]-=amount;
		System.out.print("You have been given "+amount+" "+item);
	}
	public static void deposit(String item,int amount) {
		int code=Encoder.autoEncoder(item);
		//stor[code]+=amount;
	}
}

