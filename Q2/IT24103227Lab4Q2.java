import java.util.Scanner;

public class IT24103227Lab4Q2 
{
       public static void main(String[] args) 
       {
       

       Scanner input = new Scanner(System.in);

       double exMarks,labSub,markPre,labPre,finMark,totPres;



       System.out.print("Enter your exams marks:");


       exMarks = input.nextDouble();


       if (exMarks > 100 || exMarks < 0)
       {


      System.out.print("Invalid Input for exam marks .Terminating program..");

      return;
      }

      System.out.print("Please enter the lab submission marks (out of 100):");

      labSub = input.nextDouble();


      if ( labSub > 100 || labSub <0)
      {

      System.out.print("Invalid Input for exam marks. Terminating program..");

      return;
      }


      System.out.print("Please enter the percentage given for the exam:");

      markPre = input.nextDouble();

      System.out.print("Please enter the percentage given for the exam:");

      labPre = input.nextDouble();


      if (markPre >100 || markPre <0 )
      {

       System.out.print("The precentage must add ip to 100. Terminating the program..");

       return;
       }


      if (labPre > 100 || labPre < 0 )
      {

      System.out.print("The precentage must a dd ip to 100.Terminating the program..");

      return;
      }


      totPres = markPre + labPre;


      if (totPres > 100 || totPres < 0)
      {

      System.out.print("The percentage must add ip to 100.Terminating the program..") ;

      return;
      }


      finMark = (exMarks * markPre / 100) + ( labSub *labPre / 100);


     System.out.print("Final exam mark is : " + finMark);



    }
   }

  
 


