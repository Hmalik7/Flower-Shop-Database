
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 * Write a description of class asd here.
 *
 * @author (your name)
 * Malik Harsh
 * @version (a version number or a date)
 */



public class FlowersDriver
{
    public static final int MAX_FLOWERS_COUNT = 50;
      public static void selectionSort(Flower[] flowers, int count) {
        //for loop//
          for (int i = 0; i < count - 1; i++) {
            int index = i;
            for (int j = i + 1; j < count; j++) {
                if (flowers[j].compareTo(flowers[index]) < 0) {
                    index = j;
                }
            }
            Flower t = flowers[i];
            flowers[i] = flowers[index];
            flowers[index] = t;
        }
    }
//This uses the other classes and prints out to the menu//
    public static void updateAlphadb(Flower[] alphaFlowers, int count) throws IOException{
        FileWriter fw = new FileWriter(new File("alphaFlowers_db.txt"));
        for (int i = 0; i < count; i++) {
            fw.append(alphaFlowers[i] + "\n");
        }
        fw.close();
    }
    
    
    public static void main(String[] args) throws IOException {
        Flower[] flowers = new Flower[MAX_FLOWERS_COUNT];
        File document = new File("./Flowers_db.txt");
        Scanner sc = new Scanner(document);
        int count = 0;

        
        while (sc.hasNext()) {
            
        //adds the variables such as ID, colors, price, size, into the array//
            String line = sc.nextLine();
            String[] flower = line.split(" ");
            flowers[count] = new Flower();
            System.out.println(line);
            if (flower.length == 1) {
                break;
            }
            flowers[count].putId(Integer.parseInt(flower[0]));
            flowers[count].putName(flower[1]);
            flowers[count].putColor(flower[2]);
            flowers[count].putSize(flower[3]);
            flowers[count].putWholesalePrice(Double.parseDouble(flower[4]));
            flowers[count].putRetailPrice(Double.parseDouble(flower[5]));
            flowers[count].putOnHand(Integer.parseInt(flower[6]));
            count++;
        }

        Flower[] alphaFlowers = flowers;
        selectionSort(alphaFlowers, count);
        updateAlphadb(alphaFlowers, count);

        int totalFlowerNameCount = 0, totalOnHand = 0;
        double totalWholesaleValue = 0, totalRetailSales = 0;
        String currName = "";
        for (int i = 0; i < count; i++) {
            totalWholesaleValue = totalWholesaleValue + alphaFlowers[i].getWholesalePrice();
            totalRetailSales = totalRetailSales + alphaFlowers[i].getRetailPrice();
            totalOnHand = totalOnHand + alphaFlowers[i].getOnHand();
            if (!(flowers[i].getName().equals(currName))) {
                currName = alphaFlowers[i].getName();
                totalFlowerNameCount++;
            }
        }

        DatabaseTotals dbtotals = new DatabaseTotals();
        dbtotals.putTotalFlowerCount(count);
        dbtotals.putTotalFlowerNameCount(totalFlowerNameCount);
        dbtotals.putTotalOnHand(totalOnHand);
        dbtotals.putTotalRetailSales(totalRetailSales);
        dbtotals.putTotalWholesaleValue(totalWholesaleValue);
   //prints the  menu layout and it also assigns an choice on the menu//
        Scanner input = new Scanner(System.in);
        boolean flag=true;
        
     
        while (flag) {
            System.out.println(
                "1) Delete Flower \n2) Add Flower \n3) Sell Flower \n4) Buy New Flower \n5)Buy More of Existing Flower \n6)Look up Flower \n0)Quit with a good bye message");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Please Enter the Flower Id you want to delelte!");
                    int id = input.nextInt();
                    boolean flag1=false;
                    int i = 0;
                    for (i = 0; i < count; i++) {
                        if (alphaFlowers[i].getId() == id) {
                            for (int j = i + 1; j < count; j++) {
                                alphaFlowers[j - 1] = alphaFlowers[j];
                            }
                            count--;
                            flag1=true;
                        }
                    }
                    if (!flag1) {
                        System.out.println("Incorrect Flower Id.");
                    } else {
                        System.out.println("Flower " + id + " was removed.");
                    }
                    break;
                case 2:
                    if (count < MAX_FLOWERS_COUNT) {
                        System.out.println("Please Enter your Flower Id.");
                        Flower f = new Flower();
                        int id1 = input.nextInt();
                        f.putId(id1);
                        input.nextLine();
                        System.out.println("Please Enter the name of the flower.");
                        String name1 = input.nextLine();
                        f.putName(name1);
                        System.out.println("Put the Flower color.");
                        String color1 = input.nextLine();
                        f.putColor(color1);
                        System.out.println("Now enter the size of the flower.");
                        String size1 = input.nextLine();
                        f.putSize(size1);
                        System.out.println("Put the wholesale price.");
                        double wsprice = input.nextDouble();
                        f.putWholesalePrice(wsprice);
                        System.out.println("Enter retail price of the flower");
                        double reprice = input.nextDouble();
                        f.putRetailPrice(reprice);
                        System.out.println("Put onhand of the flower");
                        int onhand1 = input.nextInt();
                        f.putOnHand(onhand1);
                        flowers[count++] = f;
                    }else{
                        System.out.println("The Flowers list is complete");
                    }
                    break;
                case 6: 
                    System.out.println("Enter the id of the flower you want to remove.");
                    int id2 = input.nextInt();
                    int k=0;
                    for(k=0;k<count;k++){
                        if(flowers[k].getId()==id2){
                            System.out.println(flowers[k]);
                            break;
                        }
                    }
                    if(k==count){
                        System.out.println("Flower with given id is missing ");
                    }
                    break;
                case 0:
                    flag=false;
                    alphaFlowers=flowers;
                    selectionSort(alphaFlowers, count);
                    updateAlphadb(alphaFlowers,count);
                    System.out.println("Good Bye!");
                    break;
                    //to end the program and print good bye//
            }
        }
    }

  
}
