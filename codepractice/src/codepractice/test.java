package codepractice;

public class test {

	
	
	
	
		public static void main(String[] ars)
		{
			String[] s=new String[10];
			s[0]="01";s[1]="02";s[2]="03";s[3]="04";s[4]="05";
			s[5]="06";s[6]="07";s[7]="08";s[8]="09";s[9]="10";
			String[] s1=new String[10];
			String[] s2=new String[10];
			for (int i=0;i<s.length ;i++ )
			{
				while (i>=0)
				{
					if (i%2==0)
			        {
					    s[i]=s1[i];
			        }
				}
				for (int j=0;j<s1.length ;j++ )
			    {
			        System.out.println(s1[j]);
			    }
				
			}
			for (int i=0;i<s.length ;i++ )
			{
				while (i>=0)
				{
					if (i%2==1)
			        {
					    s[i]=s2[i];
			        }
				}
				for (int k=0;k<s2.length ;k++ )
			    {
			        System.out.println(s2[k]);
			    }
				
			}
			
			}
	}
	//Output:


