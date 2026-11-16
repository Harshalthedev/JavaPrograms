class Program70 {
    public static void main(String[] args) {
        System.out.println(countDaysTogether("08-15", "08-18", "08-16", "08-19"));
        System.out.println(countDaysTogether("10-01", "10-31", "11-01","12-31"));
    }
    public static int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] arAl = {Integer.parseInt(arriveAlice.substring(0, 2)), Integer.parseInt(arriveAlice.substring(3, 5))};
        int[] leAl = {Integer.parseInt(leaveAlice.substring(0, 2)), Integer.parseInt(leaveAlice.substring(3, 5))};
        int[] arBo = {Integer.parseInt(arriveBob.substring(0, 2)), Integer.parseInt(arriveBob.substring(3, 5))};
        int[] leBo = {Integer.parseInt(leaveBob.substring(0, 2)), Integer.parseInt(leaveBob.substring(3, 5))};
        int[] calendar = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int arAlDays = days(calendar, arAl[0]) + arAl[1];
        int leAlDays = days(calendar, leAl[0]) + leAl[1];
        int arBoDays = days(calendar, arBo[0]) + arBo[1];
        int leBoDays = days(calendar, leBo[0]) + leBo[1];
        System.out.println("alcom " + arAlDays);
        System.out.println("alcom " + leAlDays);
        System.out.println("bocom " + arBoDays);
        System.out.println("alcom " + leBoDays);
        boolean alcome = false;
        if (arAlDays < arBoDays) alcome = true;
        if (leAlDays <= arBoDays) return 0;
        if (leBoDays <= arAlDays) return 0;
        if (alcome) {
            return Math.min(leAlDays, leBoDays) - arBoDays +1 ;
        }
        else {
            return Math.min(leAlDays, leBoDays) - arAlDays+1;
        }
    }
    public static int days(int[] calen, int month) {
        int days = 0;
        for (int mn: calen) {
            if (month == 0) break;
            days += mn;
            month--;
        }
        return days;
    }
}