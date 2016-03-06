public class Game
{
  private int[][] table;
  public Game()
  {
   table = new int [3][3];
   for (int r = 0; r < table.length; r++)
    for (int c = 0; c < table[r].length; c++)
      table[r][c] = 0;
  }
  public void printTable()
  {
    for (int r = 0; r < table.length; r++)
    {
     for (int c = 0; c < table[r].length; c++)
        System.out.print(table[r][c] + " ");
      System.out.println();
    }

  }
  public void player1Turn(int r, int c)
  {
    if (table[r][c] == 0)
      table[r][c] = 1;
  }
  public void player2Turn(int r, int c)
  {
    if (table[r][c] == 0)
      table[r][c] = 2;
  }
  public boolean checkFull()
  {
    for (int r = 0; r < table.length; r++)
    {
     for (int c = 0; c < table[r].length; c++)
       {
         if (table [r][c] == 0)
          return false;
       }
    }
    return true;
  }
  public boolean checkTicTacToe1() {
      for(int i = 0; i < 2;i++) {
          if(table[i][0] == 1 && table[i][1] == 1 && table[i][2] == 1) {
              return true;
          }
          if(table[0][i] == 1 && table[1][i] == 1 && table[2][i] == 1) {
              return true;
          }
      }
      if(table[0][0] == 1 && table[1][1] == 1 && table[2][2] == 1) {
          return true;
      }
      if(table[0][2] == 1 && table[1][1] == 1 && table[0][2] == 1) {
          return true;
      }
      return false;
  }
    public boolean checkTicTacToe2() {
      for(int i = 0; i < 2;i++) {
          if(table[i][0] == 2 && table[i][1] == 2 && table[i][2] == 2) {
              return true;
          }
          if(table[0][i] == 2 && table[1][i] == 2 && table[2][i] == 2) {
              return true;
          }
      }
      if(table[0][0] == 2 && table[1][1] == 2 && table[2][2] == 2) {
          return true;
      }
      if(table[0][2] == 1 && table[1][1] == 2 && table[0][2] == 2) {
          return true;
      }
      return false;
  }
}
