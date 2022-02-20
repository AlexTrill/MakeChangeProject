package makechange;

import java.util.Scanner;

public class CashRegister4 {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		double amount, price, remainder, value, change;
		int twenties, tens, fives, ones, quarters, dimes, nickles, pennies;
//		User Story #1
//		The user is prompted asking for the price of the item.

		System.out.println("What is the price of your item? ");
		price = kb.nextDouble();

//
//		User Story #2
//		The user is then prompted asking how much money was tendered by the customer.
//
		System.out.println("How much money was tendered? ");
		amount = kb.nextDouble();
		remainder = amount - price;

//		User Story #3
//		Display an appropriate message if the customer provided too little money or the exact amount.

		if (amount == price) {
			System.out.println("You have given me the exact amount of the item, no change is required, thank you! ");
		}

		else if (amount < price) {
			System.out.println("You have not given me enough, please provid the exact amount or more of the item. ");
//		User Story #4
//		If the amount tendered is more than the cost of the item, display the number of bills and coins that should be given to the customer.
		}

		while (remainder > 0) {
			
			
			 if (remainder >= 20) {

				twenties = (int) (remainder / 20);
				System.out.print(twenties + " twenty dollar bill, ");
				value = twenties * 20;
				remainder = remainder - value;
				continue;
				
			}

			else if (remainder >= 10) {

				tens = (int) (remainder / 10);
				System.out.print(tens + " ten dollar bill, ");
				value = tens * 10;
				remainder = remainder - value;
				continue;
			}
			else if (remainder >= 5) {
				
				fives = (int) (remainder / 5);
				System.out.print(fives + " five dollar bill, ");
				value = fives * 5;
				remainder = remainder - value;
				continue;
		}
			else if (remainder >= 1) {
				
				ones = (int) (remainder / 1);
				System.out.print(ones + " one dollar bill, ");
				value = ones * 1;
				remainder = remainder - value;
				continue;

	}
			else if (remainder >= .25) {
				
				quarters = (int) (remainder / .25);
				System.out.print(quarters + " quarter, ");
				value = quarters * .25;
				remainder = remainder - value;
				continue;
			}
				else if (remainder >= .10) {
					
					dimes = (int) (remainder / .10);
					System.out.print(dimes + " dime, ");
					value = dimes * .10;
					remainder = remainder - value;
					continue;
}
				else if (remainder >= .05) {
					
					nickles = (int) (remainder / .05);
					System.out.print(nickles + " nickle, ");
					value = nickles * .05;
					remainder = remainder - value;
					continue;
				}
				else if (remainder >= .01) {
					
					pennies = (int) (remainder / .01);
					System.out.print(pennies + " pennie, ");
					value = pennies * .01;
					remainder = remainder - value;
					break;
					
}
}
	}
}
	

