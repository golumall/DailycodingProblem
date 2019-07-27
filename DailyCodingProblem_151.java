Problem 151:    Given a 2-D matrix representing an image, a location of a pixel in the screen and a color C, replace the color of the given pixel and all adjacent same colored pixels with C.

For example, given the following matrix, and location pixel of (2, 2), and 'G' for green:

B B W
W W W
W W W
B B B

Solution

/*package whatever //do not write package name here */

import java.util.*;
class Point
{
    int r,c;
    Point(int r,int c)
    {
        this.r=r;
        this.c=c;
        
    }
}

class GFG {
    static void replaceColor(char a[][],int n,int m,int s,int y,char c)
    {
        boolean visited[][]=new boolean[n][m];
        Queue<Point>q =new LinkedList<Point>();
    char x=a[s-1][y-1];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(a[i][j]!=x)
                  visited[i][j]=true;
                 else
                 visited[i][j]=false;
            }
        }
        q.add(new Point(s-1,y-1));
        visited[s-1][y-1]=true;
        
        a[s-1][y-1]=c;
        while(!q.isEmpty())
        {
            Point p=q.poll();
            //Left
            if(p.c-1>=0&&visited[p.r][p.c-1]==false&&a[p.r][p.c-1]==x)
            {
                a[p.r][p.c-1]=c;
                visited[p.r][p.c-1]=true;
                q.add(new Point(p.r,p.c-1));
            }
            //Right
             if(p.c+1<m&&visited[p.r][p.c+1]==false&&a[p.r][p.c+1]==x)
            {
                a[p.r][p.c+1]=c;
                visited[p.r][p.c+1]=true;
                q.add(new Point(p.r,p.c+1));
            }
            //Up
             if(p.r-1>=0&&visited[p.r-1][p.c]==false&&a[p.r-1][p.c]==x)
            {
                a[p.r-1][p.c]=c;
                visited[p.r-1][p.c]=true;
                q.add(new Point(p.r-1,p.c));
            }
            //Down 
            if(p.r+1<n&&visited[p.r+1][p.c]==false&&a[p.r+1][p.c]==x)
            {
                a[p.r+1][p.c]=c;
                visited[p.r+1][p.c]=true;
                q.add(new Point(p.r+1,p.c));
            }
            //left-up
            if(p.r-1>=0&&p.c-1>=0&&visited[p.r-1][p.c-1]==false&&a[p.r-1][p.c-1]==x)
            {
                a[p.r-1][p.c-1]=c;
                visited[p.r-1][p.c-1]=true;
                q.add(new Point(p.r-1,p.c-1));
            }
            //right-up
            if(p.r-1>=0&&p.c+1<m&&visited[p.r-1][p.c+1]==false&&a[p.r-1][p.c+1]==x)
            {
                a[p.r-1][p.c+1]=c;
                visited[p.r-1][p.c+1]=true;
                q.add(new Point(p.r-1,p.c+1));
            }
            //bottom-left
            
            if(p.r+1<n&&p.c-1>=0&&visited[p.r+1][p.c-1]==false&&a[p.r+1][p.c-1]==x)
            {
                a[p.r+1][p.c-1]=c;
                visited[p.r+1][p.c-1]=true;
                q.add(new Point(p.r+1,p.c-1));
            }
            //bottom-right
            if(p.r+1<n&&p.c+1<m&&visited[p.r+1][p.c+1]==false&&a[p.r+1][p.c+1]==x)
            {
                a[p.r+1][p.c+1]=c;
                visited[p.r+1][p.c+1]=true;
                q.add(new Point(p.r+1,p.c+1));
            }
            
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
            System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		char a[][]=new char[n][m];
		for(int i=0;i<n;i++)
		  {
		      for(int j=0;j<m;j++)
		      {
		          a[i][j]=sc.next().charAt(0);
		      }
		  }
		  int x=sc.nextInt();
		  int y=sc.nextInt();
		  char c=sc.next().charAt(0);
		 replaceColor(a,n,m,x,y,c); 
	}
}

https://ide.geeksforgeeks.org/3vN85hwLMD
