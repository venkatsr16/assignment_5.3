import java.io.*;
class Employee
{
public static void main(String args[])
{
int bs,da,hra,pf,ins=0,adv=0;
int total=0,ded=0,net=0;
String name;
try
{

InputStreamReader ir=new InputStreamReader(System.in);

BufferedReader br=new BufferedReader(ir);

System.out.print("Enter the Name of the Employee ::--");
name=br.readLine();

System.out.print("Enter the Basic Salary of the Employee ::--");

bs=Integer.parseInt(br.readLine());

System.out.print("Enter the DA(%) of the Employee ::--");

da=Integer.parseInt(br.readLine());

System.out.print("Enter the HRA(%) of the Employee ::--");

hra=Integer.parseInt(br.readLine());

System.out.print("Enter the PF(%) of the Employee ::--");

pf=Integer.parseInt(br.readLine());

System.out.print("Enter the Insurance of the Employee ::--");

ins = Integer.parseInt(br.readLine());

System.out.print("Enter the Advance of the Employee ::--");

adv=Integer.parseInt(br.readLine());
hra=(bs*hra)/100;
da=(bs*da)/100;
pf=(bs*pf)/100;
total=hra+da+pf+bs;
ded=hra+da+pf+adv+ins;
net=total-ded;

System.out.println("---------------------------------------------------------------------------");
System.out.println("NAME\t "+"BASIC SALARY\t " + "DA\t" + "HRA\t" + "PF\t" + "INSURANCE"+ " ADVANCE");
System.out.println("---------------------------------------------------------------------------");
System.out.println(name + "\t" + bs + "\t " + da + "\t" + hra + "\t" + pf + "\t " + ins +"\t "+ adv);
System.out.println("\n\n------------------------------------------");
System.out.println("TOTAL SALARY\t"+"DEDUCTION\t" + "NET SALARY\t ");
System.out.println("------------------------------------------");
System.out.println(total + "\t " + ded + "\t " + net); 
}
catch(Exception e)
{
System.out.println(" " + e);
}

}
}