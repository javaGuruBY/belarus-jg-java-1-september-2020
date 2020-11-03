package student.konstantin_adotik.lesson_5.task_15;

public class ThreeRandomNumInArray {
    public static void main(String[] args) {

        int [] randomNumberArray = new int [3];

        for (int i = 0; i < randomNumberArray.length; i++){

            randomNumberArray[i] = (int) (Math.random() * (40 + 3));

            System.out.println(randomNumberArray[i] + " / " + (randomNumberArray[i] + 1));
        }
    }

}
