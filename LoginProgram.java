import java.util.*;
class LoginProgram{
	public static void main(String[] args){
		String email,password;
		String[][] userinfo = { 
	{"Ghazanfarkhoso@gmail.com","00000000"},
	{"Sain110@hotmail.com","11111111"},
	{"Baloch25@yahoo.com","22222222"},
        {"Spider64@gmail.com","33333333"},
	{"Sainsahab11@gmail.com", "44444444"}};

            System.out.println("welcome to the Ghazan's Family");
			Scanner obj = new Scanner(System.in);

			System.out.println("Enter Your Email Address: ");
			email = obj.next();
            System.out.println("Enter Your Password: ");
			password = obj.next();
        
                int i;
                boolean AccountExists = false;

                for( i=0;i< userinfo.length;i++){
                    if(userinfo[i][0].equals(email)) {
                        AccountExists = true;
                        
                        if( userinfo[i][1].equals(password))  {
                            System.out.println(" you are login ");
                            break;
                        }
                    }
                }
                if(i == userinfo.length)  
                  System.out.println(":Invalid Credentials");

                if(AccountExists)  
                  System.out.println(":Account Exists");
                else
                  System.out.println(":Account Doesn't exists");
 
        }
}
