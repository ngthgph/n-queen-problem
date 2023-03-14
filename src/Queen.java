import java.util.Scanner;

// Lớp Queen gồm có các thuộc tính: n là số con hậu cần đặt, a là mảng kiểm tra trên các hàng,
// b và c là mảng kiểm tra trên các đường chéo. a[i]=true nếu như cột i còn trống, a[i]=false nếu cột i đã đặt 1 con hậu
class Queen {
    int n, count;
    boolean a[], b[], c[];
    int x[];
    Scanner in;

    Queen() {
        x = new int[20];
        a = new boolean[20];
        b = new boolean[40];
        c = new boolean[40];
        in = new Scanner(System.in);
    }

    //Hàm khởi tạo
    void init() {
        int i;
        System.out.print(" n = ");

        n = in.nextInt();
        count = 0;
        for (i = 1; i <= n; i++) a[i] = true;
        for (i = 1; i <= 2 * n; i++) b[i] = true;
        for (i = 1; i <= 2 * n; i++) c[i] = true;
    }

    //Hàm hiển thị phương án

    void result() {
        int i;
        System.out.println("Case " + ++count);
        for (i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (x[i] == j)
                    System.out.print(" Q ");
                else
                    System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Hàm thuật toán tìm nghiệm theo thuật toán quay lui

    // FOR PSEUDOCODE 2
    void test(int i) {
        // base case 1: all N queens put to N rows (starting row == N) => print result, return
        if(i > n) {
            return;
        }

        // Push 1 row (i++)
        i++;

        // recursive case:
        for(int j = 1; j <= n; j++) {

            x[i] = j; // set result (x[i])

            // Check if position satisfy conditions
            if(a[j] && b[i+j] && c[i-j+n-1]) {
                // set the corresponding rows, columns and diagonals
                a[j] = false; // column j has a queen;
                b[i + j] = false; // diagonal right to left (small to large)
                c[i - j + n - 1] = false; // diagonal left to right

                if (i == n)
                    result(); // if i == N, display it
                else {
                    test(i); // else recursively call test with the test(N, starting row + 1)
                }

                // reset the corresponding rows, columns and diagonals
                a[j] = true;
                b[i + j] = true;
                c[i - j + n - 1] = true;
            }
        }

        // Pop 1 row (i--)
        i--;
    }

    // FOR PSEUDOCODE 1
//    void test(int i) {
//        // base case 1: all N queens put to N rows (starting row == N) => print result, return
//        if(i > n) {
//            return;
//        }
//
//        // recursive case:
//        for(int j = 1; j <= n; j++) {
//
//            // set (x[i])
//            x[i] = j; // put a queen in position (j;i) -> (column, row)
//
//            // Check if position satisfy conditions
//            if(a[j] && b[i+j] && c[i-j+n-1]) {
//                // set the corresponding rows, columns and diagonals
//                a[j] = false; // column j has a queen;
//                b[i + j] = false; // diagonal right to left (small to large)
//                c[i - j + n - 1] = false; // diagonal left to right
//
//                if (i == n)
//                    result(); // if i == N, display it
//                else {
//                    test(++i); // else recursively call test with the test(N, starting row + 1)
//
//                    // Remove column from result set
//                    i--;
//                }
//
//                // reset the corresponding rows, columns and diagonals
//                a[j] = true;
//                b[i + j] = true;
//                c[i - j + n - 1] = true;
//            }
//        }
//    }
}