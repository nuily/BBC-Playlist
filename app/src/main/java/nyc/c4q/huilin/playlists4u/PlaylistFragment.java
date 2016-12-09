package nyc.c4q.huilin.playlists4u;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by huilin on 12/8/16.
 */

public class PlaylistFragment extends Fragment {
    private static final String BBC_URL = "http://www.bbc.co.uk/";
    RecyclerView playlistAView;
    private List<Song> songList;
    private SongAdapter songAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View mRoot = inflater.inflate(R.layout.fragment_playlist, container, false);
        playlistAView = (RecyclerView) mRoot.findViewById(R.id.playlist_a);
        fetchPlaylist();
        playlistAView.setLayoutManager(new LinearLayoutManager(mRoot.getContext()));
        return mRoot;
    }

    private void fetchPlaylist() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BBC_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        PlaylistService service = retrofit.create(PlaylistService.class);
        Call<RadioResponse> call = service.getPlaylists();
        call.enqueue(new Callback<RadioResponse>() {
            @Override
            public void onResponse(Call<RadioResponse> call, Response<RadioResponse> response) {
                RadioResponse rr = response.body();
                Playlist ourPlaylist = rr.getPlaylist();
                songList = ourPlaylist.getA();

                songAdapter = new SongAdapter(songList);
                playlistAView.setAdapter(songAdapter);

            }

            @Override
            public void onFailure(Call<RadioResponse> call, Throwable t) {

            }
        });

        
    }
}
