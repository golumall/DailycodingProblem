This problem was asked by LinkedIn.

Given a list of points, a central point, and an integer k, find the nearest k points from the central point.

For example, given the list of points [(0, 0), (5, 4), (3, 1)], the central point (1, 2), and k = 2, return [(0, 0), (3, 1)].


Solution:-



import java.util.*;
class Point
{
    int x,y;
    Point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
}

class GFG {
static void printNearestPoints(Point a[],int n,int k)
{
    TreeMap<Float,Point>hm=new TreeMap<>();
    int c=0;
    for(int i=0;i<n;i++)
    {
       float x=(float)Math.sqrt(a[i].x*a[i].x+a[i].y*a[i].y);
       hm.put(x,new Point(a[i].x,a[i].y));
    }
    System.out.print("[");
    for(Map.Entry<Float,Point>e:hm.entrySet())
    {
        if(c==k)
          break;
          Point p=e.getValue();
        System.out.print("("+p.x+","+p.y+")");
        c++;
        if(c!=k)
       System.out.print(",");  
    }
     System.out.print("]");
    
}
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Point a[]=new Point[n];
		for(int i=0;i<n;i++)
		{
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    a[i]=new Point(x,y);
		}
		int k=sc.nextInt();
		printNearestPoints(a,n,k);
	}
}





https://ide.geeksforgeeks.org/qK8jn85DPI
