 class A2e {
    public static void main(String[] args) {
        int minutes=20000;
	int days=minutes/1440;
        int years=days/365;
        int remdays=days%365;
        System.out.println("days: "+days);
	System.out.println("Years: "+years);
	System.out.println("Remaining Days="+remdays);

    }
}
