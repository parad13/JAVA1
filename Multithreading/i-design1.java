// Article.java
import java.util.*;
public class Article extends Thread{
	private String line;
	private Integer count;

	Article() {}
	Article(String line) {
		this.line = line.toLowerCase();
		this.count = 0;
	}

	public Integer getCount() {
		return this.count;
	}

	public String getLine() {
		return this.line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	@Override
	public void run() {
		try {
			Set<String> s = new HashSet<>();
			s.add("a"); s.add("an"); s.add("the");
			String[] str = line.split("[, ]+");
			for(int i=0; i<str.length; i++) {
				if(s.contains(str[i])) {
					count++;
				}
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}

// Main.java
import java.util.*;

public class Main {
	public static void main(String[] args) throws InterruptedException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of lines");
		
		int n = Integer.parseInt(sc.nextLine());
		Article[] a = new Article[n];
		for(int i=0; i<n; i++) {
			System.out.println("Enter line " + (i+1));
			String s = sc.nextLine();
			a[i] = new Article(s);
			a[i].start();
			a[i].join();
		}
		int ans = 0;
		for(int i=0; i<n; i++) {
			ans += a[i].getCount();
		}

		System.out.println("There are " + ans + " articles in the given input");
	}
}
