package sample11_bank;

import java.util.Date;

/**
 * 계좌정보를 표현하는 클래스다.
 * @author JHTA
 *
 */
public class Account {

	private int no;
	private int password;
	private String owner;
	private long balance;
	private double interestRate;
	private String status;
	private Date createdDate;
	private Date deletedDate;

	// 기본생성자
	public Account() {}
	
	
	public Account(int no, int password, String owner, long balance) {
		super();
		// 입력 시 저장
		this.no = no;
		this.password = password;
		this.owner = owner;
		this.balance = balance;
		// 기본적으로 설정
		this.interestRate = 0.04;
		this.status = "사용중";
		this.createdDate = new Date();
	}



	// 메소드
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getDeletedDate() {
		return deletedDate;
	}

	public void setDeletedDate(Date deletedDate) {
		this.deletedDate = deletedDate;
	}
	
	
}
