    
import java.util.*;
class GhazanfarRestaurent{
public static void main(String[] arg){
int option;
String order;
System.out.println("WELCOME TO GHAZAN KITCHEN");
Scanner obj=new Scanner(System.in);
System.out.println("Menu\n 1.chicken burger\n 2.tea\n 3.coffee\n 4.colddrink\n 5.large pizza\n 6.small pizza");
System.out.println("enter choices (1-6):");
option=obj.nextInt();
switch(option)
{
case 1:
 	order="chicken burger";
 	System.out.println("price=390 PKR");
	break;
case 2:
	order="tea";
 	System.out.println("price=45 PKR");
	break;
case 3:
	order="coffee";
 	System.out.println("price=110 PKR");
	break;
case 4:
	order="colddrink";
 	System.out.println("price=60 PKR");
	break;
case 5:
	order="large pizza";
 	System.out.println("price=1880 PKR");
	break;
case 6:
	order="small pizza";
 	System.out.println("price=450 PKR");
	break;
	default:
	order="sorry not in menu";
}

	System.out.println("your order is"+order);
}

}
