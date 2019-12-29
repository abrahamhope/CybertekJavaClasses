package day34;

public class MathActioonFromJDK {
    /*
    , login1 :  static void method
	it has two String method paramters
			called username and password
	(it accept 2 String object as argument when being called)
	it check whther username and password  "user" and "abc123"
	if yes
		print login successful
	else
		print login failed (OPTIONALLY FIND EXACTLY WHY FAILED)
     */
    public static void login1(String username, String password){
        if(username.equals("user")&&password.equals("abc123")){
            System.out.println("Login succesful");
        }else{
            System.out.println("Login Failed");
        }
    }
    public static void main(String[] args) {

       login1("user", "abc123");
        System.out.println(login2("user", "falses"));
    }
/*
2, login2 :  static method boolean return type
	it has two String method paramters
			called username and password
	(it accept 2 String object as argument when being called)
	it check whther username and password  "user" and "abc123"
	if yes
		return true
	else
		return false
 */

public static boolean login2(String username, String password){
    boolean isLogin=true;
    if(username.equals("usear")&&password.equals("abc123")){
        return isLogin;
    }else {
        return !isLogin;
    }
}

}
