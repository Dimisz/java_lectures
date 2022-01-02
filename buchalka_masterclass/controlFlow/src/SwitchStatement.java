public class SwitchStatement {

    public static void main(String[] args) {
        int switchValue = 4;

        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was 3 or 4 or 5");
                System.out.println("Actually it was " + switchValue);
                break;
            default:
                System.out.println("Was neither 1 nor 2");
        }

        char myChar = 'Z';
        switch(myChar){
            case 'A':
                System.out.println("It's A");
                break;
            case 'B':
                System.out.println("It's B");
                break;
            case 'C':
                System.out.println("It's C");
                break;
            case 'D':
                System.out.println("It's D");
                break;
            case 'E':
                System.out.println("It's E");
                break;
            default:
                System.out.println("The char not found");
        }
    }
}
