public class Calculate
{
    String[] names;
    int[] scores;
    int[] annualSalary;
    double bonus;
    double total;

    public Calculate(String[] newName,int[] newScores,int[] newAnnualSalary)
    {
        names=newName;
        scores=newScores;
        annualSalary=newAnnualSalary;
    }

    public void totalBonus()
    {   System.out.println("Names  Scores  AnnualSalary     Bonus   Total");
        System.out.println("----------------------------------------------------");
        for (int i = 0; i < scores.length; i++) 
        {
            switch(scores[i])
            {
                case 4: bonus=annualSalary[i]*0.03;
                        total=annualSalary[i]+bonus;
                        break;

                case 3: bonus=annualSalary[i]*0.01;
                        total=annualSalary[i]+bonus;
                        break;

                default: bonus=0;
                         total=annualSalary[i]+bonus;
                         break;

            }
            System.out.printf("%s\t%d\t%d\t\t%.0f\t%.0f",names[i],scores[i],annualSalary[i],bonus,total);
            System.out.println();
                        
        }
    }
}