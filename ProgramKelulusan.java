import java.util.Scanner;

class ProgramKelulusan {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("");
        int nilai = input.nextInt();

        if (nilai > 54) {
            String output = "Selamat! Anda lulus dengan nilai " + nilai;
            System.out.println( output );
        }

        System.out.println( "Program selesai" );
    
  }
}