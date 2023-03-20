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
        return this.grades[this.size - 1];
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
        grades.add(1);
        grades.add(2);
        grades.add(8);

        double grade = grades.averageGrade();
        System.out.println(grade);
    }
}

