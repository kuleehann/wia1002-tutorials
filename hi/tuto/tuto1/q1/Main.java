package hi.tuto.tuto1.q1;

//make sure the second arg has 8 numbers lol this thing aint advanced i lazy

public class Main {
    public static void main(String[] args) {
        Telephone [] telephoneNum = new Telephone [5];
        telephoneNum[0] = new Telephone(03,1234567); //why tf did it make it an octal number if i put 0 in front
        telephoneNum[1] = new Telephone(03,1234569); //yea why
        telephoneNum[2] = new Telephone(03,1234565); //yea whyy
        telephoneNum[3] = new Telephone(03,91234567);
        telephoneNum[4] = new Telephone(03,-71234567); //uh yea i love how crazy java numbers are, way too big -ve numbers somehow becomes +ve
        for(int i = 0; i < 5; i++){
            System.out.println(telephoneNum[i].makeFullNumber());
        }
    }

}
