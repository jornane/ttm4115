package ttm4115.queue;

public class QueuePosition<T> {

	public final T object;
	public final int position;
	
	public QueuePosition(T object, int position) {
		this.object = object;
		this.position = position;
	}
	
}
