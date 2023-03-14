// G:\My Drive\LEARNING\FUNiX\6_CSD201x_02-A_VN-Algorithm\Exercises

public class Main {
    public static void main(String[] args) {

        Queen t = new Queen();
        t.init();
        t.test(0);
        System.out.println();
    }
}

/* PSEUDOCODE 1:
Input: N queen, N board
Output: display all combinations of N queen positions (column positions array with index corresponding to row position)

conditions: rows, columns and diagonals = false

base case: all N queens put to N rows (starting row > N) => return

recursive case:
test(N, i) (i: starting row; i = 1 => push 1)
Repeat check column j from 1 to N
    1. set (x[i])
	2. If i satisfy conditions,
	    a. set the corresponding rows, columns and diagonals
	    b. if i == N,
	            display it
	       else
                i. recursively call test with the next row test(N, ++i)   (push)
                ii. back a row (i--)                               (pop)
        c. reset the corresponding rows, columns and diagonals
*/

//---------------------------------------------

/* PSEUDOCODE 2:
Input: N queen, N board
Output: display all combinations of N queen positions (column positions array with index corresponding to row position)

conditions: rows, columns and diagonals = false

base case: all N queens put to N rows (starting row == N) => return

recursive case:
test(N, i) (i: starting row; i = 0 => not push anything yet)
1. Push 1 row (i++), set result (x[i])
2. Repeat check column j from 1 to N
    If i satisfy conditions,
	    a. set the corresponding rows, columns and diagonals
	    b. if i == N,
	            display it
	       else
                recursively call test(N, i)
        c. reset the corresponding rows, columns and diagonals
3. Pop 1 row (i--)
*/