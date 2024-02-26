public class Print_1to100_divisible_by2and3 {
    public static void main(String[] args) {
        
        System.out.println("Numbers divisible by 2 and 3 are :");
        for (int i = 1; i<=100; i++)
        {
            if (i % 2 == 0 && i % 3 == 0)
            {
                System.out.println(i);
            }
        }
    }
    
}
