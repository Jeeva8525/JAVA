package lab6;
class Media{
    void play(){
        System.out.println("Playing Media");
    }
}
class Audio extends Media{
    void play(){
        System.out.println("Playing audio file");
    }
    void adjustVolume(){
        System.out.println("Adjusting audio volume\n");
    }
}
class Video extends Media{
    void play(){
        System.out.println("Playing audio Video");
    }
    void displaySubtitles(){
        System.out.println("Displaying Subtitles\n");
    }
}
class Image extends Media{
    void play(){
        System.out.println("Playing audio Image");
    }
    void applyFilter(){
        System.out.println("Applying filter to image");
    }
}
public class mediaPlayer {
    static void processMedia(Media m){
        m.play();
        if(m instanceof Audio){
            ((Audio)m).adjustVolume();
        }
        else if(m instanceof Video){
            ((Video)m).displaySubtitles();
        }
        else if(m instanceof Image){
            ((Image)m).applyFilter();
        }
    }
    public static void main(String[] args) {
        Media m[] = new Media[]{new Audio(),new Video(),new Image()};
        for(Media t:m){
            processMedia(t);
        }
        /* Media t;
        for(int x =0 ; x<3;x++){
            t = m[x];
            processMedia(t);
        } */
    }
}

