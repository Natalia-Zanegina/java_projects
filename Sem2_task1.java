// Задача 1. Написать программу, показывающую последовательность действий для игры “Ханойская башня”.
public class Sem2_task1 {
    public static void main(String[] args) {
        int count = 3;
        towerOfHanoi(count, 'A', 'C', 'B');    
    }
    static void towerOfHanoi(int num, char from_peg, char to_peg, char helper_peg)
    {
        if (num == 1) {
            System.out.println("Перенесите диск 1 со штыря " +  from_peg + " на штырь " + to_peg);
            return;
        }
        towerOfHanoi(num - 1, from_peg, helper_peg, to_peg);
        System.out.println("Перенесите диск " + num + " со штыря " +  from_peg + " на штырь " + to_peg);
        towerOfHanoi(num - 1, helper_peg, to_peg, from_peg);
    }        
}

