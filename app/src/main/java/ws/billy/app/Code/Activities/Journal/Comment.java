package ws.billy.app.Code.Activities.Journal;

public class Comment {

    public Comment(String prourl, String nm, String com){
        profileUrl = prourl;
        name = nm;
        comment = com;
    }

    public Comment(){

    }

    private String id;
    private String profileUrl;
    private String name;
    private String comment;
    private String time;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
