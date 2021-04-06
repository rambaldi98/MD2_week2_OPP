public class Boom {

        public static void main(String[] args) {
            char[][] arr = {
                    {'*', '.', '.', '.'},
                    {'.', '*', '.', '.'},
                    {'*', '.', '.', '.'},
                    {'*', '.', '.', '.'}
            };
            char[][] newArr = mineSweeper(arr);
            for (int i = 0; i < newArr.length; i++) {
                for (int j = 0; j < newArr[i].length; j++) {
                    System.out.print(newArr[i][j] + " ");
                }
                System.out.println();
            }
        }


        static char[][] mineSweeper(char[][] arr) {
            int[][] direction = {
                    {1, 1}, {1, 0}, {1, -1},
                    {0, 1}, {0, -1},
                    {-1, -1}, {-1, 0}, {-1, 1}};
            char[][] newArr = new char[arr.length][arr[0].length];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] == '*') {
                        newArr[i][j] = '*';
                        continue;
                    }
                    int count = 0;
                    for (int k = 0; k < direction.length; k++) {
                        if (    i + direction[k][0] >= 0 &&
                                i + direction[k][0] < arr.length &&
                                j + direction[k][1] >= 0 &&
                                j + direction[k][1] < arr[i].length) {
                            if (arr[i + direction[k][0]][j + direction[k][1]] == '*') count += 1;
                        }
                    }
                    newArr[i][j] = (char) (count + 48);
                }
            }
            return newArr;
        }
    }

