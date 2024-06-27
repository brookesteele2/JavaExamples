package com.in28mintues.tips.blocks;

class Client {
	private int id;

	public Client(int id) {
			super();
			this.id = id;
	}
//equals
//hashcode

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Client other = (Client) obj;
		return id == other.id;
	}

}

public class EqualsRunner {
	public static void main(String[] args) {
		Client c1 = new Client(1);
		Client c2 = new Client(1);
		Client c3 = new Client(2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));

	}

}
