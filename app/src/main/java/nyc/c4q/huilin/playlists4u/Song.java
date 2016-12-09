package nyc.c4q.huilin.playlists4u;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by huilin on 12/8/16.
 */
public class Song {


    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("artist")
    @Expose
    private String artist;
    @SerializedName("label")
    @Expose
    private Object label;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("playlist")
    @Expose
    private Object playlist;
    @SerializedName("artist_id")
    @Expose
    private String artistId;
    @SerializedName("status")
    @Expose
    private Object status;

    /**
     * @return The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return The artist
     */
    public String getArtist() {
        return artist;
    }

    /**
     * @param artist The artist
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * @return The label
     */
    public Object getLabel() {
        return label;
    }

    /**
     * @param label The label
     */
    public void setLabel(Object label) {
        this.label = label;
    }

    /**
     * @return The image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image The image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * @return The playlist
     */
    public Object getPlaylist() {
        return playlist;
    }

    /**
     * @param playlist The playlist
     */
    public void setPlaylist(Object playlist) {
        this.playlist = playlist;
    }

    /**
     * @return The artistId
     */
    public String getArtistId() {
        return artistId;
    }

    /**
     * @param artistId The artist_id
     */
    public void setArtistId(String artistId) {
        this.artistId = artistId;
    }

    /**
     * @return The status
     */
    public Object getStatus() {
        return status;
    }

    /**
     * @param status The status
     */
    public void setStatus(Object status) {
        this.status = status;
    }

}
