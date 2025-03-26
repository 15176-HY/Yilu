package yichang;

import java.util.Scanner;

public class tiqushiyan {
	private int Money;
	private int Outmoney;
	
	public tiqushiyan(int Money,int Outmoney) {
		this.Money = Money;
		this.Outmoney = Outmoney;
	}
	
	
	public void qukuan()throws  InsufficientBalanceException{
		if (Money >= Outmoney) {
			System.out.println("提取成功");
		}else {
			throw new InsufficientBalanceException("你的余额为"+ Money +", 不足以提取"+ Outmoney +"元");
		}
	}

	public static void main(String[] args) {
		System.out.println("输入余额");
		Scanner s =new Scanner(System.in);
		int  money = s.nextInt();
		System.out.println("输入要提取的金额");
		Scanner t =new Scanner(System.in);
		int outmoney = t.nextInt();
		try {
			tiqushiyan tiqushiyan1 = new tiqushiyan(money,outmoney);
			tiqushiyan1.qukuan();
		}catch(InsufficientBalanceException e) {
				System.out.println(e.getMessage());
		}
	}
}
		
	
