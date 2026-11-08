import java.util.*;
class A4a{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter b");
double b=sc.nextDouble();
System.out.println("Enter a");
double a=sc.nextDouble();
System.out.println("Enter c");
double c=sc.nextDouble();

double d=Math.sqrt((b*b)-(4*a*c));
if(d>0){
double r1=(-b+d)/2*a;
double r2=(-b-d)/2*a;
System.out.println("The first root: "+r1);
System.out.println("The second root: "+r2);
}else if(d==0){
double r= -b/2*a;
System.out.println(" root: "+r);
}else{
System.out.println("roots are imaginary ");
}
}
}