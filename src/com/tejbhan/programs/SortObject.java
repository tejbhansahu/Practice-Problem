package com.tejbhan.programs;

import java.util.Arrays;

public class SortObject {
	
	public static void main(String args[]) {
		Students[] data = {
                new Students(4, "abc"),
                new Students(10, "abc2"),
                new Students(5, "abc3"),
                new Students(6, "abc5")
        };

        System.out.println("--- before");
        System.out.println(Arrays.asList(data));
        Arrays.sort(data, (a, b) -> Integer.valueOf(a.id).compareTo(Integer.valueOf(b.id)));
        System.out.println("--- after");
        System.out.println(Arrays.asList(data));
	}

}

class Students {

    public String name;
    public int id;

    public Students(int id, String name) {
    	this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                "name=" + name + '\'' +
                ", id=" + id +
                '}' + System.getProperty("line.separator");
    }
}
