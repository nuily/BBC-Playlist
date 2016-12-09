package nyc.c4q.huilin.playlists4u;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by huilin on 12/8/16.
 */
public class SongViewHolder extends RecyclerView.ViewHolder{
    TextView artistNameView;
    TextView songTitleView;

    public SongViewHolder(View itemView) {
        super(itemView);
        artistNameView = (TextView) itemView.findViewById(R.id.artist);
        songTitleView = (TextView) itemView.findViewById(R.id.title);
    }

    public void bind(Song song) {
        artistNameView.setText(song.getArtist());
        songTitleView.setText(song.getTitle());

    }
}
