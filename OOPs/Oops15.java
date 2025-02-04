package OOPs;
//15. Write a Java program to create a class called "MusicLibrary" with a collection
// of songs and methods to add and remove songs, and to play a random song.
import java.util.ArrayList;
import java.util.Random;

class song
{
    String title;
    String artist;
    public song(String title,String artist)
    {
        this.title=title;
        this.artist=artist;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }
}
class Musiclibrary
{
    private ArrayList<song> songs;
    public Musiclibrary()
    {
     songs=new ArrayList<song>();
    }
    public void addsongs(song song)
    {
        songs.add(song);
    }
    public void removsongs(song song)
    {
        songs.remove(song);
    }
    public ArrayList<song> getSongs() {

        return songs;
    }

    public void randomsong()
    {
        int size= songs.size();
        if(size==0)
            System.out.println("no songs is there");

        Random r=new Random();
        int index = r.nextInt(size);
        System.out.println("Now playing: " + songs.get(index).getTitle() + " by " + songs.get(index).getArtist());




    }
}
public class Oops15 {
    public static void main(String[] args) {
        song s=new song("hai re hai"," Ar rahman");
        song s1=new song("jai bajaranga bale","DSP");
        song s2=new song("lovely","Thaaman");
        song s3=new song("RRR theme","srinidi");
        song s4=new song("ramulo","keervani");

        Musiclibrary m=new Musiclibrary();
        m.addsongs(s);
        m.addsongs(s1);
        m.addsongs(s2);
        m.addsongs(s3);
        m.addsongs(s4);
    for(song sl:m.getSongs())
    {
        System.out.println("song "+sl.getTitle()+"  Artitst:"+sl.artist);
    }

        System.out.println();
    m.randomsong();
        System.out.println();

        m.randomsong();
        System.out.println();



    }
}
