package com.in28minutes.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class BiCounterWithAtomicInteger {
	private AtomicInteger i = new AtomicInteger();
	private AtomicInteger j = new AtomicInteger();

	public int getI() {
		return i.incrementAndGet();

	}

	public void incrementI() {
		i.get();
	}

	public int getJ() {
		return j.incrementAndGet();
	}

	public void incrementJ() {
		j.get();
	}
}

