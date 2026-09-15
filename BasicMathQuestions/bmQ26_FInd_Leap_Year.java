class bmQ26_FInd_Leap_Year {
    public static void main(String args[]) {
        int year = 1904;
        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.print(year + "  is leap year.");
        } else {
            System.out.print(year + "  is not a leap year.");
        }
    }
}


class bmQ26_FInd_Leap_Year {
    public static void main(String args[]) {
        int year = 2100;
        if(year % 4 == 0 && year % 100 != 0 || year % 100 == 0 && year % 400 == 0) {
            System.out.println("it's a leap year bro...");
        } else {
            System.out.println("it's not a leap year bro...");
        }
    }
}