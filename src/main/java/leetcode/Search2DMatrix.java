package leetcode;

/**
 * Created by zgg on 2018/3/18
 * 在有序的二维矩阵中查找目标
 * https://leetcode.com/problems/search-a-2d-matrix/description/
 **/

public class Search2DMatrix {

    public static void main(String[] args) {
        int[][] array = {{1, 5, 7, 10},
                         {3, 8, 9, 11},
                         {4, 7, 12, 16},
                         {6, 9, 14, 20}};
        int target = 20;
        Search2DMatrix search2DMatrix = new Search2DMatrix();
        Boolean result = search2DMatrix.find(target, array);
        if (result) {
            System.out.println("find it !!!");
        } else {
            System.out.println("can not find it !!!");
        }
    }

    public Boolean find(int target, int[][] array) {
        if (array.length < 1 || array[0].length < 1) {
            return false;
        }
        int x = 0;
        int y = array[0].length - 1;
        while (x < array.length && y >= 0) {
            if (array[x][y] == target) {
                System.out.println(String.format("(x, y) = (%s, %s)", x+1, y+1));
                return true;
            } else if (array[x][y] > target) {
                y--;
            } else {
                x++;
            }
        }
        return false;
    }

}
