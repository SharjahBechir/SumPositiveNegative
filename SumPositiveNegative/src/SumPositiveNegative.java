import java.io.*;
public class SumPositiveNegative {
    public static void main(String[] args)throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    do{
    int numE=0,ctr=1,sumP=0,sumN=0,num=0;
    try{
        System.out.print("Enter no. of elements:");
        numE=Integer.parseInt(br.readLine());
    }catch(NumberFormatException nfe){
         System.out.print("Invalid Input Numeric values only");
    }
    while(ctr<=numE){
        System.out.print("Input" +ctr+ "  of " +numE+ ":");
        num = Integer.parseInt(br.readLine());
        if(num>=0){
			  sumP=sumP+num;
        }else{

              sumN=sumN+num;
        }
        ctr=ctr+1;
    }
    System.out.println("Sum of Positive nos: " +sumP+ "  In sum of Negative nos: " +sumN);
    System.out.println("*Do you want to try again? (Y/N)");
	ans=(br.readLine(charAt));
	}while(ans=='Y' || ans=='N');
}
}

