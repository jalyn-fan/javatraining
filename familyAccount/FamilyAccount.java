package familyAccount;

public class FamilyAccount {

	public static void main(String[] args) {

		String details = "收支 \t\t账户金额 \t\t收支金额 \t\t说  明"+"\n";
		int balance=10000;
		boolean isFlag = true;
		while (isFlag) {
			System.out.println("-----------------家庭收支记账软件-----------------");
			System.out.println("     1 收支明细   ");
			System.out.println("     2 登记收入   ");
			System.out.println("     3 登记支出   ");
			System.out.println("     4 退    出  ");
			System.out.println("     请选择(1-4)：");

			char selection = Unitity.readMenuSelection();
			switch (selection) {
			case '1':
				//System.out.println("     1 收支明细   ");
				System.out.println(details);
				break;
			case '2':
				//System.out.println("     2 登记收入   ");
				System.out.println("输入金额");
				int money=Unitity.readNumber();
				System.out.println("本次收入说明");
				String info=Unitity.readString();
				//balance
				balance+=money;
				//details
				details+="收入 \t"+"\t"+balance+"\t"+"\t"+money+"\t"+"\t"+info+"\n";
				System.out.println("登记完成");
				break;
			case '3':
				//System.out.println("     3 登记支出   ");
				System.out.println("输入金额");
				money=Unitity.readNumber();
				System.out.println("本次支出说明");
				info=Unitity.readString();
				if(balance<money) {
					System.out.println("支出超额");
				
				}
				//balance
				balance-=money;
				//details
				details+="支出 \t"+"\t"+balance+"\t"+"\t"+money+"\t"+"\t"+info+"\n";
				System.out.println("登记完成");
				break;
			case '4':
				System.out.println("Y/Nを入力してください");
				char confirm = Unitity.readSelectConfirm();
				if (confirm == 'Y') {
					isFlag = false;
				}
				break;
			default:
				break;
			}

		}
	}

}
