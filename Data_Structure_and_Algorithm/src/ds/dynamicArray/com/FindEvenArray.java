package ds.dynamicArray.com;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindEvenArray {
	public static void main( String[] args){
		int[] inp = {4,5,6,7,8,9,12,16,21,24,56};
		int[] find = findEven(inp);
		for(int i=0;i<find.length;i++){
			System.out.println(find[i]);
		}
		
	}
	public static int[] findOdd(int[] inp){
		int[] out = new int[inp.length];
		int j = 0;
		for(int i=0;i<inp.length;i++){
			if(inp[i]%2==0){
				out[j] = inp[i];
				j++;
			}
		}
		int ind = 0;
		for(int k= 0;k<out.length;k++){
			//System.out.println(out[k]);
			if(out[k] == 0){ 
				ind=k;
				break;
			}
		}
		int[] output = new int[ind]; 
		for(int i=0;i<ind;i++){
			output[i] = out[i];
			System.out.println(out[i]);
		}
		return output;
	}
	public static int[] findEven(int[] inp){
		int init = 0;
		int[] out = new int[init];
		int j=0;
		for(int i=0;i<inp.length;i++){
			if(inp[i]%2 == 0){
				if(j==init){
					init++;
					out = Arrays.copyOf(out, init);
				}
				out[j] = inp[i];
				j++;
			}
			
		}
		return out;
	}

}
