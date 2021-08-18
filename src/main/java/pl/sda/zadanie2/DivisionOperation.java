package pl.sda.zadanie2;

public class DivisionOperation implements Operation{
    @Override
    public int calculate(int a, int b) {
        if(b == 0){
            throw new DivisionByZeroException("NIE MOŻNA DZIELIĆ PRZEZ 0");
        }

        return a/b;

    }
}
