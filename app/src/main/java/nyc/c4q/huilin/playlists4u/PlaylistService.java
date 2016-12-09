package nyc.c4q.huilin.playlists4u;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by huilin on 12/8/16.
 */

public interface PlaylistService {

    @GET("radio1/playlist.json")
    Call<RadioResponse> getPlaylists();
}
