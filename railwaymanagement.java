import java.util.*;
class railwaymanagement
  {
     public static void main(String asdf[])
	 {
		Scanner s=new Scanner(System.in);
		int flag=0;
	 do{
	   System.out.println("*****************WELCOME TO RAJKOT RAILWAYS*****************\n1.BOOKING\n2.CANCELLATION\n3.INQUIRY\n4.GOODS AND PARCEL SERVICES\n5.SHOPS AND CANTEENS\n6.JOB VACANCY\n7.MAINTENANCE\n8.STAFF\n9.EXIT");
	   int main_choice=s.nextInt();
	   
	   while(main_choice<1 || main_choice>9)
	   {
	   
		System.out.println("Invalid input..Please try again");
		main_choice=s.nextInt();
		
		}
		
		switch(main_choice)
		{
			case 1: booking ob=new booking();
					ob.booking1();
					break;
				
			case 2: cancellation ob1=new cancellation();
					ob1.cancellation1();
					break;
			
			case 3: inquiry ob2=new inquiry();
					ob2.inquiry1();
					break;
			
			case 4: goods ob3=new goods();
					ob3.goods1();
					break;
			
			case 5: shops_and_canteens ob4=new shops_and_canteens();
					ob4.shops_and_canteens1();
					break;
			
			case 6: job_vacancy ob5=new job_vacancy();
					ob5.job_vacancy1();
					break;
			
			case 7: maintenance ob6=new maintenance();
					ob6.maintenance1();
					break;
				
			case 8: staff ob7=new staff();
					ob7.staff1();
					break;
			
			
			case 9:
			flag=1;
			
		}
	}while(flag==0);
	System.out.println("Thank You ");
}
}

class booking
{
         void booking1()
 {
   Scanner s=new Scanner(System.in);
   Random r=new Random();
  int fare=0;
  int flag=0;
  int fare_ch;
do
{
  System.out.println("*********************BOOKING COUNTER*********************\n1. Jamnagar- Dwarka Express  \n2. Jamnagar Intercity\n3. Ahmedabad Express\n4. Ahmedabad Intercity\n5. Surat Express\n6. Surat Intercity\n7. Bhuj Express\n8. Bhuj Intercity \n9.exit");
int counter=100;
 
System.out.println("Enter the train number ");
int ch=s.nextInt();
while(ch<1 || ch>9)
{
	System.out.println("Invalid Input. Try again");
	ch=s.nextInt();
}
if(ch==1)
{
  System.out.println("CHOOSE THE DAY YOU WANT TO GO\n1.today\n2.tomorrow");
 int d1=s.nextInt();
 while(d1<1 || d1>2)
 {
	System.out.println("Invalid Input. Try Again");
	d1=s.nextInt();
}
 String d;
  if(d1==1)
  {
     d="today";
  }
else
{
   d="tomorrow";
 }
System.out.println("CHOOSE THE FARE\n1.A/c FIRST CLASS - Rs1500\n2.A/c TWO TIER - Rs1000\n3.A/c THREE TIER - Rs750\n4.SLEEPER - Rs500");
fare_ch=s.nextInt();
while(fare_ch<1 || fare_ch>4)
{
	System.out.println("Invalid Input. Try again");
	fare_ch=s.nextInt();
	}
switch(fare_ch)
{
	case 1: fare=1500; 
	break;
	case 2: fare=1000; 
	break;
	case 3 : fare=750; 
	break;
	case 4 : fare=500; 
	break;
}
	
	


  
  

System.out.println("Enter the number of tickets you want");
  int n=s.nextInt();
  while(n<1 || n>100)
  {
	System.out.println("Invalid Input. Try again");
	n=s.nextInt();
	}
    if(n<=counter)
     {
        System.out.println("Enter your age");
  int ag=s.nextInt();
   if(ag<18)
   {
         System.out.println("YOU ARE UNDERAGE, YOUR BOOKING IS CANCELLED");
     }
   else
   {
    int j=r.nextInt(100)+1;
      System.out.println("Enter your name");
    int t=n*fare;
   String nm=s.next();
  System.out.println("*****************JAMNAGAR-DWARKA EXPRESS*****************\n   NAME :"+nm+"\n   NO. OF TICKETS:"+n+"\n   AMOUNT TO PAY:"+t+"\n   TIME:"+d+"\n **************RAJKOT RAILWAYS**************");
System.out.println("YOUR SEAT NUMBERS ARE");
 for(int z=1;z<=n;z++)
   {
      System.out.print(j);
     System.out.print(" ");
      j++;
    }
  System.out.println("PLEASE PAY AND PROCEED");
}
}
 else
{
   System.out.println("THE AMOUNT OF TICKETS ARE NOT AVAILABLE AS YOUR REQUIREMENT");
 }      
}
if(ch==2)
{
  System.out.println("CHOOSE THE DAY YOU WANT TO GO\n1.today\n2.tomorrow");
 int d1=s.nextInt();
 while(d1<1 || d1>2)
 {
	System.out.println("Invalid Input. Try again");
	d1=s.nextInt();
}
 String d;
  if(d1==1)
  {
     d="today";
  }
else
{
   d="tomorrow";
 }
System.out.println("CHOOSE THE FARE\n1.A/c FIRST CLASS - Rs1500\n2.A/c TWO TIER - Rs1000\n3.A/c THREE TIER - Rs750\n4.SLEEPER - Rs500");
fare_ch=s.nextInt();
while(fare_ch<1 || fare_ch>4)
{
	System.out.println("Invalid Input. Try again");
	fare_ch=s.nextInt();
	}
switch(fare_ch)
{
	case 1: fare=1500; 
	break;
	case 2: fare=1000; 
	break;
	case 3 : fare=750; 
	break;
	case 4 : fare=500; 
	break;
}
  
  

System.out.println("Enter the number of tickets you want");
  int n=s.nextInt();
   while(n<1 || n>100)
 {
	System.out.println("Invalid Input. Try again");
	n=s.nextInt();
}
    if(n<=counter)
     {
        System.out.println("Enter your age");
  int ag=s.nextInt();
   if(ag<18)
   {
         System.out.println("YOU ARE UNDERAGE, YOUR BOOKING IS CANCELLED");
     }
   else
   {
    int j=r.nextInt(100)+1;
      System.out.println("Enter your name");
   int t=n*fare;
   String nm=s.next();
  System.out.println("*****************JAMNAGAR-INTERCITY*****************\n   NAME :"+nm+"\n   NO. OF TICKETS:"+n+"\n   AMOUNT TO PAY:"+t+"\n   TIME:"+d+"\n **************RAJKOT RAILWAYS**************");
System.out.println("YOUR SEAT NUMBERS ARE");
 for(int z=1;z<=n;z++)
   {
      System.out.print(j);
     System.out.print(" ");
      j++;
    }
  System.out.println("PLEASE PAY AND PROCEED");
}
}
 else
{
   System.out.println("THE AMOUNT OF TICKETS ARE NOT AVAILABLA AS YOUR REQUIREMENT");
 }      
}
if(ch==3)
{
  System.out.println("CHOOSE THE DAY YOU WANT TO GO\n1.today\n2.tomorrow");
 int d1=s.nextInt();
  while(d1<1 || d1>2)
 {
	System.out.println("Invalid Input. Try again");
	d1=s.nextInt();
}
 String d;
  if(d1==1)
  {
     d="today";
  }
else
{
   d="tomorrow";
 }
System.out.println("CHOOSE THE FARE\n1.A/c FIRST CLASS - Rs1500\n2.A/c TWO TIER - Rs1000\n3.A/c THREE TIER - Rs750\n4.SLEEPER - Rs500");
fare_ch=s.nextInt();
while(fare_ch<1 || fare_ch>4)
{
	System.out.println("Invalid Input. Try again");
	fare_ch=s.nextInt();
	}
switch(fare_ch)
{
	case 1: fare=1500; 
	break;
	case 2: fare=1000; 
	break;
	case 3 : fare=750; 
	break;
	case 4 : fare=500; 
	break;
}
  

System.out.println("Enter the number of tickets you want");
  int n=s.nextInt();
   while(n<1 || n>100)
 {
	System.out.println("Invalid Input. Try again");
	n=s.nextInt();
}
    if(n<=counter)
     {
        System.out.println("Enter your age");
  int ag=s.nextInt();
   if(ag<18)
   {
         System.out.println("YOU ARE UNDERAGE, YOUR BOOKING IS CANCELLED");
     }
   else
   {
    int j=r.nextInt(100)+1;
      System.out.println("Enter your name");
    int t=n*fare;
   String nm=s.next();
  System.out.println("*****************AHMEDABAD - EXPRESS*****************\n   NAME :"+nm+"\n   NO. OF TICKETS:"+n+"\n   AMOUNT TO PAY:"+t+"\n   TIME:"+d+"\n **************RAJKOT RAILWAYS**************");
System.out.println("YOUR SEAT NUMBERS ARE");
 for(int z=1;z<=n;z++)
   {
      System.out.print(j);
     System.out.print(" ");
      j++;
    }
  System.out.println("PLEASE PAY AND PROCEED");
}
}
 else
{
   System.out.println("THE AMOUNT OF TICKETS ARE NOT AVAILABLE AS YOUR REQUIREMENT");
 }      
}
if(ch==4)
{
  System.out.println("CHOOSE THE DAY YOU WANT TO GO\n1.today\n2.tomorrow");
 int d1=s.nextInt();
  while(d1<1 || d1>2)
 {
	System.out.println("Invalid Input. Try again");
	d1=s.nextInt();
}
 String d;
  if(d1==1)
  {
     d="today";
  }
else
{
   d="tomorrow";
 }
System.out.println("CHOOSE THE FARE\n1.A/c FIRST CLASS - Rs1500\n2.A/c TWO TIER - Rs1000\n3.A/c THREE TIER - Rs750\n4.SLEEPER - Rs500");
fare_ch=s.nextInt();
while(fare_ch<1 || fare_ch>4)
{
	System.out.println("Invalid Input. Try again");
	fare_ch=s.nextInt();
	}
switch(fare_ch)
{
	case 1: fare=1500; 
	break;
	case 2: fare=1000; 
	break;
	case 3 : fare=750; 
	break;
	case 4 : fare=500; 
	break;
}
  

System.out.println("Enter the number of tickets you want");
  int n=s.nextInt();
   while(n<1 || n>100)
 {
	System.out.println("Invalid Input. Try again");
	n=s.nextInt();
}
    if(n<=counter)
     {
        System.out.println("Enter your age");
  int ag=s.nextInt();
   if(ag<18)
   {
         System.out.println("YOU ARE UNDERAGE, YOUR BOOKING IS CANCELLED");
     }
   else
   {
    int j=r.nextInt(100)+1;
      System.out.println("Enter your name");
   int t=n*fare;
   String nm=s.next();
  System.out.println("*****************AHMEDABAD-INTERCITY*****************\n   NAME :"+nm+"\n   NO. OF TICKETS:"+n+"\n   AMOUNT TO PAY:"+t+"\n   TIME:"+d+"\n **************RAJKOT RAILWAYS**************");
System.out.println("YOUR SEAT NUMBERS ARE");
 for(int z=1;z<=n;z++)
   {
      System.out.print(j);
     System.out.print(" ");
      j++;
    }
  System.out.println("PLEASE PAY AND PROCEED");
}
}
 else
{
   System.out.println("THE AMOUNT OF TICKETS ARE NOT AVAILABLA AS YOUR REQUIREMENT");
 }      
}
if(ch==5)
{
  System.out.println("CHOOSE THE DAY YOU WANT TO GO\n1.today\n2.tomorrow");
 int d1=s.nextInt();
  while(d1<1 || d1>2)
 {
	System.out.println("Invalid Input. Try again");
	d1=s.nextInt();
}
 String d;
  if(d1==1)
  {
     d="today";
  }
else
{
   d="tomorrow";
 }
System.out.println("CHOOSE THE FARE\n1.A/c FIRST CLASS - Rs1500\n2.A/c TWO TIER - Rs1000\n3.A/c THREE TIER - Rs750\n4.SLEEPER - Rs500");
fare_ch=s.nextInt();
while(fare_ch<1 || fare_ch>4)
{
	System.out.println("Invalid Input. Try again");
	fare_ch=s.nextInt();
	}
switch(fare_ch)
{
	case 1: fare=1500; 
	break;
	case 2: fare=1000; 
	break;
	case 3 : fare=750; 
	break;
	case 4 : fare=500; 
	break;
}
  

System.out.println("Enter the number of tickets you want");
  int n=s.nextInt();
   while(n<1 || n>100)
 {
	System.out.println("Invalid Input. Try again");
	n=s.nextInt();
}
    if(n<=counter)
     {
        System.out.println("Enter your age");
  int ag=s.nextInt();
   if(ag<18)
   {
         System.out.println("YOU ARE UNDERAGE, YOUR BOOKING IS CANCELLED");
     }
   else
   {
    int j=r.nextInt(100)+1;
      System.out.println("Enter your name");
    int t=n*fare;
   String nm=s.next();
  System.out.println("****************SURAT- EXPRESS*****************\n   NAME :"+nm+"\n   NO. OF TICKETS:"+n+"\n   AMOUNT TO PAY:"+t+"\n   TIME:"+d+"\n **************RAJKOT RAILWAYS**************");
System.out.println("YOUR SEAT NUMBERS ARE");
 for(int z=1;z<=n;z++)
   {
      System.out.print(j);
     System.out.print(" ");
      j++;
    }
  System.out.println("PLEASE PAY AND PROCEED");
}
}
 else
{
   System.out.println("THE AMOUNT OF TICKETS ARE NOT AVAILABLE AS YOUR REQUIREMENT");
 }      
}
if(ch==6)
{
  System.out.println("CHOOSE THE DAY YOU WANT TO GO\n1.today\n2.tomorrow");
 int d1=s.nextInt();
  while(d1<1 || d1>2)
 {
	System.out.println("Invalid Input. Try again");
	d1=s.nextInt();
}
 String d;
  if(d1==1)
  {
     d="today";
  }
else
{
   d="tomorrow";
 }
System.out.println("CHOOSE THE FARE\n1.A/c FIRST CLASS - Rs1500\n2.A/c TWO TIER - Rs1000\n3.A/c THREE TIER - Rs750\n4.SLEEPER - Rs500");
fare_ch=s.nextInt();
while(fare_ch<1 || fare_ch>4)
{
	System.out.println("Invalid Input. Try again");
	fare_ch=s.nextInt();
	}
switch(fare_ch)
{
	case 1: fare=1500; 
	break;
	case 2: fare=1000; 
	break;
	case 3 : fare=750; 
	break;
	case 4 : fare=500; 
	break;
}
  
  

System.out.println("Enter the number of tickets you want");
  int n=s.nextInt();
   while(n<1 || n>100)
 {
	System.out.println("Invalid Input. Try again");
	n=s.nextInt();
}
    if(n<=counter)
     {
        System.out.println("Enter your age");
  int ag=s.nextInt();
   if(ag<18)
   {
         System.out.println("YOU ARE UNDERAGE, YOUR BOOKING IS CANCELLED");
     }
   else
   {
   int j=r.nextInt(100)+1;
      System.out.println("Enter your name");
   int t=n*fare;
   String nm=s.next();
  System.out.println("*****************SURAT-INTERCITY*****************\n   NAME :"+nm+"\n   NO. OF TICKETS:"+n+"\n   AMOUNT TO PAY:"+t+"\n   TIME:"+d+"\n **************RAJKOT RAILWAYS**************");
System.out.println("YOUR SEAT NUMBERS ARE");
 for(int z=1;z<=n;z++)
   {
      System.out.print(j);
     System.out.print(" ");
      j++;
    }
  System.out.println("PLEASE PAY AND PROCEED");
}
}
 else
{
   System.out.println("THE AMOUNT OF TICKETS ARE NOT AVAILABLE AS YOUR REQUIREMENT");
 }      
}
if(ch==7)
{
  System.out.println("CHOOSE THE DAY YOU WANT TO GO\n1.today\n2.tomorrow");
 int d1=s.nextInt();
  while(d1<1 || d1>2)
 {
	System.out.println("Invalid Input. Try again");
	d1=s.nextInt();
}
 String d;
  if(d1==1)
  {
     d="today";
  }
else
{
   d="tomorrow";
 }
System.out.println("CHOOSE THE FARE\n1.A/c FIRST CLASS - Rs1500\n2.A/c TWO TIER - Rs1000\n3.A/c THREE TIER - Rs750\n4.SLEEPER - Rs500");
fare_ch=s.nextInt();
while(fare_ch<1 || fare_ch>4)
{
	System.out.println("Invalid Input. Try again");
	fare_ch=s.nextInt();
	}
switch(fare_ch)
{
	case 1: fare=1500; 
	break;
	case 2: fare=1000; 
	break;
	case 3 : fare=750; 
	break;
	case 4 : fare=500; 
	break;
}
  

System.out.println("Enter the number of tickets you want");
  int n=s.nextInt();
    while(n<1 || n>100)
 {
	System.out.println("Invalid Input. Try again");
	n=s.nextInt();
}
  
    if(n<=counter)
     {
        System.out.println("Enter your age");
  int ag=s.nextInt();
   if(ag<18)
   {
         System.out.println("YOU ARE UNDERAGE, YOUR BOOKING IS CANCELLED");
     }
   else
   {
    int j=r.nextInt(100)+1;
      System.out.println("Enter your name");
    int t=n*fare;
   String nm=s.next();
  System.out.println("*****************BHUJ - EXPRESS*****************\n   NAME :"+nm+"\n   NO. OF TICKETS:"+n+"\n   AMOUNT TO PAY:"+t+"\n   TIME:"+d+"\n **************RAJKOT RAILWAYS**************");
System.out.println("YOUR SEAT NUMBERS ARE");
 for(int z=1;z<=n;z++)
   {
      System.out.print(j);
     System.out.print(" ");
      j++;
    }
  System.out.println("PLEASE PAY AND PROCEED");
}
}
 else
{
   System.out.println("THE AMOUNT OF TICKETS ARE NOT AVAILABLE AS YOUR REQUIREMENT");
 }      
}
if(ch==8)
{
  System.out.println("CHOOSE THE DAY YOU WANT TO GO\n1.today\n2.tomorrow");
 int d1=s.nextInt();
   while(d1<1 || d1>2)
 {
	System.out.println("Invalid Input. Try again");
	d1=s.nextInt();
}
 String d;
  if(d1==1)
  {
     d="today";
  }
else
{
   d="tomorrow";
 }
System.out.println("CHOOSE THE FARE\n1.A/c FIRST CLASS - Rs1500\n2.A/c TWO TIER - Rs1000\n3.A/c THREE TIER - Rs750\n4.SLEEPER - Rs500");
fare_ch=s.nextInt();
while(fare_ch<1 || fare_ch>4)
{
	System.out.println("Invalid Input. Try again");
	fare_ch=s.nextInt();
	}
switch(fare_ch)
{
	case 1: fare=1500; 
	break;
	case 2: fare=1000; 
	break;
	case 3 : fare=750; 
	break;
	case 4 : fare=500; 
	break;
}
  
  

System.out.println("Enter the number of tickets you want");
  int n=s.nextInt();
     while(n<1 || n>100)
 {
	System.out.println("Invalid Input. Try again");
	n=s.nextInt();
}
    if(n<=counter)
     {
        System.out.println("Enter your age");
  int ag=s.nextInt();
   if(ag<18)
   {
         System.out.println("YOU ARE UNDERAGE, YOUR BOOKING IS CANCELLED");
     }
   else
   {
    int j=r.nextInt(100)+1;
      System.out.println("Enter your name");
    int t=n*fare;
   String nm=s.next();
  System.out.println("*****************BHUJ-INTERCITY*****************\n   NAME :"+nm+"\n   NO. OF TICKETS:"+n+"\n   AMOUNT TO PAY:"+t+"\n   TIME:"+d+"\n **************RAJKOT RAILWAYS**************");
System.out.println("YOUR SEAT NUMBERS ARE");
 for(int z=1;z<=n;z++)
   {
      System.out.print(j);
     System.out.print(" ");
      j++;
    }
  System.out.println("PLEASE PAY AND PROCEED");
}
}
 else
{
   System.out.println("THE AMOUNT OF TICKETS ARE NOT AVAILABLE AS YOUR REQUIREMENT");
 } 

}
if(ch==9)
flag=1;    
}while(flag==0);
}
}


