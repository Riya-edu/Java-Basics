public class makeBricks {
    
    public static boolean canmakeBricks(int small, int big, int goal){
        

        if(goal<= small + big *5 && goal % 5 <= small){
            return true;
        }
        return goal <= small + big * 5 && goal % 5 <= small;
    }

    public static void main(String[] args) {
        System.out.println(canmakeBricks(3, 1, 8));
        System.out.println(canmakeBricks(3, 2, 10));
    }
}
