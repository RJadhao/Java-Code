public class Eleven 
{
    public static void main(String[] args) 
    {
        int marks = 7;
        String result;

        switch (marks)
        {
            case 1:
            result = "Poor";
            break;
            
            case 2:
            result = "Poor";
            break;
            
            case 3:
            result = "Poor";
            break;
            
            case 4:
            result = "Poor";
            break;
            
            case 5:
            result = "Avarage";
            break;
            
            case 6:
            result = "Avarage";
            break;
            
            case 7:
            result = "Avarage";
            break;
            
            case 8:
            result = "Perfect";
            break;
            
            case 9:
            result = "Perfect";
            break;

            case 10:
            result = "Perfect";
            break;

            default:
            result = "Invalid Marks";
            break;
        }

        System.out.println("The Performance is "+result);
    }
}



/*


//version 2

public class Eleven {
    public static void main(String[] args) {
        int marks = 7;
        String result;

        switch (marks)
        {
            case 1,2,3,4:
            result = "Poor";
            break;
                        
            case 5,6,7:
            result = "Avarage";
            break;
            
            case 8,9,10:
            result = "Perfect";
            break;

            default:
            result = "Invalid Marks";
            break;
        }

        System.out.println("The Performance is "+result);
    }
}


 */



/*
 
//version 3

public class Eleven {
    public static void main(String[] args) {
        int marks = 7;
        String result = switch(marks) {
            case 1,2,3,4 -> "Poor";
            case 5,6,7 -> "Average";
            case 8,9,10 -> "Perfect";
            default -> "Invalid Marks";
        };
        System.out.println("The Performance is " + result);
    }
}


 */