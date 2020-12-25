import java.util.Scanner;

class HitungAngkaGanjil {
  public static void main(String[] args) {
    Scanner f = new Scanner(System.in);
    int jumlah = 0;
    int[]A = new int[5];
    try{
      for(int i=0; i<A.length;i++) {
      A[i]=f.nextInt();
      if(A[i]%2!=0) {
        
        jumlah++;
      }
      }
      System.out.println(jumlah);
    }catch(Exception e){
      System.out.print(0);
    }
  }
}