class cancellation
{
  void cancellation1()
   {
        Scanner s=new Scanner(System.in);
 int r=1;
int a[]={1023,1024,1025,1026,1027,1028,1029,1030,1031,1032,1033,1034,1035,1036,1037,1038,1039,1040,1041,1042,1043,1044,1045,1046,1047,1048,1049,1050,1051,1052,1053,1054,1055,1056,1057,1058,1059,1060,1061,1062,1063,1064,1065,1066,1067,1068,1069,1070,1071,1072,1073};
while(r>0)
{
 System.out.println("**********************CANCELLATION COUNTER**********************\n1.CANCEL TICKET\n2.EXIT");
int ch=s.nextInt();
if(ch==1)
{

System.out.println("PLEASE ENTER THE NUMBER OF TICKETS YOU WANT TO CANCEL");
 int cn=s.nextInt();
 int b[]= new int[cn];
  int c[]= new int[cn];
System.out.println("PLEASE ENTER THE TICKET NO. OF TICKETS TO BE CANCELLED");
int i;
for(i=0;i<cn;i++)
{
  b[i]=s.nextInt();
}
int j;
int h=0;
for(j=0;j<51;j++)
 {
   for(i=0;i<cn;i++)
  {
      if(b[i]==a[j])
    {
        c[h]=b[i];
        h++;
     }
  }
 }
int flag=0;
for(i=0;i<cn;i++)
  {
       if(c[i]==0)
       {
           System.out.println("ONE OF THE TICKET NUMBER IS WRONG");
           flag++;
           break;
        }
   }
   
if(flag==1)
  {
       System.out.println("PLEASE TRY AGAIN");
   }
  else
  {
       System.out.println("DO YOU CONFIRM TO CANCEL\n1.YES\n2.NO");
     int co=s.nextInt();
         if(co==1)
       {
             System.out.println(" YOUR TICKETS HAVE BEEN CANCELLED AND YOUR TICKET NO. ARE");
           for(i=0;i<cn;i++)
            {
                System.out.print(c[i]);
               System.out.print(" ");
              }
            System.out.println("PLEASE COLLECT MONEY ON THE COUNTER AHEAD");
        }
      }
  }
if(ch==2)
{break;}
}
}
}


	class inquiry
		{
		
			void inquiry1()
			{
			
				Scanner s=new Scanner(System.in);
				Random r=new Random();
				
				
					System.out.println("\n\n\n****WELCOME TO THE RAILWAY INQUIRY****");
					System.out.println("\n****WE ARE ALWAYS THERE AT YOUR SERVICE****\n\n\n");
					System.out.println("\n***********MENU**************\n");
					System.out.println("\n\nWe have following trains available\n\n1.Jamnagar-Dwarka Express\n2.Jamnagar Intercity\n3.Ahemdabad Express\n4.Ahemdabad Intercity\n5.Surat Express\n6.Surat Intercity\n7.Bhuj Express\n8.Bhuj Intercity\n9.Exit\nEnter your choice in number\n\n\n");
					int choice=s.nextInt();
					while(choice<1 || choice>9)
					{
						System.out.println("Invalid Input...Please enter a valid number from the list");
						choice=s.nextInt();
					}
					
					
					
					
					
		if(choice==1)
					{
						
							System.out.println("You have selected Jamnagar-Dwarka Express...\nBOARDING->Rajkot\n\nTIMING->3:00pm\nFREQUENCY->Daily");
							System.out.println("**Please choose a destination**\n\n1.Jamnagar\n2.Dwarka\n3.Exit\nPlease enter your choice in number");
							
								int ch_1=s.nextInt();
								while(ch_1<1 || ch_1>3)
								{
										System.out.println("\n\nInvalid Input.\n\nPlease Enter a valid number from the menu\n");
										ch_1=s.nextInt();
								}
								if(ch_1==1)
								{
									
										System.out.println("\n\nYou have opted for Jamnagar\n\n");
										System.out.println("Select your day of travel\n\n1.Today\n2.Tomorrow\nPlease Enter your choice in number\n");
										int ch_11=s.nextInt();
										while(ch_11<1 || ch_11>2)
										{
											System.out.println("Invalid Input.Please Enter a valid number from the menu.\n\n");
											ch_11=s.nextInt();
										}
										
									
											if(ch_11==1)
											{
												System.out.println("Sorry there are no seats available for today");
												
											}
											else if(ch_11==2)
											{
												int seat_1=r.nextInt(100)+1;
												int seat_2=r.nextInt(100)+1;
												int seat_3=r.nextInt(100)+1;
												System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
												System.out.println("1.First Class AC-"+seat_1);
												System.out.println("2.AC Chair Car-"+seat_2);
												System.out.println("3.Regular Chair Car-"+seat_3);
												System.out.println("\n\n\nTickets Available now");
												
											}
											
								}	
									
								else if(ch_1==2)
								{
										
										System.out.println("\n\nYou have opted for Dwarka\n\n");
										System.out.println("Select your day of travel\n\n1.Today\n2.Tomorrow\nPlease Enter your choice in number\n");
										int ch_12=s.nextInt();
										while(ch_12<1 || ch_12>2)
										{
											System.out.println("Invalid Input.Please Enter a valid number from the menu.\n\n");
											ch_12=s.nextInt();
										}
											if(ch_12==1)
											{
												int seat_11=r.nextInt(25)+1;
												int seat_12=r.nextInt(25)+1;
												int seat_13=r.nextInt(25)+1;
												System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
												System.out.println("1.First Class AC-"+seat_11);
												System.out.println("2.AC Chair Car-"+seat_12);
												System.out.println("3.Regular Chair Car-"+seat_13);
												System.out.println("\n\nTickets will be available in the platform office before three hours of departure");
												
											}
											else if(ch_12==2)
											{
												int seat_21=r.nextInt(100)+1;
												int seat_22=r.nextInt(100)+1;
												int seat_23=r.nextInt(100)+1;
												System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
												System.out.println("1.First Class AC-"+seat_21);
												System.out.println("2.AC Chair Car-"+seat_22);
												System.out.println("3.Regular Chair Car-"+seat_23);
												System.out.println("\n\nTickets available now");
												
												
											
												
											}	
											else
											{
												System.out.println("\n\nInvalid Input.\n\nPlease Enter a valid number from the menu\n");
												ch_12=s.nextInt();
											}
								}			
														
					}
						
						
						
		else if(choice==2)
									{
										System.out.println("You have selected Jamnagar Intercity...\nBOARDING->Rajkot\n\nTIMING->5:00pm\nFREQUENCY->Daily");
										System.out.println("**Please choose a destination**\n\n1.Padadhri\n2.Dhrol\n3.Jamnagar\n4.Exit\n\nPlease enter your choice in number");
										
											int ch_2=s.nextInt();
												while(ch_2<1 || ch_2>4)
													{
														System.out.println("\n\nInvalid Input.\n\nPlease Enter a valid number from the menu\n");
														ch_2=s.nextInt();
													}
													
													if(ch_2==1)
													{
															System.out.println("\n\nYou have opted for Padadhri\n\n");
															System.out.println("Select your day of travel\n\n1.Today\n2.Tomorrow\nPlease Enter your choice in number\n");
																int ch_21=s.nextInt();
																	while(ch_21<1 || ch_21>2)
																		{
																	System.out.println("Invalid Input.Please Enter a valid number from the menu.\n\n");
																	ch_21=s.nextInt();
																			}
																			
														if(ch_21==1)
														{
																int seat_01=r.nextInt(50)+1;
																int seat_02=r.nextInt(50)+1;
																int seat_03=r.nextInt(50)+1;
																System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
																System.out.println("1.First Class AC-"+seat_01);
																System.out.println("2.AC Chair Car-"+seat_02);
																System.out.println("3.Regular Chair Car-"+seat_03);
																System.out.println("\n\nTickets will be available in the platform office before three hours of departure");
																
														}
														
														else if(ch_21==2)
														{
															int seat_001=r.nextInt(100)+1;
															int seat_002=r.nextInt(100)+1;
															int seat_003=r.nextInt(100)+1;
															System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
															System.out.println("1.First Class AC-"+seat_001);
															System.out.println("2.AC Chair Car-"+seat_002);
															System.out.println("3.Regular Chair Car-"+seat_003);
															System.out.println("\n\nTickets available now...");
														}
														
														else
														{
															System.out.println("Invalid input...Please try again");
															ch_21=s.nextInt();
														}
															
													}
													
													else if(ch_2==2)
													{
														System.out.println("\n\nYou have opted for Dhrol\n\n");
														System.out.println("Select your day of travel\n\n1.Today\n2.Tomorrow\nPlease Enter your choice in number\n");
														int ch_22=s.nextInt();
														while(ch_22<1 || ch_22>2)
														{
														System.out.println("Invalid Input.Please Enter a valid number from the menu.\n\n");
														ch_22=s.nextInt();
														}	
														
													
													
														if(ch_22==1)
														{
																int seat_a1=r.nextInt(25)+1;
																int seat_a2=r.nextInt(25)+1;
																int seat_a3=r.nextInt(25)+1;
																System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
																System.out.println("1.First Class AC-"+seat_a1);
																System.out.println("2.AC Chair Car-"+seat_a2);
																System.out.println("3.Regular Chair Car-"+seat_a3);
																System.out.println("\n\nTickets will be available in the platform office before three hours of departure");
														}
														
														else if(ch_22==2)
														{
																int seat_b1=r.nextInt(100)+1;
																int seat_b2=r.nextInt(100)+1;
																int seat_b3=r.nextInt(100)+1;
																System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
																System.out.println("1.First Class AC-"+seat_b1);
																System.out.println("2.AC Chair Car-"+seat_b2);
																System.out.println("3.Regular Chair Car-"+seat_b3);
																System.out.println("\n\nTickets available now...");
														}
														
														else
														{
															System.out.println("Invalid input...Please try again");
															ch_22=s.nextInt();
														}
													}
														else if(ch_2==3)
													{
														System.out.println("\n\nYou have opted for Jamnagar\n\n");
														System.out.println("Select your day of travel\n\n1.Today\n2.Tomorrow\nPlease Enter your choice in number\n");
														int ch_23=s.nextInt();
														while(ch_23<1 || ch_23>2)
														{
														System.out.println("Invalid Input.Please Enter a valid number from the menu.\n\n");
														ch_23=s.nextInt();
														}	
														
													
													
														if(ch_23==1)
														{
																int seat_c1=r.nextInt(25)+1;
																int seat_c2=r.nextInt(25)+1;
																int seat_c3=r.nextInt(25)+1;
																System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
																System.out.println("1.First Class AC-"+seat_c1);
																System.out.println("2.AC Chair Car-"+seat_c2);
																System.out.println("3.Regular Chair Car-"+seat_c3);
																System.out.println("\n\nTickets will be available in the platform office before three hours of departure");
														}
														
														else if(ch_23==2)
														{
																int seat_d1=r.nextInt(100)+1;
																int seat_d2=r.nextInt(100)+1;
																int seat_d3=r.nextInt(100)+1;
																System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
																System.out.println("1.First Class AC-"+seat_d1);
																System.out.println("2.AC Chair Car-"+seat_d2);
																System.out.println("3.Regular Chair Car-"+seat_d3);
																System.out.println("\n\nTickets available now...");
																
														}
														else
														{
															System.out.println("Invalid input...Please try again");
															ch_23=s.nextInt();
														}
														
													}
								
									}
									
									
		else if(choice==3)
		{		
				
							
										System.out.println("You have selected Ahemdabad Express...\nBOARDING->Rajkot\n\nTIMING->7:00am\nFREQUENCY->Thrice a week");
										System.out.println("******DESTINATION*********--->> AHEMDABAD");
										System.out.println("Select your day of travel\n\n1.Today\n2.Day after Tomorrow\nPlease Enter your choice in number\n");
										int ch_3=s.nextInt();
										while(ch_3<1 || ch_3>2)
														{
														System.out.println("Invalid Input.Please Enter a valid number from the menu.\n\n");
														ch_3=s.nextInt();
														}	
														
														
														if(ch_3==1)
														{
															    int seat_e1=r.nextInt(50)+1;
																int seat_e2=r.nextInt(50)+1;
																int seat_e3=r.nextInt(50)+1;
																System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
																System.out.println("1.First Class AC-"+seat_e1);
																System.out.println("2.AC Chair Car-"+seat_e2);
																System.out.println("3.Regular Chair Car-"+seat_e3);
																System.out.println("\n\nTickets will be available in the platform office before three hours of departure");
														}
														
														else if(ch_3==2)
														{
															int seat_f1=r.nextInt(150)+1;
															int seat_f2=r.nextInt(150)+1;
															int seat_f3=r.nextInt(150)+1;
															System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
															System.out.println("1.First Class AC-"+seat_f1);
															System.out.println("2.AC Chair Car-"+seat_f2);
															System.out.println("3.Regular Chair Car-"+seat_f3);
															System.out.println("\n\nTickets available now...");
														}
														
														
														
														else
														{
															System.out.println("Invalid input...Please try again");
															ch_3=s.nextInt();
														}
														
														

														

		}

		else if(choice==4)
		{	
											System.out.println("You have selected Ahemdabad Intercity...\nBOARDING->Rajkot\n\nTIMING->1:00pm\nFREQUENCY->Daily");
											System.out.println("**Please choose a destination**\n\n1.Chotila\n2.Limbdi\n3.Bagodra\n4.Ahemdabad\n5.Exit\n\n\nPlease enter your choice in number");
											
											int ch_4=s.nextInt();
												while(ch_4<1 || ch_4>5)
													{
														System.out.println("\n\nInvalid Input.\n\nPlease Enter a valid number from the menu\n");
														ch_4=s.nextInt();
													}
													
												if(ch_4==1)
													{
															System.out.println("\n\nYou have opted for Chotila\n\n");
															System.out.println("Select your day of travel\n\n1.Today\n2.Tomorrow\nPlease Enter your choice in number\n");
																int ch_41=s.nextInt();
																	while(ch_41<1 || ch_41>2)
																		{
																	System.out.println("Invalid Input.Please Enter a valid number from the menu.\n\n");
																	ch_41=s.nextInt();
																			}
																			
														if(ch_41==1)
														{
																int seat_g1=r.nextInt(50)+1;
																int seat_g2=r.nextInt(50)+1;
																int seat_g3=r.nextInt(50)+1;
																System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
																System.out.println("1.First Class AC-"+seat_g1);
																System.out.println("2.AC Chair Car-"+seat_g2);
																System.out.println("3.Regular Chair Car-"+seat_g3);
																System.out.println("\n\nTickets will be available in the platform office before three hours of departure");
																
														}
														
														else if(ch_41==2)
														{
															int seat_h1=r.nextInt(100)+1;
															int seat_h2=r.nextInt(100)+1;
															int seat_h3=r.nextInt(100)+1;
															System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
															System.out.println("1.First Class AC-"+seat_h1);
															System.out.println("2.AC Chair Car-"+seat_h2);
															System.out.println("3.Regular Chair Car-"+seat_h3);
															System.out.println("\n\nTickets available now...");
														}
														
														else
														{
															System.out.println("Invalid input...Please try again");
															ch_41=s.nextInt();
														}
															
													}
													
													else if(ch_4==2)
													{
														System.out.println("\n\nYou have opted for Limbdi\n\n");
														System.out.println("Select your day of travel\n\n1.Today\n2.Tomorrow\nPlease Enter your choice in number\n");
														int ch_42=s.nextInt();
														while(ch_42<1 || ch_42>2)
														{
														System.out.println("Invalid Input.Please Enter a valid number from the menu.\n\n");
														ch_42=s.nextInt();
														}	
														
													
													
														if(ch_42==1)
														{
																int seat_i1=r.nextInt(50)+1;
																int seat_i2=r.nextInt(50)+1;
																int seat_i3=r.nextInt(50)+1;
																System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
																System.out.println("1.First Class AC-"+seat_i1);
																System.out.println("2.AC Chair Car-"+seat_i2);
																System.out.println("3.Regular Chair Car-"+seat_i3);
																System.out.println("\n\nTickets will be available in the platform office before three hours of departure");
														}
														
														else if(ch_42==2)
														{
																int seat_j1=r.nextInt(100)+1;
																int seat_j2=r.nextInt(100)+1;
																int seat_j3=r.nextInt(100)+1;
																System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
																System.out.println("1.First Class AC-"+seat_j1);
																System.out.println("2.AC Chair Car-"+seat_j2);
																System.out.println("3.Regular Chair Car-"+seat_j3);
																System.out.println("\n\nTickets available now...");
														}
														
														else
														{
															System.out.println("Invalid input...Please try again");
															ch_42=s.nextInt();
														}
													}
													
													else if(ch_4==3)
													{
														System.out.println("\n\nYou have opted for Bagodra\n\n");
														System.out.println("Select your day of travel\n\n1.Today\n2.Tomorrow\nPlease Enter your choice in number\n");
														int ch_43=s.nextInt();
														while(ch_43<1 || ch_43>2)
														{
														System.out.println("Invalid Input.Please Enter a valid number from the menu.\n\n");
														ch_43=s.nextInt();
														}	
														
													
													
														if(ch_43==1)
														{
																int seat_z1=r.nextInt(15)+1;
																int seat_z2=r.nextInt(15)+1;
																int seat_z3=r.nextInt(15)+1;
																System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
																System.out.println("1.First Class AC-"+seat_z1);
																System.out.println("2.AC Chair Car-"+seat_z2);
																System.out.println("3.Regular Chair Car-"+seat_z3);
																System.out.println("\n\nTickets will be available in the platform office before three hours of departure");
														}
														
														else if(ch_43==2)
														{
																int seat_y1=r.nextInt(100)+1;
																int seat_y2=r.nextInt(100)+1;
																int seat_y3=r.nextInt(100)+1;
																System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
																System.out.println("1.First Class AC-"+seat_y1);
																System.out.println("2.AC Chair Car-"+seat_y2);
																System.out.println("3.Regular Chair Car-"+seat_y3);
																System.out.println("\n\nTickets available now...");
														}
														
														else
														{
															System.out.println("Invalid input...Please try again");
															ch_43=s.nextInt();
														}
													}
													
													
													else if(ch_4==4)
													{
														System.out.println("\n\nYou have opted for Ahemdabad\n\n");
														System.out.println("Select your day of travel\n\n1.Today\n2.Tomorrow\nPlease Enter your choice in number\n");
														int ch_44=s.nextInt();
														while(ch_44<1 || ch_44>2)
														{
														System.out.println("Invalid Input.Please Enter a valid number from the menu.\n\n");
														ch_44=s.nextInt();
														}	
														
													
													
														if(ch_44==1)
														{
																int seat_x1=r.nextInt(75)+1;
																int seat_x2=r.nextInt(75)+1;
																int seat_x3=r.nextInt(75)+1;
																System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
																System.out.println("1.First Class AC-"+seat_x1);
																System.out.println("2.AC Chair Car-"+seat_x2);
																System.out.println("3.Regular Chair Car-"+seat_x3);
																System.out.println("\n\nTickets will be available in the platform office before three hours of departure");
														}
														
														else if(ch_44==2)
														{
																int seat_w1=r.nextInt(125)+1;
																int seat_w2=r.nextInt(125)+1;
																int seat_w3=r.nextInt(125)+1;
																System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
																System.out.println("1.First Class AC-"+seat_w1);
																System.out.println("2.AC Chair Car-"+seat_w2);
																System.out.println("3.Regular Chair Car-"+seat_w3);
																System.out.println("\n\nTickets available now...");
														}
														
														else
														{
															System.out.println("Invalid input...Please try again");
															ch_44=s.nextInt();
														}
													}
													
		}
		
		
		else if(choice==5)
									{
										System.out.println("You have selected Surat Express...\nBOARDING->Rajkot\n\nTIMING->9:30pm\nFREQUENCY->Daily");
										System.out.println("**Please choose a destination**\n\n1.Ahemdabad\n2.Surat\n3.Exit\n\nPlease enter your choice in number");
										
											int ch_5=s.nextInt();
												while(ch_5<1 || ch_5>3)
													{
														System.out.println("\n\nInvalid Input.\n\nPlease Enter a valid number from the menu\n");
														ch_5=s.nextInt();
													}
													
													if(ch_5==1)
													{
															System.out.println("\n\nYou have opted for Padadhri\n\n");
															System.out.println("Select your day of travel\n\n1.Today\n2.Tomorrow\nPlease Enter your choice in number\n");
																int ch_51=s.nextInt();
																	while(ch_51<1 || ch_51>2)
																		{
																	System.out.println("Invalid Input.Please Enter a valid number from the menu.\n\n");
																	ch_51=s.nextInt();
																			}
																			
														if(ch_51==1)
														{
																int seat_v1=r.nextInt(50)+1;
																int seat_v2=r.nextInt(50)+1;
																int seat_v3=r.nextInt(50)+1;
																System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
																System.out.println("1.First Class AC-"+seat_v1);
																System.out.println("2.AC Chair Car-"+seat_v2);
																System.out.println("3.Regular Chair Car-"+seat_v3);
																System.out.println("\n\nTickets will be available in the platform office before three hours of departure");
																
														}
														
														else if(ch_51==2)
														{
															int seat_u1=r.nextInt(150)+1;
															int seat_u2=r.nextInt(150)+1;
															int seat_u3=r.nextInt(150)+1;
															System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
															System.out.println("1.First Class AC-"+seat_u1);
															System.out.println("2.AC Chair Car-"+seat_u2);
															System.out.println("3.Regular Chair Car-"+seat_u3);
															System.out.println("\n\nTickets available now...");
														}
														
														else
														{
															System.out.println("Invalid input...Please try again");
															ch_51=s.nextInt();
														}
															
													}
													
													else if(ch_5==2)
													{
														System.out.println("\n\nYou have opted for Surat\n\n");
														System.out.println("Select your day of travel\n\n1.Today\n2.Tomorrow\nPlease Enter your choice in number\n");
														int ch_52=s.nextInt();
														while(ch_52<1 || ch_52>2)
														{
														System.out.println("Invalid Input.Please Enter a valid number from the menu.\n\n");
														ch_52=s.nextInt();
														}	
														
													
													
														if(ch_52==1)
														{
																int seat_t1=r.nextInt(75)+1;
																int seat_t2=r.nextInt(75)+1;
																int seat_t3=r.nextInt(75)+1;
																System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
																System.out.println("1.First Class AC-"+seat_t1);
																System.out.println("2.AC Chair Car-"+seat_t2);
																System.out.println("3.Regular Chair Car-"+seat_t3);
																System.out.println("\n\nTickets will be available in the platform office before three hours of departure");
														}
														
														else if(ch_52==2)
														{
																int seat_s1=r.nextInt(150)+1;
																int seat_s2=r.nextInt(150)+1;
																int seat_s3=r.nextInt(150)+1;
																System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
																System.out.println("1.First Class AC-"+seat_s1);
																System.out.println("2.AC Chair Car-"+seat_s2);
																System.out.println("3.Regular Chair Car-"+seat_s3);
																System.out.println("\n\nTickets available now...");
														}
														
														else
														{
															System.out.println("Invalid input...Please try again");
															ch_52=s.nextInt();
														}
													}
														
								
									}
									
									
		else if(choice==6)
		{	
											System.out.println("You have selected Surat Intercity...\nBOARDING->Rajkot\n\nTIMING->8:30am\nFREQUENCY->Daily");
											System.out.println("**Please choose a destination**\n\n1.Chotila\n2.Limbdi\n3.Bagodra\n4.Ahemdabad\n5.Vadodra\n6.Bharuch\n7.Ankleshwar\n8.Surat\n9.Exit\n\n\nPlease enter your choice in number");
											
											int ch_6=s.nextInt();
												while(ch_6<1 || ch_6>9)
													{
														System.out.println("\n\nInvalid Input.\n\nPlease Enter a valid number from the menu\n");
														ch_6=s.nextInt();
													}
													
												if(ch_6==1)
													{
															System.out.println("\n\nYou have opted for Chotila\n\n");
															System.out.println("Select your day of travel\n\n1.Today\n2.Tomorrow\nPlease Enter your choice in number\n");
																int ch_61=s.nextInt();
																	while(ch_61<1 || ch_61>2)
																		{
																	System.out.println("Invalid Input.Please Enter a valid number from the menu.\n\n");
																	ch_61=s.nextInt();
																			}
																			
														if(ch_61==1)
														{
																int seat_aa1=r.nextInt(50)+1;
																int seat_aa2=r.nextInt(50)+1;
																int seat_aa3=r.nextInt(50)+1;
																System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
																System.out.println("1.First Class AC-"+seat_aa1);
																System.out.println("2.AC Chair Car-"+seat_aa2);
																System.out.println("3.Regular Chair Car-"+seat_aa3);
																System.out.println("\n\nTickets will be available in the platform office before three hours of departure");
																
														}
														
														else if(ch_61==2)
														{
															int seat_bb1=r.nextInt(150)+1;
															int seat_bb2=r.nextInt(150)+1;
															int seat_bb3=r.nextInt(150)+1;
															System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
															System.out.println("1.First Class AC-"+seat_bb1);
															System.out.println("2.AC Chair Car-"+seat_bb2);
															System.out.println("3.Regular Chair Car-"+seat_bb3);
															System.out.println("\n\nTickets available now...");
														}
														
														else
														{
															System.out.println("Invalid input...Please try again");
															ch_61=s.nextInt();
														}
															
													}
													
													else if(ch_6==2)
													{
														System.out.println("\n\nYou have opted for Limbdi\n\n");
														System.out.println("Select your day of travel\n\n1.Today\n2.Tomorrow\nPlease Enter your choice in number\n");
														int ch_62=s.nextInt();
														while(ch_62<1 || ch_62>2)
														{
														System.out.println("Invalid Input.Please Enter a valid number from the menu.\n\n");
														ch_62=s.nextInt();
														}	
														
													
													
														if(ch_62==1)
														{
																int seat_cc1=r.nextInt(25)+1;
																int seat_cc2=r.nextInt(25)+1;
																int seat_cc3=r.nextInt(25)+1;
																System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
																System.out.println("1.First Class AC-"+seat_cc1);
																System.out.println("2.AC Chair Car-"+seat_cc2);
																System.out.println("3.Regular Chair Car-"+seat_cc3);
																System.out.println("\n\nTickets will be available in the platform office before three hours of departure");
														}
														
														else if(ch_62==2)
														{
																int seat_dd1=r.nextInt(100)+1;
																int seat_dd2=r.nextInt(100)+1;
																int seat_dd3=r.nextInt(100)+1;
																System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
																System.out.println("1.First Class AC-"+seat_dd1);
																System.out.println("2.AC Chair Car-"+seat_dd2);
																System.out.println("3.Regular Chair Car-"+seat_dd3);
																System.out.println("\n\nTickets available now...");
														}
														
														else
														{
															System.out.println("Invalid input...Please try again");
															ch_62=s.nextInt();
														}
													}
													
													else if(ch_6==3)
													{
														System.out.println("\n\nYou have opted for Bagodra\n\n");
														System.out.println("Select your day of travel\n\n1.Today\n2.Tomorrow\nPlease Enter your choice in number\n");
														int ch_63=s.nextInt();
														while(ch_63<1 || ch_63>2)
														{
														System.out.println("Invalid Input.Please Enter a valid number from the menu.\n\n");
														ch_63=s.nextInt();
														}	
														
													
													
														if(ch_63==1)
														{
																int seat_ee1=r.nextInt(35)+1;
																int seat_ee2=r.nextInt(35)+1;
																int seat_ee3=r.nextInt(35)+1;
																System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
																System.out.println("1.First Class AC-"+seat_ee1);
																System.out.println("2.AC Chair Car-"+seat_ee2);
																System.out.println("3.Regular Chair Car-"+seat_ee3);
																System.out.println("\n\nTickets will be available in the platform office before three hours of departure");
														}
														
														else if(ch_63==2)
														{
																int seat_ff1=r.nextInt(100)+1;
																int seat_ff2=r.nextInt(100)+1;
																int seat_ff3=r.nextInt(100)+1;
																System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
																System.out.println("1.First Class AC-"+seat_ff1);
																System.out.println("2.AC Chair Car-"+seat_ff2);
																System.out.println("3.Regular Chair Car-"+seat_ff3);
																System.out.println("\n\nTickets available now...");
														}
														
														else
														{
															System.out.println("Invalid input...Please try again");
															ch_63=s.nextInt();
														}
													}
													
													
													else if(ch_6==4)
													{
														System.out.println("\n\nYou have opted for Ahemdabad\n\n");
														System.out.println("Select your day of travel\n\n1.Today\n2.Tomorrow\nPlease Enter your choice in number\n");
														int ch_64=s.nextInt();
														while(ch_64<1 || ch_64>2)
														{
														System.out.println("Invalid Input.Please Enter a valid number from the menu.\n\n");
														ch_64=s.nextInt();
														}	
														
													
													
														if(ch_64==1)
														{
																int seat_gg1=r.nextInt(75)+1;
																int seat_gg2=r.nextInt(75)+1;
																int seat_gg3=r.nextInt(75)+1;
																System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
																System.out.println("1.First Class AC-"+seat_gg1);
																System.out.println("2.AC Chair Car-"+seat_gg2);
																System.out.println("3.Regular Chair Car-"+seat_gg3);
																System.out.println("\n\nTickets will be available in the platform office before three hours of departure");
														}
														
														else if(ch_64==2)
														{
																int seat_hh1=r.nextInt(100)+1;
																int seat_hh2=r.nextInt(100)+1;
																int seat_hh3=r.nextInt(100)+1;
																System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
																System.out.println("1.First Class AC-"+seat_hh1);
																System.out.println("2.AC Chair Car-"+seat_hh2);
																System.out.println("3.Regular Chair Car-"+seat_hh3);
																System.out.println("\n\nTickets available now...");
														}
														
														else
														{
															System.out.println("Invalid input...Please try again");
															ch_64=s.nextInt();
														}
													}
													
													if(ch_6==5)
													{
															System.out.println("\n\nYou have opted for Vadodra\n\n");
															System.out.println("Select your day of travel\n\n1.Today\n2.Tomorrow\nPlease Enter your choice in number\n");
																int ch_65=s.nextInt();
																	while(ch_65<1 || ch_65>2)
																		{
																	System.out.println("Invalid Input.Please Enter a valid number from the menu.\n\n");
																	ch_65=s.nextInt();
																			}
																			
														if(ch_65==1)
														{
																int seat_ii1=r.nextInt(50)+1;
																int seat_ii2=r.nextInt(50)+1;
																int seat_ii3=r.nextInt(50)+1;
																System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
																System.out.println("1.First Class AC-"+seat_ii1);
																System.out.println("2.AC Chair Car-"+seat_ii2);
																System.out.println("3.Regular Chair Car-"+seat_ii3);
																System.out.println("\n\nTickets will be available in the platform office before three hours of departure");
																
														}
														
														else if(ch_65==2)
														{
															int seat_jj1=r.nextInt(75)+1;
															int seat_jj2=r.nextInt(75)+1;
															int seat_jj3=r.nextInt(75)+1;
															System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
															System.out.println("1.First Class AC-"+seat_jj1);
															System.out.println("2.AC Chair Car-"+seat_jj2);
															System.out.println("3.Regular Chair Car-"+seat_jj3);
															System.out.println("\n\nTickets available now...");
														}
														
														else
														{
															System.out.println("Invalid input...Please try again");
															ch_65=s.nextInt();
														}
															
													}
													
													else if(ch_6==6)
													{
														System.out.println("\n\nYou have opted for Bharuch\n\n");
														System.out.println("Select your day of travel\n\n1.Today\n2.Tomorrow\nPlease Enter your choice in number\n");
														int ch_66=s.nextInt();
														while(ch_66<1 || ch_66>2)
														{
														System.out.println("Invalid Input.Please Enter a valid number from the menu.\n\n");
														ch_66=s.nextInt();
														}	
														
													
													
														if(ch_66==1)
														{
																int seat_kk1=r.nextInt(25)+1;
																int seat_kk2=r.nextInt(25)+1;
																int seat_kk3=r.nextInt(25)+1;
																System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
																System.out.println("1.First Class AC-"+seat_kk1);
																System.out.println("2.AC Chair Car-"+seat_kk2);
																System.out.println("3.Regular Chair Car-"+seat_kk3);
																System.out.println("\n\nTickets will be available in the platform office before three hours of departure");
														}
														
														else if(ch_66==2)
														{
																int seat_ll1=r.nextInt(25)+1;
																int seat_ll2=r.nextInt(25)+1;
																int seat_ll3=r.nextInt(25)+1;
																System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
																System.out.println("1.First Class AC-"+seat_ll1);
																System.out.println("2.AC Chair Car-"+seat_ll2);
																System.out.println("3.Regular Chair Car-"+seat_ll3);
																System.out.println("\n\nTickets available now...");
														}
														
														else
														{
															System.out.println("Invalid input...Please try again");
															ch_66=s.nextInt();
														}
													}
													
													else if(ch_6==7)
													{
														System.out.println("\n\nYou have opted for Ankleshwar\n\n");
														System.out.println("Select your day of travel\n\n1.Today\n2.Tomorrow\nPlease Enter your choice in number\n");
														int ch_67=s.nextInt();
														while(ch_67<1 || ch_67>2)
														{
														System.out.println("Invalid Input.Please Enter a valid number from the menu.\n\n");
														ch_67=s.nextInt();
														}	
														
													
													
														if(ch_67==1)
														{
																int seat_mm1=r.nextInt(35)+1;
																int seat_mm2=r.nextInt(35)+1;
																int seat_mm3=r.nextInt(35)+1;
																System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
																System.out.println("1.First Class AC-"+seat_mm1);
																System.out.println("2.AC Chair Car-"+seat_mm2);
																System.out.println("3.Regular Chair Car-"+seat_mm3);
																System.out.println("\n\nTickets will be available in the platform office before three hours of departure");
														}
														
														else if(ch_67==2)
														{
																int seat_nn1=r.nextInt(100)+1;
																int seat_nn2=r.nextInt(100)+1;
																int seat_nn3=r.nextInt(100)+1;
																System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
																System.out.println("1.First Class AC-"+seat_nn1);
																System.out.println("2.AC Chair Car-"+seat_nn2);
																System.out.println("3.Regular Chair Car-"+seat_nn3);
																System.out.println("\n\nTickets available now...");
														}
														
														else
														{
															System.out.println("Invalid input...Please try again");
															ch_67=s.nextInt();
														}
													}
													
													
													else if(ch_6==8)
													{
														System.out.println("\n\nYou have opted for Surat\n\n");
														System.out.println("Select your day of travel\n\n1.Today\n2.Tomorrow\nPlease Enter your choice in number\n");
														int ch_68=s.nextInt();
														while(ch_68<1 || ch_68>2)
														{
														System.out.println("Invalid Input.Please Enter a valid number from the menu.\n\n");
														ch_68=s.nextInt();
														}	
														
													
													
														if(ch_68==1)
														{
																int seat_oo1=r.nextInt(50)+1;
																int seat_oo2=r.nextInt(50)+1;
																int seat_oo3=r.nextInt(50)+1;
																System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
																System.out.println("1.First Class AC-"+seat_oo1);
																System.out.println("2.AC Chair Car-"+seat_oo2);
																System.out.println("3.Regular Chair Car-"+seat_oo3);
																System.out.println("\n\nTickets will be available in the platform office before three hours of departure");
														}
														
														else if(ch_68==2)
														{
																int seat_pp1=r.nextInt(100)+1;
																int seat_pp2=r.nextInt(100)+1;
																int seat_pp3=r.nextInt(100)+1;
																System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
																System.out.println("1.First Class AC-"+seat_pp1);
																System.out.println("2.AC Chair Car-"+seat_pp2);
																System.out.println("3.Regular Chair Car-"+seat_pp3);
																System.out.println("\n\nTickets available now...");
														}
														
														else
														{
															System.out.println("Invalid input...Please try again");
															ch_68=s.nextInt();
														}
													}
													
		}


			if(choice==7)
					{
						
							System.out.println("You have selected Bhuj Express...\nBOARDING->Rajkot\n\nTIMING->10:30pm\nFREQUENCY->Daily");
							System.out.println("**Please choose a destination**\n\n1.Gandhidham\n2.Bhuj\n3.Exit\nPlease enter your choice in number");
							
								int ch_7=s.nextInt();
								while(ch_7<1 || ch_7>3)
								{
										System.out.println("\n\nInvalid Input.\n\nPlease Enter a valid number from the menu\n");
										ch_7=s.nextInt();
								}
								if(ch_7==1)
								{
									
										System.out.println("\n\nYou have opted for Jamnagar\n\n");
										System.out.println("Select your day of travel\n\n1.Today\n2.Tomorrow\nPlease Enter your choice in number\n");
										int ch_71=s.nextInt();
										while(ch_71<1 || ch_71>2)
										{
											System.out.println("Invalid Input.Please Enter a valid number from the menu.\n\n");
											ch_71=s.nextInt();
										}
										
									
											if(ch_71==1)
											{
												System.out.println("Sorry there are no seats available for today");
												
											}
											else if(ch_71==2)
											{
												int seat_1a=r.nextInt(100)+1;
												int seat_2a=r.nextInt(100)+1;
												int seat_3a=r.nextInt(100)+1;
												System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
												System.out.println("1.First Class AC-"+seat_1a);
												System.out.println("2.AC Chair Car-"+seat_2a);
												System.out.println("3.Regular Chair Car-"+seat_3a);
												System.out.println("\n\n\nTickets Available now");
												
											}
											
								}	
									
								else if(ch_7==2)
								{
										
										System.out.println("\n\nYou have opted for Bhuj\n\n");
										System.out.println("Select your day of travel\n\n1.Today\n2.Tomorrow\nPlease Enter your choice in number\n");
										int ch_72=s.nextInt();
										while(ch_72<1 || ch_72>2)
										{
											System.out.println("Invalid Input.Please Enter a valid number from the menu.\n\n");
											ch_72=s.nextInt();
										}
											if(ch_72==1)
											{
												int seat_11a=r.nextInt(25)+1;
												int seat_12a=r.nextInt(25)+1;
												int seat_13a=r.nextInt(25)+1;
												System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
												System.out.println("1.First Class AC-"+seat_11a);
												System.out.println("2.AC Chair Car-"+seat_12a);
												System.out.println("3.Regular Chair Car-"+seat_13a);
												System.out.println("\n\nTickets will be available in the platform office before three hours of departure");
												
											}
											else if(ch_72==2)
											{
												int seat_a21=r.nextInt(100)+1;
												int seat_a22=r.nextInt(100)+1;
												int seat_a23=r.nextInt(100)+1;
												System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
												System.out.println("1.First Class AC-"+seat_a21);
												System.out.println("2.AC Chair Car-"+seat_a22);
												System.out.println("3.Regular Chair Car-"+seat_a23);
												System.out.println("\n\nTickets available now");
												
												
											
												
											}	
											else
											{
												System.out.println("\n\nInvalid Input.\n\nPlease Enter a valid number from the menu\n");
												ch_72=s.nextInt();
											}
								}			
														
					}
					
					
					
			else if(choice==8)
		{	
											System.out.println("You have selected Bhuj Intercity...\nBOARDING->Rajkot\n\nTIMING->2:45pm\nFREQUENCY->Daily");
											System.out.println("**Please choose a destination**\n\n1.Morbi\n2.Bhachau\n3.Gandhidham\n4.Anjar\n5.Bhuj\n6.Exit\n\nPlease enter your choice in number");
											
											int ch_8=s.nextInt();
												while(ch_8<1 || ch_8>6)
													{
														System.out.println("\n\nInvalid Input.\n\nPlease Enter a valid number from the menu\n");
														ch_8=s.nextInt();
													}
													
												if(ch_8==1)
													{
															System.out.println("\n\nYou have opted for Morbi\n\n");
															System.out.println("Select your day of travel\n\n1.Today\n2.Tomorrow\nPlease Enter your choice in number\n");
																int ch_81=s.nextInt();
																	while(ch_81<1 || ch_81>2)
																		{
																	System.out.println("Invalid Input.Please Enter a valid number from the menu.\n\n");
																	ch_81=s.nextInt();
																			}
																			
														if(ch_81==1)
														{
																int seat_ga1=r.nextInt(50)+1;
																int seat_ga2=r.nextInt(50)+1;
																int seat_ga3=r.nextInt(50)+1;
																System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
																System.out.println("1.First Class AC-"+seat_ga1);
																System.out.println("2.AC Chair Car-"+seat_ga2);
																System.out.println("3.Regular Chair Car-"+seat_ga3);
																System.out.println("\n\nTickets will be available in the platform office before three hours of departure");
																
														}
														
														else if(ch_81==2)
														{
															int seat_ha1=r.nextInt(100)+1;
															int seat_ha2=r.nextInt(100)+1;
															int seat_ha3=r.nextInt(100)+1;
															System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
															System.out.println("1.First Class AC-"+seat_ha1);
															System.out.println("2.AC Chair Car-"+seat_ha2);
															System.out.println("3.Regular Chair Car-"+seat_ha3);
															System.out.println("\n\nTickets available now...");
														}
														
														else
														{
															System.out.println("Invalid input...Please try again");
															ch_81=s.nextInt();
														}
															
													}
													
													else if(ch_8==2)
													{
														System.out.println("\n\nYou have opted for Bhachau\n\n");
														System.out.println("Select your day of travel\n\n1.Today\n2.Tomorrow\nPlease Enter your choice in number\n");
														int ch_82=s.nextInt();
														while(ch_82<1 || ch_82>2)
														{
														System.out.println("Invalid Input.Please Enter a valid number from the menu.\n\n");
														ch_82=s.nextInt();
														}	
														
													
													
														if(ch_82==1)
														{
																int seat_ia1=r.nextInt(50)+1;
																int seat_ia2=r.nextInt(50)+1;
																int seat_ia3=r.nextInt(50)+1;
																System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
																System.out.println("1.First Class AC-"+seat_ia1);
																System.out.println("2.AC Chair Car-"+seat_ia2);
																System.out.println("3.Regular Chair Car-"+seat_ia3);
																System.out.println("\n\nTickets will be available in the platform office before three hours of departure");
														}
														
														else if(ch_82==2)
														{
																int seat_ja1=r.nextInt(100)+1;
																int seat_ja2=r.nextInt(100)+1;
																int seat_ja3=r.nextInt(100)+1;
																System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
																System.out.println("1.First Class AC-"+seat_ja1);
																System.out.println("2.AC Chair Car-"+seat_ja2);
																System.out.println("3.Regular Chair Car-"+seat_ja3);
																System.out.println("\n\nTickets available now...");
														}
														
														else
														{
															System.out.println("Invalid input...Please try again");
															ch_82=s.nextInt();
														}
													}
													
													else if(ch_8==3)
													{
														System.out.println("\n\nYou have opted for Gandhidham\n\n");
														System.out.println("Select your day of travel\n\n1.Today\n2.Tomorrow\nPlease Enter your choice in number\n");
														int ch_83=s.nextInt();
														while(ch_83<1 || ch_83>2)
														{
														System.out.println("Invalid Input.Please Enter a valid number from the menu.\n\n");
														ch_83=s.nextInt();
														}	
														
													
													
														if(ch_83==1)
														{
																int seat_za1=r.nextInt(15)+1;
																int seat_za2=r.nextInt(15)+1;
																int seat_za3=r.nextInt(15)+1;
																System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
																System.out.println("1.First Class AC-"+seat_za1);
																System.out.println("2.AC Chair Car-"+seat_za2);
																System.out.println("3.Regular Chair Car-"+seat_za3);
																System.out.println("\n\nTickets will be available in the platform office before three hours of departure");
														}
														
														else if(ch_83==2)
														{
																int seat_ay1=r.nextInt(100)+1;
																int seat_ay2=r.nextInt(100)+1;
																int seat_ay3=r.nextInt(100)+1;
																System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
																System.out.println("1.First Class AC-"+seat_ay1);
																System.out.println("2.AC Chair Car-"+seat_ay2);
																System.out.println("3.Regular Chair Car-"+seat_ay3);
																System.out.println("\n\nTickets available now...");
														}
														
														else
														{
															System.out.println("Invalid input...Please try again");
															ch_83=s.nextInt();
														}
													}
													
													
													else if(ch_8==4)
													{
														System.out.println("\n\nYou have opted for Anjar\n\n");
														System.out.println("Select your day of travel\n\n1.Today\n2.Tomorrow\nPlease Enter your choice in number\n");
														int ch_84=s.nextInt();
														while(ch_84<1 || ch_84>2)
														{
														System.out.println("Invalid Input.Please Enter a valid number from the menu.\n\n");
														ch_84=s.nextInt();
														}	
														
													
													
														if(ch_84==1)
														{
																int seat_xaa1=r.nextInt(75)+1;
																int seat_xaa2=r.nextInt(75)+1;
																int seat_xaa3=r.nextInt(75)+1;
																System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
																System.out.println("1.First Class AC-"+seat_xaa1);
																System.out.println("2.AC Chair Car-"+seat_xaa2);
																System.out.println("3.Regular Chair Car-"+seat_xaa3);
																System.out.println("\n\nTickets will be available in the platform office before three hours of departure");
														}
														
														else if(ch_84==2)
														{
																int seat_wa1=r.nextInt(125)+1;
																int seat_wa2=r.nextInt(125)+1;
																int seat_wa3=r.nextInt(125)+1;
																System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
																System.out.println("1.First Class AC-"+seat_wa1);
																System.out.println("2.AC Chair Car-"+seat_wa2);
																System.out.println("3.Regular Chair Car-"+seat_wa3);
																System.out.println("\n\nTickets available now...");
														}
														
														else
														{
															System.out.println("Invalid input...Please try again");
															ch_84=s.nextInt();
														}
													}
													
													else if(ch_8==5)
													{
														System.out.println("\n\nYou have opted for Bhuj\n\n");
														System.out.println("Select your day of travel\n\n1.Today\n2.Tomorrow\nPlease Enter your choice in number\n");
														int ch_85=s.nextInt();
														while(ch_85<1 || ch_85>2)
														{
														System.out.println("Invalid Input.Please Enter a valid number from the menu.\n\n");
														ch_85=s.nextInt();
														}	
														
													
													
														if(ch_85==1)
														{
																int seat_axaa1=r.nextInt(75)+1;
																int seat_axaa2=r.nextInt(75)+1;
																int seat_axaa3=r.nextInt(75)+1;
																System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
																System.out.println("1.First Class AC-"+seat_axaa1);
																System.out.println("2.AC Chair Car-"+seat_axaa2);
																System.out.println("3.Regular Chair Car-"+seat_axaa3);
																System.out.println("\n\nTickets will be available in the platform office before three hours of departure");
														}
														
														else if(ch_85==2)
														{
																int seat_awa1=r.nextInt(125)+1;
																int seat_awa2=r.nextInt(125)+1;
																int seat_awa3=r.nextInt(125)+1;
																System.out.println("\n\nTHE SEATS AVAILABLE ARE AS FOLLOWS\n\n");
																System.out.println("1.First Class AC-"+seat_awa1);
																System.out.println("2.AC Chair Car-"+seat_awa2);
																System.out.println("3.Regular Chair Car-"+seat_awa3);
																System.out.println("\n\nTickets available now...");
														}
														
														else
														{
															System.out.println("Invalid input...Please try again");
															ch_85=s.nextInt();
														}
													}
													
													
													
		}
					}
					}
					

