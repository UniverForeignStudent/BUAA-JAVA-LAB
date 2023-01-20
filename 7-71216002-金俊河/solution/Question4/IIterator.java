public interface IIterator {

	boolean isEnd();
	Shape current();
	void moveNext();
	boolean equals(Object o);
	
}