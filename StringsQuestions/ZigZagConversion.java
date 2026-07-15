package Strings;
//The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

//P   A   H   N
//A P L S I I G
//Y   I   R

//And then read line by line: "PAHNAPLSIIGYIR"

//Input: s = "PAYPALISHIRING", numRows = 3
//Output: "PAHNAPLSIIGYIR"

public class ZigZagConversion {
    static void main() {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        if (numRows == 1 || s.length() <= numRows)
            System.out.println(s);;

        StringBuilder[] rows = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {

            rows[currentRow].append(c);

            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }

            currentRow += goingDown ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();

        for (StringBuilder row : rows) {
            result.append(row);
        }

        System.out.println(result.toString());
    }
}
-----------------------------------------------------------------
//Input
s = "PAYPALISHIRING"
numRows = 3
Step 1
if (numRows == 1 || s.length() <= numRows)
    return s;

Step 2

Create an array of StringBuilders.

StringBuilder[] rows = new StringBuilder[numRows];

Initially

rows[0] = null
rows[1] = null
rows[2] = null

Step 3
for(int i=0;i<numRows;i++)
    rows[i]=new StringBuilder();

After loop

Row0 = ""
Row1 = ""
Row2 = ""

Step 4
currentRow = 0
goingDown = false

Current status

Row0 :
Row1 :
Row2 :

currentRow = 0
goingDown = false
Character 1 : P
rows[currentRow].append(c);

Append to Row0

Row0 : P
Row1 :
Row2 :

Now

if(currentRow==0 || currentRow==numRows-1)
0==0 

So

goingDown = !goingDown;
false → true

Update row

currentRow += goingDown ? 1 : -1;

Since goingDown = true

currentRow = 1
Character 2 : A

Append

Row0 : P
Row1 : A
Row2 :

Boundary?

currentRow=1

Not first
Not last

No change.

goingDown

true

Move

currentRow=2
Character 3 : Y

Append

Row0 : P
Row1 : A
Row2 : Y

Boundary?

currentRow==2

Last row - YES

Reverse direction

goingDown

true → false

Move

currentRow=1
Character 4 : P

Append

Row0 : P
Row1 : AP
Row2 : Y

Boundary?

No.

goingDown

false

Move

currentRow=0
Character 5 : A

Append

Row0 : PA
Row1 : AP
Row2 : Y

Top reached

goingDown

false → true

Move

currentRow=1
Character 6 : L

Append

Row0 : PA
Row1 : APL
Row2 : Y

Move

currentRow=2
Character 7 : I

Append

Row0 : PA
Row1 : APL
Row2 : YI

Bottom reached

goingDown

true → false

Move

currentRow=1
Character 8 : S

Append

Row0 : PA
Row1 : APLS
Row2 : YI

Move

currentRow=0
Character 9 : H

Append

Row0 : PAH
Row1 : APLS
Row2 : YI

Top reached

goingDown=true

Move

currentRow=1
Character 10 : I

Append

Row0 : PAH
Row1 : APLSI
Row2 : YI

Move

currentRow=2
Character 11 : R

Append

Row0 : PAH
Row1 : APLSI
Row2 : YIR

Bottom reached

goingDown=false

Move

currentRow=1
Character 12 : I

Append

Row0 : PAH
Row1 : APLSII
Row2 : YIR

Move

currentRow=0
Character 13 : N

Append

Row0 : PAHN
Row1 : APLSII
Row2 : YIR

Top reached

goingDown=true

Move

currentRow=1
Character 14 : G

Append

Row0 : PAHN
Row1 : APLSIIG
Row2 : YIR

Move

currentRow=2

Loop ends.

Current rows
Row0 : PAHN

Row1 : APLSIIG

Row2 : YIR
Create Result
StringBuilder result = new StringBuilder();
result = ""
First iteration

Append Row0

result = PAHN
Second iteration

Append Row1

result = PAHNAPLSIIG
Third iteration

Append Row2

result = PAHNAPLSIIGYIR
Return
return result.toString();

Output

PAHNAPLSIIGYIR    
