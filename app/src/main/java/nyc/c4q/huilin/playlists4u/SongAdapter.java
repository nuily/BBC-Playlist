package nyc.c4q.huilin.playlists4u;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by huilin on 12/8/16.
 */
public class SongAdapter extends RecyclerView.Adapter<SongViewHolder> {
    List<Song> songList;

    public SongAdapter(List<Song> songList) {
        this.songList = songList;
    }

    @Override
    public SongViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_song, parent, false);
        return new SongViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(SongViewHolder holder, int position) {
        Song mySong = songList.get(position);
        holder.bind(mySong);

    }

    @Override
    public int getItemCount() {
        return songList.size();
    }
}
