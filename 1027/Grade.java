public class Grade
{
	double score1,score2,score3;
	
	public Grade(double s1, double s2, double s3)
	{
		score1 = s1;
		score2 = s2;
		score3 = s3;
	}
	public boolean checkPass()
	{
		if(score1 > 90 || score2 > 90 || score3 > 90)
		{
			return true;
		}
		else if((score1 > 80 && score2 > 80) || (score1 > 80 && score3 > 80) || (score2 > 80 && score3 > 80))
		{
			return true;
		}
		else if(score1 > 70 && score2 > 70 && score3 > 70)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}