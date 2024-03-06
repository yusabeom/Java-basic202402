package song;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static util.Utility.FILE_PATH;

public class ArtistRepository {

    // key: 가수이름, value: Artist 객체.
    private static Map<String,Artist> artistList;

    static {
        artistList = new HashMap<>();
    }

    // 신규 가수를 map에 추가하는 기능
    public void addNewArtist(String artistName, String songName) {
        // 1. 신규 가수 정보 생성 -> Set 객체 전달
        Artist artist = new Artist(artistName, new HashSet<>());
        // 2. 생성된 노래 목록을 리턴받아서 노래 이름을 추가
        artist.getSongList().add(songName);
        // 3. 완성된 객체를 Map에 저장
        artistList.put(artistName, artist);
    }

    /**
     * 기존 가수 정보에 노래만 추가하는 기능
     * @param artistName - 사용자의 입력 가수 이름
     * @param songName - 사용자의 입력 노래 이름
     * @return - 곡명이 중복되었다면 false,
     *           곡이 정상적으로 추가되었다면 true
     */
    public boolean addNewSong(String artistName, String songName){
        // Map에서 기존 가수 객체부터 찾자.
        Artist artist = artistList.get(artistName);
        // Set의 add는 add의 실행 결과를 boolean으로 리턴합니다. -> 중복이 발생했다면 객체가 추가되자 않고 false를 리턴.
        boolean flag = artist.getSongList().add(songName);
        return flag;
    }



    // 가수명을 전달받아 현재 등록된 가수인지의 여부를 리턴하는 기능
    public boolean isRegisted(String artistName) {
        return artistList.containsKey(artistName);
    }

    public static Map<String, Artist> getArtistList() {
        return artistList;
    }

    // 노래 목록을 찾아서 출력하는 기능
    public void showSongList(String artistName) {
        Set<String> sList = artistList.get(artistName).getSongList();
        for (String s : sList) {
            System.out.println("# "+artistName+"-"+ s);
        }
    }


    // 세이브 기능
    public void saveData() {
        // 폴더 경로는 Utility 클래스에 상수로 선언되어 있음.
        // 폴더가 실존하지 않는 경우 생성을 하고 세이브 파일을 생성해야 합니다.
        // 파일명은 song.sav로 진행합니다.
        File file = new File(FILE_PATH);
        if (!file.exists()){
            file.mkdirs();
        }
        try(FileOutputStream fos = new FileOutputStream("C:/MyWorkspace/music/song.sav")){
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(artistList);

        }catch (Exception e) {
            e.printStackTrace();
        }

    }

    // 로드 기능
    public void loadData() {
        // 세이브 파일이 존재하는지부터 체크합니다.
        // 존재한다면 로드를 진행새서 artistList에 할당합니다.
        File f = new File(FILE_PATH+"/song.sav");

        if(f.exists()){

            try(FileInputStream fis = new FileInputStream(FILE_PATH+"/song.sav")){
                ObjectInputStream ois = new ObjectInputStream(fis);

                artistList = (Map<String, Artist>) ois.readObject();

            }catch (Exception e){
                e.printStackTrace();
            }

        }else {
            System.out.println("\n# 기존 세이브 파일이 없습니다.\n세이브를 진행해주세요");
        }

    }
}
