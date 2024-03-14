public class App1 {
    public static int add(int a,int b)
    {
        int c;
        c=a+b;
        return c;
    }
    public static int max(int a[])
    {
        int m=0;
        for(int i=0;i<a.length;i++)
        {
            if(m<a[i])
            {
                m=a[i];
            }
        }
        return m;
    }
    public static int[] sorting(int k[])
    {
        int temp;
        for(int i=0;i<k.length;i++)
        {
            for(int j=i+1;j<k.length;j++)
            {
                if(k[i]>k[j])
                {
                    temp=k[i];
                    k[i]=k[j];
                    k[j]=temp;

                }
            }
        }
        return k;
    }
}


