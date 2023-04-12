package sample11_bank;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankingService {
	
	private BankingRepository repo = new BankingRepository();
	
	// 신규계좌 개설하기 기능
	/* 
	 * 사용자가 입력한 신규 계좌정보를 전달받아서 영속화계층을 저장시키고, 개설된 계좌정보를 반환한다.
	 * 	반환타입 : Account
	 * 	메소드명 : creatAccount
	 * 	매개변수 : Account account
	 */
	public Account creatAccount(Account account) {
		
		// 표현계층에서 전달받은 계좌정보에 더해서 계좌상태, 개설일시를 저장한다.
		// ->당연히 잇어야하는값. 굳이 입력받지 않아도 되기에 서비스계층에 쓴다.
		account.setStatus("사용중");
		account.setCreatedDate(new Date()); // 개설날짜는 오늘
		
		// 영속화 계층에 있는 insertAccount메소드에  표현계층에서 입력한 값+ 서비스계층에서 추가한 값이 모두 있는 객체의 계좌정보를 전달해서 저장시킨다.
		repo.insertAccount(account);
		
		return account; 
	}
	
	// 전계좌 조회하기
	/*
	 * 예금주명을 전달받아서 해당 예금주명을 개설된 모든 계좌정보를 조회해서 반환한다.
	 * 	반환타입 : List<Account>
	 * 	메소드명 : getMyAllAccounts
	 * 	매개변수 : String name
	 */
	public List<Account> getMyAllAccounts(String name){
		List<Account> accounts = repo.getAccountByName(name);
		return accounts;
	}
	
	// 계좌상세정보 조회하기
	/*
	 * 계좌번호와 비밀번호를 전달받아서 계좌상세정보를 반환한다.
	 * 	반환타입 : Account
	 * 	메소드명 : getAccountDateall
	 * 	매개변수 : int accNo
	 */
	public Account getAccountDetailAll(int accNo, int pwd) {
		Account account = repo.getAccountByNo(accNo);
		if(account == null) {
			return null;
		}
		if(account.getPassword() !=pwd) {
			return null;
		}
		
		return account;
	}
	
	// 입금하기
	/*
	 * 계좌번호와 입금액을 전달받아서 현재 잔액을 증가시킨다.
	 * 	반환타입 : boolean
	 * 	메소드명 : deposit
	 * 	매개변수 : int accNo, long amount
	 */
	public boolean deposit(int accNo, long amount) {
		Account account = repo.getAccountByNo(accNo);
		if (account == null) {
			return false;
		}
		
		long balance = account.getBalance() + amount;
		account.setBalance(balance);
		
		return true;
	}
	
	// 출금하기
	/*
	 * 계좌번호와 비밀번호를 전달받아서 현재 잔액을 감소시킨다.
	 * 	반환타입 : boolean
	 * 	메소드명 : withdraw
	 * 	매개변수 : int accNo, int pwd, long amount
	 */
	public boolean withdraw(int accNo, int pwd, long amount) {
		Account account = repo.getAccountByNo(accNo); // 계좌번호 이름을 no라고 했을때 getAccountByNo의 매개변수를 no로 해야한다.
													 // 굳이 매개변수명이 이전의 메소드들과 똑같아야 하는건 아니다. 어차피 값을 전달하는 것이기 때문
		if(account == null) {
			return false;
		} 
		
		// else if는 하나의 조건에 대해서 여러값쓸 때 사용 ex) 포인트-골드,실버,브론즈 
		if(pwd != account.getPassword()) {
			return false;
		}
		
		if(amount > account.getBalance()) {
			return false;
		}
		
		long balance = account.getBalance() - amount;
		account.setBalance(balance);
		
		return true;
		
	}
		
			
	// 비밀번호 변경하기
	/*
	 * 반환타입 : boolean
	 * 매소드명 : changeService
	 * 매개변수 : int accNo, int prevpwd, int newpwd
	 */
	public boolean changePassword(int accNo, int prePassword, int password) {
		Account account =repo.getAccountByNo(accNo); // 계좌정보 조회
		if(account == null) {
			return false;
		}
		if(account.getPassword() != prePassword) {
			return false;
		}
		
		account.setPassword(password);
		return true;
	}
	
	
	// 해지하기
	// 다양한 것들을 담기 위해 Account가 아닌, Map을 사용한것.
	public Map<String, Object> expireAccount(int accNo, int password){
		Map<String, Object> result = new HashMap<>(); // null인 값을 반환하지 않는다.
		
		Account account = repo.getAccountByNo(accNo);
		if(account == null) {
			result.put("success", false);
			return result;
		}
		if(account.getPassword() != password) {
			result.put("success", false);
			return result;
		}
		int interest = (int)(account.getBalance()*account.getInterestRate()*5);
		result.put("success", true);
		result.put("no", account.getNo());
		result.put("owener", account.getOwner());
		result.put("balance", account.getBalance());
		result.put("interest", interest); // 이자
		result.put("amount", account.getBalance()+ interest); 
		
		repo.deleteAccount(accNo);
		
		
		return result;
	}
	
	
	
}
