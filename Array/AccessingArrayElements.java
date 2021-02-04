public class AccessingArrayElements
{
    public static void main(String[] aregs)
    {
            // create an array
            int[] age = {12, 4, 5};

        //METHOD 1
            // access each array elements
            System.out.println("Accessing Elements of Array:");
            System.out.println("First Element : " + age[0]);
            System.out.println("Second Element: " + age[1]);
            System.out.println("Third Element: " + age[2]);


        //METHOD 2
            // for loop through the array
            System.out.println("Using for Loop:");
            for(int i = 0; i < age.length; i++) {
                System.out.println(age[i]);
            }

        //METHOD 3
            // for-each loop through the array
            System.out.println("Using for-each Loop:");
            for(int a : age) {
                System.out.println(a);
            }

    }
}
