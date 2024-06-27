package com.in28minutes.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock {
	private int i = 0;
	private int j = 0;

	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();
	public int getI() {
		return i;
	}

	public void incrementI() {
		// get Lock For I
		lockForI.lock();
		i++;
		// release lock For I
		lockForI.unlock();
	}

	public int getJ() {
		return j;
	}

	public void incrementJ() {
		// get lock for j
		lockForJ.lock();
		j++;
		// release lock for j
		lockForJ.unlock();
	}
}

