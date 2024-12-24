public class student{
    String name;
    String year;
    double gpa;
    int id;
    public student(String n, String y, double g, int i){
        name = n;
        year = y;
        gpa = g;
        id = i;
    }

    void isHonorRoll() {
        if (this.gpa > 3.6) {
            System.out.println(this.name + " is an honor roll student with a gpa of " + this.gpa + "! ✓");
        } else {
            System.out.println(this.name + " is not an honor roll student with a gpa of " + this.gpa + "! ✗");
        }
    }

    void freeLunch(int num) {
        if (this.id == num) {
            System.out.println(this.name + " gets free lunch today. Congratulations on matching the random ID for today! ✓");
        } else {
            System.out.println(this.name + " does not get free lunch today! Better luck tomorrow on matching the random ID! ✗");
        }
    }
}