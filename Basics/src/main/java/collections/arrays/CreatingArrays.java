package collections.arrays;

import java.util.Scanner;

public class CreatingArrays {
    /* TYPES OF ARRAYS
    1. int[] arrNum;
    2. String[] arrString;
    3. NameOfObj[] arrObj;
     */

    private int[] arrNum;
    private int[] arrNum2;
    private int[] arrNum3;

    private TestObjForCreatingArrays[] objList;
    private int counter;

    //----------Constructor----------//
    CreatingArrays(int arraySizeOfArrNum3, int arraySizeOfObjList) {
        arrNum = new int[5];
        arrNum2 = new int[]{2, 4, 7, 19, 2};
        arrNum3 = new int[arraySizeOfArrNum3];
        objList = new TestObjForCreatingArrays[arraySizeOfObjList];
        counter = 0;
    }



    //----------Main Method----------//
    public static void main(String[] args) {
        CreatingArrays example = new CreatingArrays(10, 5);
        example.createObjListManually();
        example.createObjListWithForLoop();
        example.createObjAndAddingPerson();
        example.createObjAndAddingPerson();

    }

    //----------Other Methods----------//
    public void createObjListManually() {
        objList = new TestObjForCreatingArrays[5];
        objList[0] = new TestObjForCreatingArrays("Brad", "Not Pitt", 70);
        objList[1] = new TestObjForCreatingArrays("Daniel", "Lehmann", 35);
        objList[2] = new TestObjForCreatingArrays("Beki", "Kohai", 56);
        objList[3] = new TestObjForCreatingArrays("Manuel", "Genshin", 44);
        objList[4] = new TestObjForCreatingArrays("Syl", "Deva", 30);

        for (int i = 0; i < objList.length; i++) {
            System.out.println("ArrPos: " + i + " "+objList[i].toString());
        }
    }

    public void createObjListWithForLoop() {
        for (int i = 0; i < objList.length; i++) {
            objList[i] = new TestObjForCreatingArrays();
            System.out.println("arrPost: " + i + " Name: " + objList[i].getName());
        }
    }

    private void createObjAndAddingPerson() {
        Scanner in = new Scanner(System.in);
        String name;
        String surname;
        int age;

        if (counter <= objList.length) {
            System.out.print("name: ");
            name = in.next();
            System.out.print("surname: ");
            surname = in.next();
            System.out.print("age: ");
            age = in.nextInt();
            objList[counter] = new TestObjForCreatingArrays(name, surname, age);
            System.out.println("arrPos: "+counter+" "+objList[counter].toString());
            counter++;
        } else {
            System.out.println("Array full");
        }


    }


}
