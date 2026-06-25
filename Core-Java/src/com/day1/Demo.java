package com.day1;
// Generics 
class Demo<T> {
	private T data;
	public Demo(T data) {
		this.data = data;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
}

