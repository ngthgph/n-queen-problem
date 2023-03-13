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
        System.out.printf("\n%3d: ", ++count);
        for (i = 1; i <= n; i++) System.out.printf("%4d", x[i]);
    }

    // Hàm thuật toán tìm nghiệm theo thuật toán quay lui
    void test(int i) {
    }
}