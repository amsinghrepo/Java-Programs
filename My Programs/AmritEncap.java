class AmritEncap
{
private String tension;
private String house;
private String friend;

public String getTension()
{
return tension;
}


public String getHouse()
{
return house;
}

public String getFriend()
{
return friend;
}

public void setTension(String x)
{
tension=x;
}

public void setHouse(String y)
{
house=y;
}

public void setFriend(String z)
{
friend=z;
}

}
class HimanshuEncap
{
public static void main(String[] args)
{
AmritEncap AH=new AmritEncap();
AH.setTension("  Amrit bro in Tension and Excited");
AH.setHouse("   Amrit bro anxious to go home ");
AH.setFriend("  Don't worry bro. Stay Happy :D");
System.out.println("   Tension   " +AH.getTension());
System.out.println("    House    "+AH.getHouse());
System.out.println("     You made java very easy   "+AH.getFriend());

}

}


