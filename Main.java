package com.example.*;
import java.util.*;
public class Main {
	public static int w[];
	
	public static void main(String[] args) {
		System.out.print(tokens("hello"));
		System.out.println(sigmoid(getsymbol(tokens("hello"),1)[0]));
	}
	public static byte[] tokens(String str) {
		return str.getBytes();
	}
	public static double[] getsymbol(byte[] massive , int bias ){
			double e[] = new double[massive.length];
			w = new int[massive.length];
			for (int i =0;i < massive.length-1;i++) {    Random r = new Random();
				  w[i] = r.nextInt();
			e[i] = (double)	  massive[i] * w[i] + bias;
				}
				return e;
			}
			public static double sigmoid(double x ) {
				return 1.0/(1.0+Math.exp(-x));
				}
}
