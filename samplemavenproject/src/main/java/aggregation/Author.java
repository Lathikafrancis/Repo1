package aggregation;

public class Author {
	String authorname;
	Book add;
	
	public Author(String authorname, Book add)
	{
		this.authorname = authorname;
		this.add = add;
	}
	public void display()
	{
		System.out.println(authorname);
		System.out.println(add.bookname);
		System.out.println(add.genre);
		System.out.println(add.language);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book obj = new Book("titanic","novel","language");
        Author ob = new Author("Peter", obj);
        ob.display();
        
	}

}
