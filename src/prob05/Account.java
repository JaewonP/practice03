package prob05;

public class Account {
	    private String accountNo;
	    private int balance;
	    
	    
		public Account(String accountNo) {
		// TODO Auto-generated constructor stub
			this.accountNo = accountNo;
			System.out.println(accountNo + "계좌가 개설되었습니다.");
	}
		//AccountTest class는 건들지 말고 여기만 만들것 
		//AccountTest class의 구문 생성자 만들고 getter/setter
		
		public int getBalance() {
			return balance;
		}
		public void setBalance(int balance) {
			this.balance = balance;
		}
		public void setAccountNo(String accountNo) {
			this.accountNo = accountNo;
		}
		

		public String getAccountNo() {
			// TODO Auto-generated method stub
			return accountNo;
		}
		
		
		public void save(int i) {
			// TODO Auto-generated method stub
		    balance += i;
			System.out.println(accountNo + "계좌에 " + i +"만원이 입금되었습니다.");
			
		}
		public void deposit(int i) {
			// TODO Auto-generated method stub
			balance -= i;
			System.out.println(accountNo +"계좌에 " + i +"만원이 출금되었습니다.");
		}


}