class goods
{
        void goods1()
        {
                Scanner s=new Scanner(System.in);
                int flag=0;
				int train;
				double fare=0, total_fare;
				int flag1=0;
				int choice1=0;
               
		do{		System.out.println("Goods Delivery System");
                System.out.println("Press 1 to enter and 2 to exit");
				choice1=s.nextInt();
				while(choice1<1 || choice1>2)
				{
					System.out.println("Incorrect Input. Try again.");
					choice1=s.nextInt();
				}
			if(choice1==1)
			{
				
				System.out.println("Source Station- Rajkot");
                System.out.println("Select your destination station\n 1.Jamnagar\n2.Ahmedabad\n3.Gandhidham\n4.Surat\n5.Bhuj\n6.Dwarka");
				
                int destination=s.nextInt();
                do
                {
                if(destination>=1 && destination<=6 )
                flag=1;

                else
                {
                System.out.print("Incorrect input. Try again");
                destination=s.nextInt();
                }
                }while(flag==0);

                flag=0;
				System.out.println("Enter weight of parcel (allowed weight is only 1-50 kg");
                double weight=s.nextDouble();
                do
                {
					if(weight>=1.0 && weight<=50.0)
					flag=1;
					
					else
					{
						System.out.println("Incorrect Input. Try again");
					weight=s.nextDouble();
					}
				}while(flag==0);
				
				System.out.println("Please select your train");
				switch(destination)
				{
				
						case 1:
					{
						System.out.println("1.Jamnagar Dwarka Express\n2.Jamnagar Intercity");
						fare=200;
						train=s.nextInt();
						while(train<1 || train>2)
						{
							System.out.println("Incorrect Input. Please try again");
							train=s.nextInt();
						}
					}break;
					
					
					
						case 2:
					{
						System.out.println("1.Ahmedabad Express\n2.Ahmedabad Intercity\n3.Surat Express\n4.Surat Intercity");
						fare=500;
						train=s.nextInt();
						while(train<1 || train>4)
						{
							System.out.println("Incorrect Input. Please try again");
							train=s.nextInt();
						}
						
					}break;
					
						case 3:
					{
						System.out.println("1.Bhuj Express");
						fare=700;
						train=s.nextInt();
						while(train<1 || train>1)
						{
							System.out.println("Incorrect Input. Please try again");
							train=s.nextInt();
						}
					}break;
						
					case 4:
					{
						System.out.println("1.Surat Express\n2.Surat Intercity");
						fare=700;
						train=s.nextInt();
						while(train<1 || train>2)
						{
							System.out.println("Incorrect Input. Please try again");
							train=s.nextInt();
						}
					}break;
					
						case 5:
					{
						System.out.println("1.Bhuj Express");
						fare=800;
						train=s.nextInt();
						while(train<1 || train>1)
						{
							System.out.println("Incorrect Input. Please try again");
							train=s.nextInt();
						}
					}break;
					
						case 6:
					{
						
						System.out.println("1.Jamnagar-Dwarka Express");
						fare=500;
						train=s.nextInt();
						while(train<1 || train>1)
						{
							System.out.println("Incorrect Input. Please try again");
							train=s.nextInt();
						}
					}break;
					
				}
				total_fare=fare*weight;
				System.out.println("Your final fare will be Rs. "+total_fare);
				
				System.out.println("Confirm booking?\n Press y for yes and n for no");
				char confirm=s.next().charAt(0);
				flag=0;
				do{
				if(confirm=='y' || confirm=='Y' || confirm=='n' || confirm=='N')
				{
					flag=1;
				}
				else 
				{
					System.out.println("Incorrect Input. Try again");
					confirm=s.next().charAt(0);
				}
				}while(flag==0);
				
				if(confirm=='y' || confirm=='Y')
				{
					System.out.println("Thank you for your booking. Your booking id is");
					System.out.println("Please collect the receipt and pay at the next counter");
				}
				
				else
				{
					System.out.println("Thank You");
						
				}
			}
			else 
			{
				flag1=1;
			}
		}while(flag1==0);
	}
}
				
	class shops_and_canteens
	{
		void shops_and_canteens1()
		{
			Scanner s=new Scanner(System.in);
			int flag=0;
	do{
				System.out.println("\n\n\n*******WELCOME TO THE RAILWAY SHOPS AND CANTEENS DEPARTMENT*******\n\n\n");
			System.out.println("Choose one of the following:\n1.New Application\n2.Existing owner\n3.Exit");
			System.out.println("Enter your choice in number\n\n");
			int shop_1;
			
			int choice=s.nextInt();
			while(choice<1 || choice>3)
			{
				System.out.println("Invalid choice. Try again");
				choice=s.nextInt();
			}
			if(choice==1)
			{
				System.out.println("You have chosen to submit a new application\nFOr the following you need to provide some necessary details");
				System.out.println("\n\nEnter the name of your shop");
				String name=s.next();
				System.out.println("Enter the platform in which you prefer to book a shop\n1.Platform no.1\n2.Platform no.2\n3.Platform no.3\n4.Platform no.4");
				int area=s.nextInt();
					while(area<1 || area>4)
					{
						System.out.println("Invalid input");
						area=s.nextInt();
						}
						
				System.out.println("\n\nSelect a category for your shop:\n1.Food Stall\n2.Book Stall\n3.Miscellanous\nEnter your choice in number");
				int category=s.nextInt();
					while(category<1 || category>3)
					{
						System.out.println("Invalid input");
						category=s.nextInt();
						}
					
						
							System.out.println("Thank you for providing necessary details");
							
							if(category==1)
							{
								System.out.println("You have selected the food stall category");
								System.out.println("FOr the following category, rent of 100 square metres land will be Rs.12000");
								System.out.println("For the further processing of the same go to room no.101");
								}
							if(category==2)
							{
								System.out.println("You have selected the book stall category");
								System.out.println("For the following category, rent of 100 square metres land will be Rs.10000");
								System.out.println("For the further processing of the same go to room no.108");
								}
							if(category==3)
							{
								System.out.println("You have selected the miscellanous category");
								System.out.println("For the following category of shops, rent will be decided in the office");
								System.out.println("For the further processing of the same go to room no.114");
								}
								
								}
								
								
						if(choice==2)
						{
							System.out.println("You have chosen to update the existing application");
							
							int shop_id[]=new int[5];
							shop_id[0]=5001;
							shop_id[1]=5002;
							shop_id[2]=5003;
							shop_id[3]=5004;
							shop_id[4]=5005;
							
							
								
							System.out.println("Select one of the following:\n\n");
							System.out.println("1.Pay Rent\n2.End the contract\nEnter your choice in number");
							int ch_2=s.nextInt();
								while(ch_2<1 || ch_2>4)
								{
									System.out.println("Invalid Input");
									ch_2=s.nextInt();
								}
									
									if(ch_2==1)
									{
										System.out.println("U decided to pay the rent");
										System.out.println("Enter your shop id");
										shop_1=s.nextInt();
										while(shop_1<5000 || shop_1>5005)
										{
											System.out.println("Invalid Input. Try again");
											shop_1=s.nextInt();
										}
										
										switch(shop_1)
										{
											case 5001:	System.out.println("Your shop is a food stall");
														System.out.println("Your rent is Rs.15000");
														System.out.println("Please pay your rent and collect the receipt from the office");
														break;
														
											case 5002:	System.out.println("Your shop is a food stall");
														System.out.println("Your rent is Rs.24000");
														System.out.println("Please pay your rent and collect the receipt from the office");
														break;
														
											case 5003:	System.out.println("Your shop is a book stall");
														System.out.println("Your rent is Rs.18000");
														System.out.println("Please pay your rent and collect the receipt from the office");
														break;
														
											case 5004: System.out.println("Your shop is a food stall");
														System.out.println("Your rent is Rs.28000");
														System.out.println("Please pay your rent and collect the receipt from the office");
														break;
														
											case 5005:	System.out.println("Your shop comes under the miscellanous category");
														System.out.println("You will get the rent amount from the office adn pay your rent and collect the receipt from their itself");
														break;
										}}
									
								if(ch_2==2)
								{
										
										System.out.println("U decided to end your contract");
										System.out.println("Enter your shop id");
										shop_1=s.nextInt();
										while(shop_1<5001 || shop_1>5005)
											{
											
												System.out.println("Invalid Input. Try Again");
												shop_1=s.nextInt();
											}
											
										switch(shop_1)
											{
												case 5001: System.out.println("U decided to end your contract");
															System.out.println("Your shop is a food shop");
															System.out.println("The cancellation charge is Rs.1000");
															System.out.println("Pay the amount and collect the receipt from the office");
															break;
												
												case 5002:System.out.println("U decided to end your contract");
															System.out.println("Your shop is a food shop");
															System.out.println("The cancellation charge is Rs.1000");
															System.out.println("Pay the amount and collect the receipt from the office");
															break;
															
												case 5003:System.out.println("U decided to end your contract");
															System.out.println("Your shop is a book shop");
															System.out.println("The cancellation charge is Rs.500");
															System.out.println("Pay the amount and collect the receipt from the office");
															break;
															
												case 5004:System.out.println("U decided to end your contract");
															System.out.println("Your shop is a food shop");
															System.out.println("The cancellation charge is Rs.1000");
															System.out.println("Pay the amount and collect the receipt from the office");
															break;
												case 5005:System.out.println("Your shop lies under the miscellanous category");
														System.out.println("U may know the amount from the office and pay it and collect the receipt and pay it there itself");
														break;
														
														}}
												
							}
							
							else if(choice==3)
							flag=1;
					}while(flag==0);
							}}
							
	class job_vacancy
	{
		void job_vacancy1()
		{
		
			Scanner s=new Scanner(System.in);
			Random r= new Random();
			
			System.out.println("******WELCOME TO THE RAILWAY JOB VACANCY DEPARTMENT*******");
			System.out.println("---ENTER THE REQUIRED DETAILS TO APPLYB FOR THE JOB APPLICATION---");
			
			System.out.println("Enter your name");
				String name=s.next();
			System.out.println("Enter your qualification");
				String qual=s.next();
			System.out.println("Enter your age");
				int age=s.nextInt();
				while(age<18 || age>60)
				{
					System.out.println("Invalid Age. Please Try again");
					age=s.nextInt();
				}
			System.out.println("Select one of the following category");
				System.out.println("1.Disabled\n2.Not Disabled");
					int choice=s.nextInt();
					while(choice<1 || choice>2)
					{
						System.out.println("Invalid Choice. Please try again");
						choice=s.nextInt();
					}
					if(choice==1)
					{
						System.out.println("Disabled");
						}
					else if(choice==2)
					{
						System.out.println("Not Disabled");
					}
					
				System.out.println("Please select one of the following fields you want to apply for");
				System.out.println("1.Cleaning Department\n2.Ticket Booking\n3.Station Officer\n4.Train engine Maintenance\n5.porter Department\n\n\nPLEASE ENTER YOUR CHOICE IN NUMBERS");
				
					int choice_1=s.nextInt();
					while(choice_1<1 || choice_1>5)
					{
						System.out.println("Invalid Choice. Please Try again");
						choice_1=s.nextInt();
					}
					
					
					System.out.println("Please have a final look at the details you have submitted");
					System.out.println("\n\n\n->NAME:-"+name);
					System.out.println("->Qualification:-"+qual);
					System.out.println("->Age:-"+age);
					System.out.println("->Disabled/Not Disabled :- "+((choice==1)?"Disabled":"Not Disabled"));
					switch(choice_1)
					{
						case 1: System.out.println("->Department :- Cleaning ");
						break;
						
						case 2: System.out.println("->Department :- Ticket Booking ");
						break;
						
						case 3: System.out.println("->Department :- Station Officer ");
						break;
						
						case 4: System.out.println("->Department :- Train engine Maintenance ");
						break;
						
						case 5: System.out.println("->Department :- Porter ");
						break;
						
					}
				
				System.out.println("Vacancy");
				
				System.out.println("Pay Scale :-");
				
				switch(choice_1)
				{
					
				case 1: System.out.println("\n\nYour department is Cleaning Department. Monthly Salary can Rs.5000. ");
				break; 
			
				case 2: System.out.println("\n\nYour department is Ticket Booking. Monthly Salary can be Rs.10000. ");
				break;
			
				case 3: System.out.println("\n\nYour department is Station Officer. Monthly Salary can be Rs.25000. ");
				break;
				 
				case 4: System.out.println("\n\nYour department is Train Engine Maintenance. Monthly Salary can be Rs.20000. ");
				break;
			
				case 5: System.out.println("\n\nYour department is Porter Department. Monthly Salary can be Rs.2000. ");
				break;
				}

				int date=r.nextInt(30)+1;
				System.out.println("Your Date of interview is "+date+"th September");
				int app_id = r.nextInt(100)+50;
				System.out.println("Your Application ID is "+app_id);
				
				
			
		}
	
}				

