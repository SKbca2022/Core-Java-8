package TernaryOperator;

public class ternaryOperato {
public static void main(String[]args) {
	int a,b,c,d,e,largest;
	a=3;
	b=4;
	c=5;
	d=6;
	e=7;
    largest = (a>b && a>c && a>d && a>e)?a:(b>a && b>c && b>d && b>e)?b:(c>a && c>b && c>d && c>e)?c:(d>a && d>b && d>c && d>e)?d:(e>a && e>b && e>c && e>d)?e:d;
	
    System.out.println("the largest number of a="+a+" ,b="+b+" ,c="+c+" ,d="+d+ " and e="+e+" is "+largest);
}
}

