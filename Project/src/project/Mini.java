
package project;

//Mini = Day
public class Mini 
{
    private String subject;
    private String priority;
    private int numberday;
    private int startt;
    private int endt;
    
    public Mini ()
    {
        subject = "";
        priority = "";
        numberday = 0;
        startt = 0000;
        endt = 0000;
    }
    
    public Mini (String s, String p, int n, int t, int e)
    {
        subject = s;
        priority = p;
        numberday = n;
        startt = t;
        endt = e;
        
    }
    
    public void setSubject(String s)
    {
        subject = s;
    }
    
    public void setPriority(String p)
    {
        priority = p;
    }
    
    public void setNumberday(int n)
    {
        numberday = n;
    }
    
    public void setTimestart(int t)
    {
        startt = t;
    }
    public void setTimeend (int e)
    {
        endt = e;
    }
    public String getSubject()
    {
       return subject; 
    }
    
    public String getPriority()
    {
        return priority;
    }
    
    public int getNumberday()
    {
        return numberday;
        
    }
    
    public int setTimeend()
    {
        return startt;
    }
    
    public int getTimeend()
    {
        return endt;
    }
    
    public String toString ()
    {
        return String.format("Subject: %s\n %s\n \t%d  Start %d End %d", subject,priority, numberday, startt ,endt);
    }
            
}
