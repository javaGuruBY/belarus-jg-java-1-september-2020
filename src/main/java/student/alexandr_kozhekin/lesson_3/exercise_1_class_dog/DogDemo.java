package student.alexandr_kozhekin.lesson_3.exercise_1_class_dog;

public class DogDemo {
    public static void main (String[] args){
        Dog sem = new Dog("Sem");
        Dog boron = new Dog("Boron", "Black", 3);
        sem.dogVoice();
        sem.dogEat();
        sem.dogSleep();

        boron.dogVoice();
        boron.dogEat();
        boron.dogSleep();
    }
}
