package collections.arrays;

public class FromTo {
    private int start;
    private int finish;
    int[] arr = new int[10];


    //----------Store and print arr pos 0 to arr pos 9 with random numbers----------//
    public void random(int MIN, int MAX){
        int random;
        for (int i=0; i<10; i++) {
            random = (int) (Math.random() * (MAX - MIN + 1) + MIN);
            System.out.println("arrPos"+i+":"+random);
        }
        System.out.println("");

    }


    //----------Store and print "start" to "finish"----------//
    public void startToFinish(int start, int finish){
        int count=0;
        for (int i = start; i <=finish; i++) {
            if(count < arr.length){
                arr[count]=i;
                System.out.println("arrPos "+count+": "+arr[count]);
                count++;
            }
        }
        System.out.println("");
    }

    //----------Store and print "start" to "finish"----------//
    //----------Also switch value when start is greater than finish----------//
    public void startToFinishEnhanced(int start, int finish){
        int count=0;
        if(start > finish){
            this.start=finish;
            this.finish=start;
        }
        else {
            this.start=start;
            this.finish=finish;
        }
        for (int i = this.start; i <=this.finish; i++) {
            if(count < arr.length){
                arr[count]=i;
                System.out.println("arrPos "+count+": "+arr[count]);
                count++;
            }
        }
        System.out.println("");
    }

    public void startToFinishEnhanced2(int start, int finish) {
        if(start > finish){
            this.start=finish;
            this.finish=start;
        }
        else {
            this.start=start;
            this.finish=finish;
        }
        int count=this.start;

        for (int i = 0; i < arr.length; i++) {
            if(count <= this.finish){
                arr[i]=count;
                count++;
                System.out.println("arrPos "+i+": "+arr[i]);
            }
            else{
                arr[i]=0;
                System.out.println("arrPos "+i+": "+arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        FromTo ex = new FromTo();


        ex.random(10,30);
        ex.startToFinish(9, 14);
        ex.startToFinishEnhanced(30, 21);
        ex.startToFinishEnhanced(5,8);
        ex.startToFinishEnhanced(4,20);
        ex.startToFinishEnhanced2(5,8);
    }


}
