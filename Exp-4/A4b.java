import java.util.*;
class A4b{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Input first no.");
double n1=sc.nextDouble();
System.out.println("Input second no.");
double n2=sc.nextDouble();
if(Math.round(n1*1000)==Math.round(n2*1000)){
System.out.println("They are same upto 3 decimal places");
}
else{
System.out.println("They are different");
}
sc.close();

}
}