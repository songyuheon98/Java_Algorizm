public class PlayGame{
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    private int count = 0;

    public int[] getRandNumArr() {
        return randNumArr;
    }

    public void setRandNumArr(int[] randNumArr) {
        this.randNumArr = randNumArr;
    }

    private int[] randNumArr;
    public void playGame(int randomNumLen){
        RandomNum rn = new RandomNum();
        StringToIntArray si = new StringToIntArray();
        CheckResult cr = new CheckResult();
        randNumArr = rn.random(randomNumLen);

        while(true){
            System.out.print(count + "번째 시도 : ");

            int [] user=si.stringToIntArray(randomNumLen);

            if(cr.checkResult(user, randNumArr)==1)
                break;

            count++;
        }
        System.out.println(count+"번만에 맞히셨습니다.");
        System.out.println("게임을 종료합니다.");
    }
}
