    import java.io.BufferedReader;  
    import java.io.InputStreamReader;  
    public class NumberedPyramids   
    {  
        public static void main(String[] args) throws Exception   
        {  
            BufferedReader in = new BufferedReader(new InputStreamReader(System. in ));  
            System.out.print("Enter number of rows: ");  
            int rows = Integer.parseInt( in .readLine());  
            System.out.println("1-Print single numbered pyramid ?");  
            System.out.println("2-Print pyramid by adding number ?");  
            int select = Integer.parseInt( in .readLine());  
            switch (select)   
            {  
                case 1:  
                    System.out.print("Enter number you want to print as pyramid: ");  
                    int p = Integer.parseInt( in .readLine());  
                    System.out.print("Here is your pyramid: ");  
                    for (int i = 0; i <= rows; i++)   
                    {  
                        for (int j = 1; j <= i; j++)   
                        {  
                            System.out.print(p + "\t");  
                        }  
                        System.out.println("");  
                    }  
                    break;  
                case 2:  
                    System.out.print("Enter number you want to print as pyramid: ");  
                    int x = Integer.parseInt( in .readLine());  
                    System.out.print("Here is your pyramid: ");  
                    int y = 0;  
                    for (int i = 0; i <= rows; i++)   
                    {  
                        for (int j = 1; j <= i; j++)   
                        {  
                            System.out.print(y + "\t");  
                            y = y + x; // you can also make pyramids by subracting, multiplying, dividing, etc  
                        }  
                        System.out.println("");  
                    }  
                    break;  
                default:  
                    System.out.println("Wrong choice");  
            }  
        }  
    }  