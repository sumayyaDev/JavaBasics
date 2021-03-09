import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import java.util.*;
import java.io.*;
  
public class CreatingSeries{

	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		for(int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			
			int num = a;
			for(int j = 0; j < n; j++) {
				num += (int)Math.pow(2, j) * b;
				System.out.print(num + " ");
			}
			System.out.println();
		}
		

      }
		
    }

