import java.util.Random;

public class FlowersList {
    String[] flowersArr = {"Белая роза", "Красная роза", "Гербер", "Хризантема", "Тюльпан", "Лилия", "Ирис"}; //new String[nFlowers];
    int[] flowersCost = {150,125,120,145,100,250,175}; // new Double[nFlowers];

    //показать ассортимент магазина
    public void showFlowersPrices(){
        System.out.println("Ознакомьтесь с прейскурантом магазина:");
        System.out.println();
        for (int i=0; i<flowersArr.length; i++) {
            System.out.println(flowersArr[i] + ": " + flowersCost[i] + " руб.");
        }
    }

    //создать букет
    public void getFlowersList(int flowersCount){
        Random xRandom = new Random();
        String bouquet = "";
        int bouquetCost = 0;
        int flowerIndex;
        for (int i=0;i<flowersCount;i++) {
            flowerIndex = xRandom.nextInt(flowersArr.length-1);
            bouquet = bouquet + flowersArr[flowerIndex];
            bouquetCost = bouquetCost + flowersCost[flowerIndex];
            if (i < (flowersCount-1)){
                bouquet = bouquet + ", ";
            }

        }
        System.out.println();
        System.out.println("Ваш букет:  " + bouquet);
        System.out.println("стоимость букета: " + bouquetCost);
    }
}
