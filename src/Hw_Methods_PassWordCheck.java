public  class Hw_Methods_PassWordCheck {
    public static void main(String[] args) {
        //Create 4 password variables for testing
        String str1="",str2="Pa$$word",str3="password",str4="PhotoShop#1$&&";

        //Call PasswordCheck method for each password
        boolean p1=PasswordCheck(str1);
        boolean p2=PasswordCheck(str2);
        boolean p3=PasswordCheck(str3);
        boolean p4=PasswordCheck(str4);

        //Print results
        System.out.println("Str1:"+str1+" Result:"+p1);
        System.out.println("Str2:"+str2+" Result:"+p2);
        System.out.println("Str3:"+str3+" Result:"+p3);
        System.out.println("Str4:"+str4+" Result:"+p4);
    }

    //Create PasswordCheck method to check if password contains at least one digit
    public static boolean PasswordCheck(String password){
        //Check if password is null or empty return false
        if (password==null || password.isEmpty()){
            return false;
        }

        //Check if password contains at least one digit return true
        for (int i = 0; i < password.length(); i++) {
            if(Character.isDigit(password.charAt(i))){
                return true;
            }
        }

        //Return false if password does not contain at least one digit
        return false;
    }

}


