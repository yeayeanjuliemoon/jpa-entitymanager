package entities;

import javax.persistence.*;

@Entity
@Table(name = "artist_cd")
public class Artist_Cd {

    @Id
    @GeneratedValue
    @Column(name = "cd_id")
    private Long cdId;

    @Column(name = "artist_id")
    private Long artistId;

    public Long getCdId() {
        return cdId;
    }

    public void setCdId(Long cdId) {
        this.cdId = cdId;
    }

    public Long getArtistId() {
        return artistId;
    }

    public void setArtistId(Long artistId) {
        this.artistId = artistId;
    }
}
