package Can_Place_Flowers;

public class CanPlaceFlowerss {
    public static void main(String[] args) {
        new CanPlaceFlowerss();
    }

    public CanPlaceFlowerss() {
        int[] flowerbed = new int[]{1, 0, 0, 0, 1};
//        int[] flowerbed = new int[]{1, 0, 0, 0, 1, 0, 1};
//        int[] flowerbed = new int[]{1, 0, 1, 0, 0};
//        int[] flowerbed = new int[]{1};
        System.out.println(canPlaceFlowers(flowerbed, 1));
        System.out.println(canPlaceFlowers(flowerbed, 2));
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int flowersPlanted = 0;
        for (int flowerSpace = 0; flowerSpace < flowerbed.length; flowerSpace++) {
            boolean spaceBefore = (flowerSpace == 0 || flowerbed[flowerSpace - 1] == 0);
            boolean spaceAfter = (flowerSpace == flowerbed.length - 1 || flowerbed[flowerSpace + 1] == 0);

            if (spaceBefore && spaceAfter && flowerbed[flowerSpace] == 0){
                flowerbed[flowerSpace] = 1;
                flowersPlanted++;
            }
        }

        return flowersPlanted >= n;
    }
}
