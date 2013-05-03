package ttm4115.queue;

public class QueuePosition<T> {

	public final T object;
	public final int position;
	
	public QueuePosition(T object, int position) {
		this.object = object;
		this.position = position;
	}
	
	@Override
	public String toString() {
		return ""+position;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((object == null) ? 0 : object.hashCode());
		result = prime * result + position;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QueuePosition other = (QueuePosition) obj;
		if (object == null) {
			if (other.object != null)
				return false;
		} else if (!object.equals(other.object))
			return false;
		if (position != other.position)
			return false;
		return true;
	}
	
}
