/*Create a class Candidate.

Add instance variables: String name, int rollNo.

Define a constructor: Candidate(String name, int rollNo)

Define showInfo() method to print name and rollNo.

In main(), create an object and call showInfo(). */
public class Candidate {
    String name;
    int rollNo;

    public Candidate(String name,int rollNo) {
        this.name = name;
        this.rollNo = rollNo;

    }
    void showInfo(){
        System.out.println("name of candidate: "+name);
        System.out.println("roll no. of the candidate: "+rollNo);
    }
    
    public static void main(String[] args) {
        Candidate C = new Candidate("Iva",31);
        C.showInfo();
    }
}
