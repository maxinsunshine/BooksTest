package model;

public class OrderItem {

	private String order_id; // ������
	private String books_id; // ͼ���
	private int lendnum; // ��������

	// Ҫ��ѯ��������Ʒ��Ϣʱ�����Խ���Ʒ��Ϣ��װ��OrderItem��.
	private String name;//ͼ������
	private double price;//�۸�

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public String getBooks_id() {
		return books_id;
	}

	public void setBooks_id(String books_id) {
		this.books_id = books_id;
	}

	public int getLendnum() {
		return lendnum;
	}

	public void setLendnum(int lendnum) {
		this.lendnum = lendnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
