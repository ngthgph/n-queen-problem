// G:\My Drive\LEARNING\FUNiX\6_CSD201x_02-A_VN-Algorithm\Exercises

public class Main {
    public static void main(String[] args) {

        Queen t = new Queen();
        t.init();
        t.test(1);
        System.out.println();
    }
}

/* PSEUDOCODE:
Input: N queen, N board
Output: display all combinations of N queen positions (column positions array with index corresponding to row position)

conditions: rows, columns and diagonals = false

base case 1: all N queens put to N rows (starting row == N) => print result, return

base case 2: no cell to put the next queen (check the conditions in rows, columns and diagonal => return

recursive case:
test(N, starting row)
1. Repeat check column i from 1 to N
	a. Put column i in result set (x[]) => set the corresponding rows, columns and diagonals
	b. If i satisfy conditions,
	    i. if i == N, display it
	    ii. else
            recursively call test with the test(N, starting row + 1)
2. Remove column from result set, reset the corresponding rows, columns and diagonals */