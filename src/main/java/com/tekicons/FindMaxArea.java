package com.tekicons;

public class FindMaxArea {

    public static void main(String[] args) {
        // Input: height = [1,8,6,2,5,4,8,3,7]
        int[] height = {1,8,6,2,5,4,8,3,7};

        int maxHeight = 0;
        int size = height.length - 1; // 8
        int index = 0;// 1

        while (index < size) { // 1 < 8
            int h = Math.min(height[index], height[size]);// (8, 7)->7
            int w = size - index;// 7-1->6
            int area = h * w;// 1*8->8
            maxHeight = Math.max(maxHeight, area);// 8

            if(height[index] < height[size]) {// 1<7--> 1
                index++;
            } else {
                size--;
            }
        }

        System.out.println(maxHeight);
    }
}
