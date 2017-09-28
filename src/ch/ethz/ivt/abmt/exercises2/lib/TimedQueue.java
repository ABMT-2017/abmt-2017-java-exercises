package ch.ethz.ivt.abmt.exercises2.lib;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * A simple queue that checks for a minimum time before removing the head.
 * @author thibautd
 */
public class TimedQueue {
	private Queue<Record> queue = new ArrayDeque<>(  );

	public void addElementAtEnd( Object element , double earliestExitTime ) {
		queue.add( new Record( element , earliestExitTime ) );
	}

	public Object removeFirstIfArrived( double time ) {
		final Record head = queue.peek();
		if ( head == null || head.exitTime > time ) return null;
		queue.poll();
		return head.element;
	}

	public int size() {
		return queue.size();
	}

	private static class Record {
		final Object element;
		final double exitTime;

		private Record( final Object element, final double exitTime ) {
			this.element = element;
			this.exitTime = exitTime;
		}
	}
}
