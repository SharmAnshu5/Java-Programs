public class Frequency {  
  public static void main(String[] args) {  
      int [] A = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};   
      int [] B = new int [A.length];  
      int visited = -1;  
      for(int i = 0; i < A.length; i++){  
          int count = 1;  
          for(int j = i+1; j < A.length; j++){  
              if(A[i] == A[j]){  
                  count++;  
                  B[j] = visited;  
              }  
          }  
          if(B[i] != visited)  
              A[i] = count;  
        }
      System.out.println("---------------------------------------");  
      System.out.println(" Element | Frequency");  
      System.out.println("---------------------------------------");  
      for(int i = 0; i < B.length; i++){  
          if(B[i] != visited)  
              System.out.println("    " + A[i] + "    |    " + B[i]);  
      }  
      System.out.println("----------------------------------------");  
  }}  