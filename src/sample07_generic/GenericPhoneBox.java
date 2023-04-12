package sample07_generic;

public class GenericPhoneBox<T extends Phone> { // T는 Phone종류만 들어가게 하기 위해 extends사용
	private T item;
	
	public T getItem() {
		return item;
	}
	
	public void setItem(T item) {
		this.item = item;
	}
}
