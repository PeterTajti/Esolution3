package Battery;

public class Battery {

    int energylevel = 2000;

    void downloadPicture (){
        energylevel = energylevel - 10;
    }

    void playVideo (){
        energylevel = energylevel - 500;
    }

    void recharge () {
        energylevel = energylevel + 100;
    }

}
