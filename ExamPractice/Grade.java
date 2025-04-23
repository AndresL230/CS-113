public class Grade
{
    private int numGrade;
    private char letterGrade;

    public Grade(int inGrade)
    {
        numGrade = inGrade;
        if (inGrade<=65)
        {
            letterGrade = 'U';
        }
        else
        {
            letterGrade = 'S';
        }
    }

    public int getGrade()
    {
        return numGrade;
    }

    public char getLetGrade()
    {
        return letterGrade;
    }

    public void setNumGrade(int grade)
    {
        numGrade = grade;
    }

    public void setLetterGrade(char letter)
    {
        letterGrade = letter;
    }

    public String toString()
    {
        return "Score: "+numGrade+", Letter Grade: "+letterGrade;
    }

    public boolean isSatisfactory()
    {
        return letterGrade=='S';
    }

    public boolean equals(Grade otherGrade)
    {
        return letterGrade==otherGrade.getLetGrade();
    }

}