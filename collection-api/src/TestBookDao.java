import com.dao.BookDaoCollectionImpl;
import com.pojo.Book;

public class TestBookDao {

	public static void main(String[] args) {
		
		Book b1 = new Book(101, "Wings Of Fire", "APJ Kalam", 700);
		Book b2 = new Book(102, "Normal People", "Sally Rooney", 500);
		
		BookDaoCollectionImpl bookdao = new BookDaoCollectionImpl();
		
		bookdao.save(b1);
		bookdao.save(b2);
		System.out.println(bookdao.find(101));
		System.out.println(bookdao.list());
		System.out.println(bookdao.findByPrice(400, 800));
		System.out.println(bookdao.delete(102));
	}

}
