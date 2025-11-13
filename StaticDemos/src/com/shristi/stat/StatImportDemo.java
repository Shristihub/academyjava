package com.shristi.stat;
import static com.shristi.stat.Book.*;
import static java.lang.Integer.parseInt;
import static java.lang.System.out;
public class StatImportDemo {

	public static void main(String[] args) {
		//using the static import
		libraryDetails();
		out.println(libraryName);
		int x = parseInt("100");
		out.println(x);
	}
}
