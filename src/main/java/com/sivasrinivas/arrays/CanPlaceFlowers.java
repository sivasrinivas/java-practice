package com.sivasrinivas.arrays;

class CanPlaceFlowers {

    public static void main(String[] args) {
        int[] flowerbed = new int[]{1,0,0,0,0,1};
        System.out.println(canPlaceFlowers(flowerbed, 2));
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length==1 && flowerbed[0]==0) {
            return n<=1;
        }

        for(int i=1; i<flowerbed.length; i++) {
            if(flowerbed[i-1] == 0 && flowerbed[i]==0 && (i+1 < n ? flowerbed[i+1] == 0 : true)) {
                n--;
                i++;
            }
        }
        return n<=0;
    }
}