package kr.or.gobooke.book.domain;

/**
 * 책 도메인
 * 
 * @author Park Joo-Yeon
 *
 */
public class Book {
	
	/** 인스턴스 변수 총 11개 */
	private int no;
	private String title;
	private String author;
	private String publisher;
	private String detail;
	private int price;
	private String image;
	private String regdate;
	private int qty;
	private int categoryNo;
	private double grade;
	
	
	/** 생성자 */
	
	public Book() {
		this(0,null,null,null,null,0,null,null,0,0,0.0);
	}
	
	public Book(String title, String author, String publisher, String detail, int price, String image,
			int qty, int categoryNo, double grade) {
		this(0, title, author, publisher, detail, price, image, null, qty, categoryNo, grade);
	}
	
	public Book(int no, String title, String author, String publisher, String detail, int price, String image,
			String regdate, int qty, int categoryNo, double grade) {
		this.no = no;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.detail = detail;
		this.price = price;
		this.image = image;
		this.regdate = regdate;
		this.qty = qty;
		this.categoryNo = categoryNo;
		this.grade = grade;
	}

	
	/** Getter, Setter */
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getCategoryNo() {
		return categoryNo;
	}

	public void setCategoryNo(int categoryNo) {
		this.categoryNo = categoryNo;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Book [no=" + no + ", title=" + title + ", author=" + author + ", publisher=" + publisher + ", detail="
				+ detail + ", price=" + price + ", image=" + image + ", regdate=" + regdate + ", qty=" + qty
				+ ", categoryNo=" + categoryNo + ", grade=" + grade + "]";
	}
	
	
	
	
}