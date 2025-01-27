package com.learning;

public class Arrays {

    public static void main(String[] args) {
        int age = 10;
        //creating array and init at the same time
        int[] ages = {10, 20, 30, 40, 50}; // 5, No, No
            //         0   1   2   3   4
        System.out.println(ages[2]);
        System.out.println(ages[0]);
        //System.out.println(ages[50]);
        String[] months = {"Jan", "Feb","...", "Dec"};

        String[] names = new String[5]; // 5 - 1 = 4
        // {"Mohit", "Karan", "Aman", "Vishal", "Arun"}

        //adding value to the array
        names[0] = "Mohit";
        names[1] = "Karan";
        names[2] = "Aman";
        names[3] = "Vishal";
        names[4] = "Arun";

        String aman = names[2];
        System.out.println(aman);
        //names[10] = "Not worked";
        System.out.println("=====================");
        //basic for loop
        for(int i = 0; i < names.length; i++) {
            //i = 0, 1, 2, 3, 4
            System.out.println(names[i]); // names[0], names[1], ..., names[4]
        }
        System.out.println("=====================");
        for(int i = names.length - 1; i >= 0; i-- ) {
            //i = 4, 3, 2, 1, 0
            System.out.println(names[i]); //names[4], names[3], ..., names[0]
        }

        // {"Mohit", "Karan", "Aman", "Vishal", "Arun"}
        // Change the value of array at index 3
        names[3] = "Changed";

        System.out.println(searchInArray("Aman", names)); // true
        System.out.println(searchInArray("ABC", names)); // false

        updateArray(0, "Is it possible", names);
        System.out.println(names[0]); // Mohit , Is it possible
    }

    public static boolean searchInArray(String value, String[] array) {
        // {"Mohit", "Karan", "Aman", "Vishal", "Arun"}
        for(int i = 0; i < array.length; i++) {
            if( array[i].equals(value) ) { // Aman.equals(ABC)
                return true;
            }
        }
        //it will reach here if value not found
        return false;
    }

    public static void updateArray(int index, String value, String[] arr) {
        // arr = {"Mohit", "Karan", "Aman", "Vishal", "Arun"}
        String[] names = new String[arr.length]; // new String[5]
        //{_, _, _, _, _}

        //names= {"Mohit", "Karan", "Aman", "Vishal", "Arun"}

        for(int i = 0; i < arr.length; i++) { // loop over arr i = 0, 1, 2, 3, 4
            String val = arr[i]; // Karan
            names[i] = val;
            //names[i] = arr[i]; above two lines can be clubbed in single statement

            //names[0] = "Mohit" i = 0
            //names[1] = "Karan" i = 1
            //names[2] = "Aman"
            //...

            //names[i] = arr[i]; // copying the value from arr to names array
            //i = 0 names[0] = "Mohit"
            //i = 1 names[1] = "Karan"
        }

        arr[index] = value; // ???
    }
}