class maintenance
{
    void maintenance1()
     {
 Scanner s=new Scanner(System.in);
int i,j=0,k=0;


	int staff_id[]=new int[10];
	staff_id[0]=1111;
	staff_id[1]=1112;
	staff_id[2]=1113;
	staff_id[3]=1114;
	staff_id[4]=1115;
	staff_id[5]=1116;
	staff_id[6]=1117;
	staff_id[7]=1118;
	staff_id[8]=1119;
	staff_id[9]=1120;
	
	int password[]=new int[10];
	password[0]=1111;
	password[1]=1112;
	password[2]=1113;
	password[3]=1114;
	password[4]=1115;
	password[5]=1116;
	password[6]=1117;
	password[7]=1118;
	password[8]=1119;
	password[9]=1120;
	


   System.out.println("Enter the staff id");
   int staff=s.nextInt();
   while(staff<1111 || staff>1120)
		{
			System.out.println("\n\nInvalid Input. Please enter valid ID");
			staff=s.nextInt();
		}
   System.out.println("Enter the password");
   int pass=s.nextInt();
	
do
{
	for(i=0;i<10;i++)
	{
		if(staff==staff_id[i])
		{
			break;
		}
	}
	if(pass==password[i])
	{
		j=1;
	}
	else 
	{
		System.out.println("Invalid Input");
		System.out.println("Please try again and enter a valid password");
		pass=s.nextInt();
	}
 } while(j!=1);
 
 j=0;
 do
 {
	if(staff==1111 || staff==1112)
{
System.out.println("***************menu***************\n1.Train maintenance\n2.Platform\n3.Railway tracks\n4.Water pipes\n5.Offices\n6.Miscellaneous Rooms\n7.exit");

System.out.println("Enter the sector number you want to access");
 
int ch=s.nextInt();

if(ch==1)
{
           System.out.println(" *********State of trains currently on the platform*********\n\n1.Jamnagar- Dwarka Express  ==> Under maintenance and repairing going on\n\n2.Ahmedabad Intercity ==> Perfect condition ready to board\n\n3.Surat Intercity ==> Maintenance on verge of completion and ready to get boarded\n\n4.Bhuj Express ==> Perfect condition and boarded tommorrow\n\nall trains fully fueled and engines and brakes are cooled for proper functioning");
}
else if(ch==2)
{ 
  System.out.println("**********State of platforms*************\n\n1. Platform 1 ==> fully functional and passengers aboarding and boarding\n\n2. Platform 2 ==> fully functional and empty\n\n3. Platform 3 ==> floor tiles repair going on  , all scheduled trains transferred to platform no.2\n\n4. Platform 4 ==> Construction of bridge is going on , estimated dead line is 3 months from now\n\n5. Platform 5 ==> fully functional and passengers aboarding and boarding\n\n All the platforms are secured by policemen guarding people");
}
else if(ch==3)
{
  System.out.println(" ***********State of railway tracks*************\n\nTrack 1 ==> fully functional and trains boarding\n\nTrack 2 ==> fully functional and trains boarding \n\nTrack 3 ==> crack found in a part and repairing going on");
}
else if(ch==4)
{
 System.out.println(" ************State of water pipelines**********\n\n1. Water pipes on platform 1 and 2 ==> Fully functional and are being used\n\n2. Water pipes on platform 3 and 4 ==> Fully functional and are being used\n\n3. Water pipes on platform 5 ==> Water Tanks are being filled so pipes are temporarily unfunctional\n\n ALL WATER PIPES ARE PERFECT IN CONDITION AND NO REPAIR IS REQUIRED");
}
else if(ch==5)
{
 System.out.println(" **********Current State of office buildings************\n\n 1.Inquiry office ==> Recently repaired and fully functional\n\n 2.Police Station ==> Some repair needed but still functional\n\n3.Platform bridges ==> Fully functional\n\n4. Police station ==> reapairing going on , temporarily transferred to other office");
}
else if(ch==6)
{
 System.out.println("**********Other departments**********\n\n1. Toilets ==> Regularly health and hygiene maintained\n\n2.Shops given on rent ==> all shops have to be maintained and repaired on their own");
}
else if(ch==7)
j=1;

else 
System.out.println("Invalid choice. Try Again");
}

 else if(staff>1112 && staff<1121)
 {
 System.out.println("***************menu***************\n1.Train maintenance\n2.Platform\n3.Railway tracks\n4.Water pipes\n5.exit");
 System.out.println("Enter the sector number you want to access");
 
 int ch1=s.nextInt();
 if(ch1==1)
{
           System.out.println(" *********State of trains currently on the platform*********\n\n1.Jamnagar- Dwarka Express  ==> Under maintenance and repairing going on\n\n2.Ahmedabad Intercity ==> Perfect condition ready to board\n\n3.Surat Intercity ==> Maintenance on verge of completion and ready to get boarded\n\n4.Bhuj Express ==> Perfect condition and boarded tommorrow\n\nall trains fully fueled and engines and brakes are cooled for proper functioning");
}
else if(ch1==2)
{ 
  System.out.println("**********State of platforms*************\n\n1. Platform 1 ==> fully functional and passengers aboarding and boarding\n\n2. Platform 2 ==> fully functional and empty\n\n3. Platform 3 ==> floor tiles repair going on  , all scheduled trains transferred to platform no.2\n\n4. Platform 4 ==> Construction of bridge is going on , estimated dead line is 3 months from now\n\n5. Platform 5 ==> fully functional and passengers aboarding and boarding\n\n All the platforms are secured by policemen guarding people");
}
else if(ch1==3)
{
  System.out.println(" ***********State of railway tracks*************\n\nTrack 1 ==> fully functional and trains boarding\n\nTrack 2 ==> fully functional and trains boarding \n\nTrack 3 ==> crack found in a part and repairing going on");
}
else if(ch1==4)
{
 System.out.println(" ************State of water pipelines**********\n\n1. Water pipes on platform 1 and 2 ==> Fully functional and are being used\n\n2. Water pipes on platform 3 and 4 ==> Fully functional and are being used\n\n3. Water pipes on platform 5 ==> Water Tanks are being filled so pipes are temporarily unfunctional\n\n ALL WATER PIPES ARE PERFECT IN CONDITION AND NO REPAIR IS REQUIRED");
}


else if(ch1==5)
j=1;
	
	
		
 
}
	
 
 
	

} while(j!=1);
  
}
}


