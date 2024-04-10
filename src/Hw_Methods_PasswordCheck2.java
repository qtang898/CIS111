public class Hw_Methods_PasswordCheck2 {

    public static void main(String[] args) {
        //Create 6 password and last password variables for testing
        String lastPws="Pa$$w0rd";
        String newPws1="Pa$$w0rd";
        String newPws2="";
        String newPws3="password";
        String newPws4="password1";
        String newPws5="password$";
        String newPws6="PhotoShop#1$&&";

        //Call PasswordCheck2 method for each password
        boolean result1=PasswordCheck2(newPws1, lastPws);
        boolean result2=PasswordCheck2(newPws2, lastPws);
        boolean result3=PasswordCheck2(newPws3, lastPws);
        boolean result4=PasswordCheck2(newPws4, lastPws);
        boolean result5=PasswordCheck2(newPws5, lastPws);
        boolean result6=PasswordCheck2(newPws6, lastPws);

        //Print results
        System.out.println("lastPws:"+lastPws);
        System.out.println("newPws1:"+newPws1+" result:"+result1);
        System.out.println("newPws2:"+newPws2+" result:"+result2);
        System.out.println("newPws3:"+newPws3+" result:"+result3);
        System.out.println("newPws4:"+newPws4+" result:"+result4);
        System.out.println("newPws5:"+newPws5+" result:"+result5);
        System.out.println("newPws6:"+newPws6+" result:"+result6);
    }

    public static boolean PasswordCheck2(String newPws, String lastPws){
        //Check if password is null or empty return false
        if (newPws==null || newPws.isEmpty()){
            return false;
        }
        //check if new password is the same as last password return false
        if (newPws.equals(lastPws)){
            return false;
        }

        //Create boolean to check if password contains at least one digit and one special character
        boolean haveDigit=false;
        boolean haveSpecial=false;

        //Test by checking whether there are numbers or special symbols in each string.
        // If there are numbers or special characters, assign the variables to be true or false.
        // If both variables are true, return the true value to stop the loop.
        for (char ch: newPws.toCharArray()){
            if(Character.isDigit(ch)){
                haveDigit= true;
            }
            if(!Character.isLetterOrDigit(ch)){
                haveSpecial= true;
            }
            if (haveDigit && haveSpecial){
                return true;
            }
        }
        //If both variables cannot be true at the same time, a false value needs to be returned.
        return false;
    }
}
