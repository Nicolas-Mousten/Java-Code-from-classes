package ExamTest4;

import java.util.ArrayList;

public class User {
    private static String abc = "abcdefghijklmnopqrstuvwxyz";
    private static String num = "1234567890";
    private String fullName;
    private String userID;

    public boolean validUserID(){
        ArrayList<String> UserArrayId = new ArrayList<>();

        boolean ValidUserID = true;

        for (int i = 0; i < userID.length(); i++) {
            UserArrayId.add(String.valueOf(userID.charAt(i)));
        }
        if(UserArrayId.size() == 8) {
            for (int i = 0; i < UserArrayId.size()/2; i++) {
                for (int j = 0; j < abc.length(); j++) {
                    if(UserArrayId.get(i).equals(String.valueOf(abc.charAt(j)))){
                        System.out.println("Contains Letter");
                    }else{
                        ValidUserID = false;
                    }
                }
            }
            for (int i = UserArrayId.size()/2; i < UserArrayId.size(); i++) {
                for (int j = 0; j < num.length(); j++) {
                    if(UserArrayId.get(i).equals(String.valueOf(num.charAt(j)))){
                        System.out.println("Contains Number");
                    }else{
                        ValidUserID = false;
                    }
                }
            }
        }else{
            ValidUserID = false;
        }
        return ValidUserID;
    }


    public String createUserID(){
        String outPut = "";

        for (int i = 0; i <= 2; i++) {
            outPut += String.valueOf(fullName.charAt(i));
        }
        for (int i = 0; i < fullName.length(); i++) {
            if(String.valueOf(fullName.charAt(i)).equalsIgnoreCase(" ")){
                int firstLetterLastName = i+1;
                int secondLetterLastName = i+2;
                outPut += String.valueOf(fullName.charAt(firstLetterLastName));
                outPut += String.valueOf(fullName.charAt(secondLetterLastName));
            }
        }


        return outPut;
    }
}