class staff
{
	 void staff1()
	{
		Scanner s=new Scanner(System.in);
		 int staff_id[]=new int[10];
		
		staff_id[0]=1111;
		staff_id[1]=1112;
		staff_id[2]=1113;
		staff_id[3]=1114;
		staff_id[4]=1115;
		staff_id[5]=1116;
		staff_id[6]=1117;
		staff_id[7]=1118;
		staff_id[8]=1119;
		staff_id[9]=1120;
		
		int staff_leaves[]=new int[10];
		staff_leaves[0]=0;
		staff_leaves[1]=1;
		staff_leaves[2]=2;
		staff_leaves[3]=3;
		staff_leaves[4]=4;
		staff_leaves[5]=5;
		staff_leaves[6]=6;
		staff_leaves[7]=7;
		staff_leaves[8]=8;
		staff_leaves[9]=9;
		
		int staff_category[]=new int[10];
		staff_category[0]=1;
		staff_category[1]=1;	// different numbers are for different fields of work for eg. 1-Cleaning Dept.
		staff_category[2]=2;
		staff_category[3]=2;
		staff_category[4]=3;
		staff_category[5]=3;
		staff_category[6]=4;
		staff_category[7]=4;
		staff_category[8]=5;
		staff_category[9]=5;
		int choice_1;
		do
		{
		
		
		
		
		System.out.println("\n\n****MENU****\n\n");
		System.out.println("\n\n1.Apply for paid leave and check for the number of paid leaves remaining\n\n2.Display your monthly salary.\n\n3.Display net salary after deducting amount of unpaid leaves.\n\n4.Exit");
		choice_1=s.nextInt();
		while(choice_1<1 || choice_1>4)
		{
			System.out.println("\n\nInvalid Input. Please enter valid ID");
			choice_1=s.nextInt();
		}
		
		if(choice_1==4)
		{
		    break;
		}
		
		System.out.println("\n\nEnter your staff ID ");
		int temp_id=s.nextInt();
		while(temp_id<1111 || temp_id>1120)
		{
			System.out.println("\n\nInvalid Input. Please enter valid ID");
			temp_id=s.nextInt();
		}
		
		int i=0;
		for(i=0;i<10;i++)
		{
			if(temp_id==staff_id[i])
			{
				break;
			}
		}
		
		int salary=0;
		while(choice_1<1|| choice_1>4)
		{
			System.out.println("\n\nInvalid choice. Try again");
			choice_1=s.nextInt();
		}
			if(choice_1==1)
		{
			System.out.println("\n\nYou have "+staff_leaves[i]+" paid leaves remaining.");
			System.out.println("\n\nEnter the number of leaves you want");
			int temp_leaves=s.nextInt();
			while(temp_leaves<0 || temp_leaves>10)
			{
				System.out.println("\n\nYou cannot take less than 0 leaves or more than 10 leaves. Try again");
				temp_leaves=s.nextInt();
			}
			
			staff_leaves[i]=staff_leaves[i]-temp_leaves;
			
			if(staff_leaves[i]>0)
			{
				System.out.println("\n\nCollect your leave application form from below, now you have "+staff_leaves[i]+" paid leaves left. ");
				 
			}
			else 
			{
				System.out.println("\n\nCollect your leave application form from below, now you have 0 paid leaves remaining. ");
				 
			}
		}
		
		else if(choice_1==2)
		{
			if(staff_category[i]==1)
			{
				System.out.println("\n\nYour department is Cleaning Department. Monthly Salary is Rs.5000. ");
				 
			}
			else if(staff_category[i]==2)
			{
				System.out.println("\n\nYour department is Ticket Booking. Monthly Salary is Rs.10000. ");
				 
			}
			else if(staff_category[i]==3)
			{
				System.out.println("\n\nYour department is Station Officer. Monthly Salary is Rs.25000. ");
				 
			}
			else if(staff_category[i]==4)
			{
				System.out.println("\n\nYour department is Train Engine Maintenance. Monthly Salary is Rs.20000. ");
				 
			}
			else if(staff_category[i]==5)
			{
				System.out.println("\n\nYour department is Porter Department. Monthly Salary is Rs.2000. ");
				 
			}
		}
		
		
		else if (choice_1==3)
		{
				if(staff_category[i]==1)
				{
					salary=5000;
				}
				else if(staff_category[i]==2)
				{
					salary=10000;
				}
				else if(staff_category[i]==3)
				{
					salary=25000;
				}
				else if(staff_category[i]==4)
				{
					salary=20000;
				}
				else if(staff_category[i]==5)
				{
					salary=2000;
				}
				
					if(staff_leaves[i]>=0)
					{
						System.out.println("\n\nYou have no deductions, your final salary will be Rs."+salary+". ");
						 
					}
					else if(staff_leaves[i]<0)
					{
						salary=salary+(staff_leaves[i]*(salary/30));
						System.out.println("\n\nYou have taken more than the allowed paid leaves. Your salary after deduction is Rs."+salary+". ");
						 
					}
		}
		} while(choice_1!=4);
	}
}
