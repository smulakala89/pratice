#leetcode problem 73 -here the challenge is use inplace , not use the extra spaces,
  #For optimal solution use the first row and first column for identifying the whether zeros are present or not 
  #youtube link  -- https://www.youtube.com/watch?v=dSxt3ZCbIqA
#created on 10/04/2024

  class SetMatrixZeroes {

  public void setZeroes(int[][] matrix) {
    boolean firstRow = false, firstCol = false;


    
    // Set markers in first row and first column
    for (int i = 0; i < matrix.length; i++)
      for (int j = 0; j < matrix[0].length; j++)
        if (matrix[i][j] == 0) {
          if (i == 0) firstRow = true;
          if (j == 0) firstCol = true;
          matrix[0][j] = 0;
          matrix[i][0] = 0;
        }

    // Replace inner matrix
    for (int i = 1; i < matrix.length; i++)
      for (int j = 1; j < matrix[0].length; j++)
        if (matrix[i][0] == 0 || matrix[0][j] == 0)
          matrix[i][j] = 0;

    // Last remaining checks
    if (firstRow)
      for (int j = 0; j < matrix[0].length; j++)
        matrix[0][j] = 0;

    if (firstCol)
      for (int i = 0; i < matrix.length; i++)
        matrix[i][0] = 0;
  }
}
  
  
