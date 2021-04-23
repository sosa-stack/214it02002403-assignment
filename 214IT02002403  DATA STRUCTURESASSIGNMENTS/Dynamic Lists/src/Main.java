public class DynamicArrayExample1
{
    private int array[];
    private int count;
    private int sizeofarray;
    //creating a constructor of the class that initializes the values
    public DynamicArrayExample1()
    {
        array = new int[1];
        count = 0;
        sizeofarray = 1;
    }
    //creating a function that appends an element at the end of the array
    public void addElement(int a)
    {
//compares if the number of elements is equal to the size of the array or not
        if (count == sizeofarray)
        {
//invoking the growSize() method that creates an array of double size
            growSize();
        }
//appens an element at the end of the array
        array[count] = a;
        count++;
    }
    //function that creates an array of double size
    public void growSize()
    {
//declares a temp[] array
        int temp[] = null;
        if (count == sizeofarray)
        {
//initialize a double size array of array
            temp = new int[sizeofarray * 2];
            {
                for (int i = 0; i < sizeofarray; i++)
                {
//copies all the elements of the old array
                    temp[i] = array[i];
                }
            }
        }
        array = temp;
        sizeofarray= sizeofarray * 2;
    }
    //creating a function that deletes an element at the specified index
    public void addElementAt(int index, int a)
    {
//compare the size with the number of elements if not equal grows the array size
        if (count == sizeofarray)
        {
//invoking growSize() method
            growSize();
        }
        for (int i = count - 1; i >= index; i--)
        {
//shifting all the elements to the left from the specified index
            array[i + 1] = array[i];
        }
//inserts an element at the specified index
        array[index] = a;
        count++;
    }
    public static void main(String[] args)
    {
        DynamicArrayExample1 da = new DynamicArrayExample1();
//adding elements to the array
        da.addElement(12);
        da.addElement(22);
        da.addElement(35);
        da.addElement(47);
        da.addElement(85);
        da.addElement(26);
        da.addElement(70);
        da.addElement(81);
        da.addElement(96);
        da.addElement(54);
        System.out.println("Elements of the array:");
//iterate over the array for accessing the elements
        for (int i = 0; i < da.sizeofarray; i++)
        {
            System.out.print(da.array[i] + " ");
        }
        System.out.println();
//determines and prints the size and number of elements of the array
        System.out.println("Size public class DynamicArrayExample1  \n" +
                "{   \n" +
                "private int array[];   \n" +
                "private int count;   \n" +
                "private int sizeofarray;   \n" +
                "//creating a constructor of the class that initializes the values  \n" +
                "public DynamicArrayExample1()   \n" +
                "{   \n" +
                "array = new int[1];   \n" +
                "count = 0;   \n" +
                "sizeofarray = 1;   \n" +
                "}   \n" +
                "//creating a function that appends an element at the end of the array  \n" +
                "public void addElement(int a)   \n" +
                "{   \n" +
                "//compares if the number of elements is equal to the size of the array or not  \n" +
                "if (count == sizeofarray)   \n" +
                "{   \n" +
                "//invoking the growSize() method that creates an array of double size      \n" +
                "growSize();   \n" +
                "}   \n" +
                "//appens an element at the end of the array   \n" +
                "array[count] = a;   \n" +
                "count++;   \n" +
                "}   \n" +
                "//function that creates an array of double size  \n" +
                "public void growSize()   \n" +
                "{   \n" +
                "//declares a temp[] array      \n" +
                "int temp[] = null;   \n" +
                "if (count == sizeofarray)   \n" +
                "{   \n" +
                "//initialize a double size array of array  \n" +
                "temp = new int[sizeofarray * 2];   \n" +
                "{   \n" +
                "for (int i = 0; i < sizeofarray; i++)   \n" +
                "{   \n" +
                "//copies all the elements of the old array  \n" +
                "temp[i] = array[i];   \n" +
                "}   \n" +
                "}   \n" +
                "}   \n" +
                "array = temp;   \n" +
                "sizeofarray= sizeofarray * 2;   \n" +
                "}   \n" +
                "//creating a function that deletes an element at the specified index  \n" +
                "public void addElementAt(int index, int a)   \n" +
                "{   \n" +
                "//compare the size with the number of elements if not equal grows the array size  \n" +
                "if (count == sizeofarray)   \n" +
                "{   \n" +
                "//invoking growSize() method  \n" +
                "growSize();   \n" +
                "}   \n" +
                "for (int i = count - 1; i >= index; i--)   \n" +
                "{   \n" +
                "//shifting all the elements to the left from the specified index  \n" +
                "array[i + 1] = array[i];   \n" +
                "}   \n" +
                "//inserts an element at the specified index  \n" +
                "array[index] = a;   \n" +
                "count++;   \n" +
                "}   \n" +
                "public static void main(String[] args)   \n" +
                "{   \n" +
                "DynamicArrayExample1 da = new DynamicArrayExample1();   \n" +
                "//adding elements to the array  \n" +
                "da.addElement(12);   \n" +
                "da.addElement(22);   \n" +
                "da.addElement(35);   \n" +
                "da.addElement(47);   \n" +
                "da.addElement(85);   \n" +
                "da.addElement(26);   \n" +
                "da.addElement(70);   \n" +
                "da.addElement(81);   \n" +
                "da.addElement(96);   \n" +
                "da.addElement(54);  \n" +
                "System.out.println(\"Elements of the array:\");   \n" +
                "//iterate over the array for accessing the elements  \n" +
                "for (int i = 0; i < da.sizeofarray; i++)   \n" +
                "{   \n" +
                "System.out.print(da.array[i] + \" \");   \n" +
                "}   \n" +
                "System.out.println();   \n" +
                "//determines and prints the size and number of elements of the array  \n" +
                "System.out.println(\"Size of the array: \" + da.sizeofarray);   \n" +
                "System.out.println(\"No. of elements in the array: \" + da.count);  \n" +
                "//invoking the method to add an element at the specified index  \n" +
                "da.addElementAt(5, 99); //where 5 is the index number and 99 is the element to be add  \n" +
                "System.out.println(\"\\nElements of the array after adding an element at index 5:\");   \n" +
                "//iterate over the array for accessing the elements after adding the element at index 5  \n" +
                "for (int i = 0; i < da.sizeofarray; i++)   \n" +
                "{   \n" +
                "System.out.print(da.array[i] + \" \");   \n" +
                "}   \n" +
                "System.out.println();   \n" +
                "//determines and prints the size and number of elements of the array  \n" +
                "System.out.println(\"Size of the array: \" + da.sizeofarray);   \n" +
                "System.out.println(\"No. of elements in the array: \" + da.count);   \n" +
                "}  \n" +
                "}  of the array: " + da.sizeofarray);
        System.out.println("No. of elements in the array: " + da.count);
//invoking the method to add an element at the specified index
        da.addElementAt(5, 99); //where 5 is the index number and 99 is the element to be add
        System.out.println("\nElements of the array after adding an element at index 5:");
//iterate over the array for accessing the elements after adding the element at index 5
        for (int i = 0; i < da.sizeofarray; i++)
        {
            System.out.print(da.array[i] + " ");
        }
        System.out.println();
//determines and prints the size and number of elements of the array
        System.out.println("Size of the array: " + da.sizeofarray);
        System.out.println("No. of elements in the array: " + da.count);
    }
}