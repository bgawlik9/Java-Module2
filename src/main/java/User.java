public class User {

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }



    public static void main(String[] args) {

        User user1 = new User("Andrew", 70);
        User user2 = new User("John", 40);
        User user3 = new User("Karen", 30);
        User user4 = new User("Jessica", 20);
        User[] users = new User[]{user1, user2, user3, user4};



        int sum = 0;
        for (int i = 0; i < users.length; i++) {
            sum += users[i].age;
        }

        int average;
        average = sum/users.length;
        System.out.println(average);


        for (int i = 0; i < users.length; i++) {
            if (users[i].age < average){
            System.out.println(users[i].name);
            }
        }




    }
}
