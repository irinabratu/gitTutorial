public class Strings1 {
    public String helloName(String name) {
        String result = "Hello " + name + "!";
        return result;
    }

    public String makeAbba(String a, String b) {
        String result = a+b+b+a;
        return result;
    }

    public String makeTags(String tag, String word) {
        String result = "<" + tag + ">" + word + "</" + tag + ">";
        return result;
    }

    public String makeOutWord(String out, String word) {
        String result = out.substring(0,2) + word + out.substring(2,4);
        return result;
    }

    public String extraEnd(String str) {
        String item = str.substring(str.length() - 2, str.length());
        String result = item + item + item;
        return result;
    }

    public String firstTwo(String str) {
        String result;
        if (str.length() < 2) {
            return str;
        } else {
            result = str.substring(0,2);
        }
        return result;
    }

    public String firstHalf(String str) {
        String result = str.substring(0, str.length() /2);
        return result;
    }

    public String withoutEnd(String str) {
        String result = str.substring(1,str.length()-1);
        return result;
    }

    public String comboString(String a, String b) {
        String result;
        if(a.length()<b.length()) {
            result = a+b+a;
        } else {
            result = b+a+b;
        }
        return result;
    }

    public String nonStart(String a, String b) {
        String result = a.substring(1,a.length()) + b.substring(1, b.length());
        return result;
    }

    public String left2(String str) {
        String result = str.substring(2,str.length())+str.substring(0,2);
        return result;
    }

    public String right2(String str) {
        String result = str.substring(str.length() -2, str.length()) + str.substring(0,str.length()-2);
        return result;
    }

    public String theEnd(String str, boolean front) {
        String result;
        if (front) {
            result = str.substring(0,1);
        } else {
            result = str.substring(str.length()-1, str.length());
        }
        return result;
    }

    public String withouEnd2(String str) {
        String result;
        if(str.length() > 1) {
            result = str.substring(1, str.length()-1);}
        else {
            result = "";
        }
        return result;
    }

    public String middleTwo(String str) {
        String result;

        result = str.substring(str.length()/2-1,str.length()/2+1);

        return result;
    }

    public boolean endsLy(String str) {
        if (str.length() >1 && str.substring(str.length() - 2, str.length()).equals("ly"))
        {
            return true;
        } else {
            return false;
        }
    }

    public String nTwice(String str, int n) {
        int length = str.length();
        String result = str.substring(0, n) + str.substring(length-n, length);
        return result;
    }

    public String twoChar(String str, int index) {
        String result;
        if (index >= str.length() -1 || index < 0){
            result = str.substring(0,2);
        }
        else {
            result = str.substring(index, index +2);
        }
        return result;
    }

    public String middleThree(String str) {
        String result;
        result = str.substring(str.length()/2-1,str.length()/2+2);
        return result;
    }

    public boolean hasBad(String str) {
        if ((str.length() >3 && (str.substring(0,3).equals("bad") || str.substring(1,4).equals("bad"))) || str.equals("bad")){
            return true;
        }
        else {
            return false;

        }
    }

    public String atFirst(String str) {
        int length = str.length();
        String result = "";

        if(length == 1){
            result = str + "@";
        } else if (length == 0) {
            result = "@@";
        } else if (length > 1) {
            result = str.substring(0,2);
        }
        return result;
    }

    public String lastChars(String a, String b) {
        String result = "";
        if (a.length() > 0 && b.length() > 0) {
            result = a.substring(0,1) + b.substring(b.length()-1);
        } else if (a.length() == 0 && b.length() > 0) {
            result = "@" + b.substring(b.length()-1);
        } else if (a.length() > 0 && b.length() == 0){
            result = a.substring(0,1) + "@";
        } else if (a.length() == 0 && b.length() == 0) {
            result = "@@";
        }
        return result;
    }

    public String conCat(String a, String b) {
        String result = "";
        if(a.equals("") || b.equals("")) {
            result = a+b;
        } else if (a.substring(a.length()-1).equals(b.substring(0,1))){
            result = a.substring(0,a.length()-1)+b;
        } else {
            result = a+b;
        }
        return result;
    }


    public String lastTwo(String str) {
        String result;
        int len = str.length();

        if (str.length()>=2) {
            result = str.substring(0,len-2) + str.substring(len-1) + str.substring(len-2,len-1);
        } else {
            result= str;
        }
        return result;
    }


    public String seeColor(String str) {
        String result;

        if (str.length() < 3 || (str.length() == 3 && !str.equals("red"))){
            result = "";
        }
        else if (str.substring(0,3).equals("red"))  {
            result = "red";
        } else if (str.substring(0,4).equals("blue")){
            result = "blue";
        } else {
            result = "";
        }
        return result;
    }

    public boolean frontAgain(String str) {
        int len = str.length();
        if (len<2) {
            return false;
        }
        else if (len==2 && str.substring(0).equals(str.substring(1))) {
            return true;
        }
        else if(str.substring(0,2).equals(str.substring(len-2,len))){
            return true;
        }
        return false;
    }

    public String minCat(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();
        String result;

        if (lenA < lenB) {
            result = a + b.substring(lenB-lenA);
        } else if (lenB < lenA) {
            result = a.substring(lenA-lenB) + b;
        } else if (lenA ==0 || lenB ==0) {
            result = "";
        } else {result = a + b;}
        return result;
    }

    public String extraFront(String str) {
        String result = "";
        int len = str.length();
        if (len<2) {
            result = str + str +str;
        } else {
            result = str.substring(0,2) + str.substring(0,2) +str.substring(0,2);
        }
        return result;
    }

    public String without2(String str) {
        String result = "";
        int len = str.length();

        if (len == 2) {
            result = "";
        } else if (len < 2) {
            result = str;
        } else if (str.substring(0,2).equals(str.substring(len-2, len))) {
            result = str.substring(2);
        } else {
            result = str;
        }
        return result;
    }

    public String deFront(String str) {
        String result = "";
        int len = str.length();

        if (str.substring(0,1).equals("a")) {
            if (str.substring(1,2).equals("b")) {
                result = str;
            } else {
                result = str.substring(0,1) + str.substring (2);
            }}
        else if (!str.substring(0,1).equals("a") && str.substring(1,2).equals("b")) {
            result = str.substring(1);

        } else {
            result = str.substring(2);
        }
        return result;
    }

    public String startWord(String str, String word) {
        String result= "";
        int len = str.length();
        int lenW = word.length();

        if (len < lenW) {
            return result;
        } else if (str.substring(1,lenW).equals(word.substring(1))) {
            result = str.substring(0,lenW);
        } else {
            result = "";
        }
        return result;
    }

    public String withoutX(String str) {
        String result = "";
        int len = str.length();
        if (len<=1) {
            return result;
        } else if (str.substring(0,1).equals("x")) {
            if (str.substring(len-1).equals("x")) {
                result = str.substring(1,len-1);
            } else {
                result = str.substring(1);
            }
        } else if (str.substring(len-1).equals("x") && !str.substring(0,1).equals("x")){
            result = str.substring(0,len-1);
        }
        else {
            result= str;
        }
        return result;
    }

    public String withoutX2(String str) {
        String result;
        int len = str.length();
        if (len<=1) {
            result = "";
        } else if (str.substring(0,1).equals("x")) {
            if (str.substring(1,2).equals("x")) {
                result = str.substring(2);
            } else {
                result = str.substring(1);
            }
        } else if (str.substring(1,2).equals("x")){
            result = str.substring(0,1) + str.substring(2);
        } else {
            result = str;
        }
        return result;
    }

}
