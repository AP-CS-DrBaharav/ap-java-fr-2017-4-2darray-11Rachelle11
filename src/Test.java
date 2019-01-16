import java.util.Arrays;

public class Test
{
  public static void main(String[] args)
  {
    int[][] arr =
    {{15,  5,  9, 10},
     {12, 16, 11,  6},
     {14,  8, 13,  7}};

    System.out.println(Successors.findPosition(8, arr)); // (2, 1)
    System.out.println(Successors.findPosition(17, arr)); // null
    System.out.println();

    Position[][] succ = Successors.getSuccessorArray(arr);
    for (Position[] row : succ)
      System.out.println(Arrays.asList(row));
  }
}


/*
OUTPUT

(2,1)
null
(1,1) (1,3) (0,3) (1,2)
(2,2) null (1,0) (2,3)
(0,0) (0,2) (2,0) (2,1)
*/