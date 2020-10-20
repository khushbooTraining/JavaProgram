package testk;

public class test11 {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
				for(int i=1;i<=20;i++) {
					sb.append(i);
				}
		System.out.println(sb.capacity());  //16 initial capacity+18
		System.out.println(sb.length());  //31
		System.out.println(sb);
	}

}
