package nyc.c4q.huilin.playlists4u;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by huilin on 12/8/16.
 */

public class Playlist {

    @SerializedName("a")
    @Expose
    private List<Song> a = null;
    @SerializedName("b")
    @Expose
    private List<Song> b = null;
    @SerializedName("c")
    @Expose
    private List<Song> c = null;
    @SerializedName("inmwt")
    @Expose
    private List<Song> inmwt = null;
    @SerializedName("totd")
    @Expose
    private List<Song> totd = null;
    @SerializedName("introducing")
    @Expose
    private List<Song> introducing = null;

    public List<Song> getA() {
        return a;
    }

    public void setA(List<Song> a) {
        this.a = a;
    }

    public List<Song> getB() {
        return b;
    }

    public void setB(List<Song> b) {
        this.b = b;
    }

    public List<Song> getC() {
        return c;
    }

    public void setC(List<Song> c) {
        this.c = c;
    }

    public List<Song> getInmwt() {
        return inmwt;
    }

    public void setInmwt(List<Song> inmwt) {
        this.inmwt = inmwt;
    }

    public List<Song> getTotd() {
        return totd;
    }

    public void setTotd(List<Song> totd) {
        this.totd = totd;
    }

    public List<Song> getIntroducing() {
        return introducing;
    }

    public void setIntroducing(List<Song> introducing) {
        this.introducing = introducing;
    }
}
