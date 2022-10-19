class SetDate
{
	private int day,month,year;
	SetDate()
	{
		day = 01;
		month = 01;
		year = 1970;
	}
	SetDate(int day)
	{
		this();
		this.day = day;
	}
	SetDate(int day, int month)
	{
		this();
		this.day = day;
		this.month = month;
	}
	SetDate(int day, int month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	void previousDay(){
		day--;
		if(day<1)
		{
			month--;
			if(month<1)
			{
				year--;
				day = 30;
				month = 01;
			}
		}
		System.out.println(day+"-"+month+"-"+year);
	}
	void nextDay(){
		day++;
		if(day>31)
		{
			month++;
			if(month>12)
			{
				year++;
			}
			day=01;
			month=01;
		}
		System.out.println(day+"-"+month+"-"+year);
	}
	void printDay(){
		System.out.println(this.day+"-"+this.month+"-"+this.year);
	}
}
class DateDemo
{
	public static void main(String args[])
	{
		SetDate s1 = new SetDate();
		s1.printDay();
		SetDate s2 = new SetDate(12);
		s2.printDay();
		SetDate s3 = new SetDate(31, 12);
		s3.printDay();
		SetDate s4 = new SetDate(12, 02, 2022);
		s4.printDay();
		
		//s1.nextDay();
		s1.previousDay();
		//s2.nextDay();
		s2.previousDay();
		s3.nextDay();
		s3.previousDay();
	}
}