package API.pojo;

import java.util.List;

public class BreakingBad2Pojo {

    private String name;
    private String status;
    private String portrayed;
    private String category;
    private String nickname;
    private int char_id;
    private String birthday;
    private List<String> occupation;
    private String img;


    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public int getChar_id() {
        return char_id;
    }
    public void setChar_id(int char_id) {
        this.char_id = char_id;
    }
    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public List<String> getOccupation() {
        return occupation;
    }
    public void setOccupation(List<String> occupation) {
        this.occupation = occupation;
    }
    public String getImg() {
        return img;
    }
    public void setImg(String img) {
        this.img = img;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getPortrayed() {
        return portrayed;
    }
    public void setPortrayed(String portrayed) {
        this.portrayed = portrayed;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
}
