public class Grades {
    private int [] grades;
    private int size;



    public Grades() {
        this.grades = new int [10];
        this.size = 0;

    }

    public void add(int value){
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int getLastAddedGrade() {
        if(this.size > 0){
        int lastAddedGrade = this.grades[this.size - 1];
        return  lastAddedGrade; }
        else
            System.out.println("Liczba dodanych ocen wynosi:  ");
            return 0;
    }

    public double averageGrade(){

         double sum = 0;

        for (int i = 0; i < this.size ; i++) {

            sum += grades[i];

        }
        return sum / this.size;

    }

    public static void main(String[] args) {
        Grades grades = new Grades();
       // grades.add(1);
        double grade = grades.averageGrade();

        System.out.println(grades.getLastAddedGrade());
    }
}

