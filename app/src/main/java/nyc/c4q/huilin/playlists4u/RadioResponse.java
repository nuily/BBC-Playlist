package nyc.c4q.huilin.playlists4u;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by huilin on 12/8/16.
 */

public class RadioResponse {

    @SerializedName("playlist")
    @Expose
    private Playlist playlist;

    /**
     * @return The playlist
     */
    public Playlist getPlaylist() {
        return playlist;
    }

    /**
     * @param playlist The playlist
     */
    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }

}
