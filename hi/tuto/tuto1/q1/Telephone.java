package hi.tuto.tuto1.q1;

public class Telephone {
    private int areaCode;
    private int number;
    private static int numberOfTelephoneObject = 0;

    public Telephone(int areaCode, int number){
        this.areaCode = areaCode;
        this.number = number;
        numberOfTelephoneObject++;
    }

    public int getAreaCode(){
        return areaCode;
    }

    public int getNumber(){
        return number;
    }

    public void setAreaCode(int newAreaCode){
        areaCode = newAreaCode;
    }

    public void setNumber(int newNumber){
        number = newNumber;
    }

    public String makeFullNumber(){
        StringBuilder sb = new StringBuilder();
        if(areaCode < 10) sb.append(0);
        sb.append(areaCode + "-");
        if(number < 10000000){
            int temp = number;
            while(temp < 10000000){
                sb.append(0);
                temp*=10;
            }
        }
        sb.append(number);
        String fullNum = sb.toString();
        return fullNum;
    }
}
